package Visitor;

import java.util.HashMap;

import org.antlr.v4.runtime.Token;

import ANTLR4.ACDCBaseVisitor;
import ANTLR4.ACDCParser.*;

public class TypeCheker extends ACDCBaseVisitor<String> {
	private HashMap<String,String> SymbolTable; 
	private String err;
	private String ok;
	private String TypeChekingResult;
	
	public TypeCheker() {
		super();
		this.SymbolTable = new HashMap<String, String>();
		this.err= "ERRORE";
		this.ok= "OK";
		this.TypeChekingResult="NON ESEGUITA";
	}


	
	public String getResult() {
		return TypeChekingResult;
	}

	public void setResult(String result) {
		this.TypeChekingResult = result;
	}
	
	public HashMap<String, String> getSymbolTable() {
		return SymbolTable;
	}

	public void setSymbolTable(HashMap<String, String> symbolTable) {
		SymbolTable = symbolTable;
	}
	
//////TypeCheker//////////////////////////////////////////////////////////////////////////////////////////	
	
	@Override
	public String visitProg(ProgContext ctx ) 
	{
		this.setResult(this.visitDss(ctx.dss()));
		return this.getResult();
	}


	@Override
	public String visitDss(DssContext ctx) 
	{
		String l=this.err;
		String r=this.err;
		if(ctx.dcl()!= null) 
		{
			l=this.visitDcl(ctx.dcl());
			r=this.visitDss(ctx.dss());
			if(l.equals(err) || r.equals(err) || l.equals(err) && r.equals(err)) {return err;}
			else {return ok;}
		}
		else if(ctx.stm()!=null) 
		{
			l=this.visitStm(ctx.stm());
			r=this.visitDss(ctx.dss());
			if(l.equals(err) || r.equals(err)|| l.equals(err) && r.equals(err)) {return err;}
			else {return ok;}
			
		}
		return ok;

	}
	
	@Override
	public String visitStm(StmContext ctx) 
	{
		String tyid = this.err;
		String exp = this.err;
		if(ctx.ASSIGN()!= null) 
		{
			if(this.SymbolTable.get(ctx.ID().getText())!= null) 
			{
				tyid=this.SymbolTable.get(ctx.ID().getText());
			}
			else 
			{
				System.err.println("Type Error:  Stm: '" + ctx.ID().getText() + " id non dichiarato");
				return err;
			}
			exp=this.visitExp(ctx.exp());	
			if(exp.equals(err)|| exp.equals("TYFLOAT") &&  tyid.equals("TYINT")) {
				System.err.println("Type Error:  Stm: tipi dicordanti");
				return err;}
		}
		else if(ctx.PRINT()!= null) 
		{
			System.out.println("Print:"+"Variable :"+ ctx.ID().getText());
		}
		return ok;
	}
	
	@Override
	public String visitDcl(DclContext ctx) 
	{
		String dclp= this.err;
		//Gestione Ty
		String ty= this.visitTy(ctx.ty());
		if(ty.equals(this.err)) {return this.err;}
		//Gestione ID
		if(this.SymbolTable.containsKey(ctx.ID().getText())) 
			{
				System.err.println("Type Error:  Id invalido: '" + ctx.ID().getText() + " è già stat dichiarato");
				return this.err;
			}
		this.SymbolTable.put(ctx.ID().getText(), ty);
		//Gestione Dclp
		dclp= this.visitDclp(ctx.dclp());
		if(dclp.equals(err)|| dclp.equals("TYFLOAT") &&  ty.equals("TYINT")) {
			System.err.println("Type Error:  Dcl: tipi discordanti");
			return err;}
		else if(dclp.equals(ty) || dclp.equals("TYINT") &&  ty.equals("TYFLOAT")|| dclp.equals(ok)) {return ok;}
		return ok;
	}
	
	@Override
	public String visitDclp(DclpContext ctx) 
	{
		if(ctx.ASSIGN() != null) 
		{
			return visitExp(ctx.exp());
		}
		return ok;
	}
	@Override
	public String visitExp(ExpContext ctx) 
	{
		String TyTr= this.err;
		String TyExpp= this.err;
		
		TyTr= this.visitTr(ctx.tr());
		if(ctx.expp()!=null) 
		{
			TyExpp=this.visitExpp(ctx.expp());
		}
		return TyTr;
	}
	@Override
	public String visitExpp(ExppContext ctx) 
	{
		
		String TyTr= null;
		String TyExpp;
		
		if(ctx.PLUS()!=null) 
		{
			TyTr=this.visitTr(ctx.tr());
		}
		else if(ctx.MINUS()!=null) 
		{
			TyTr=this.visitTr(ctx.tr());
		}
		
		if(ctx.expp()!= null) 
		{
			TyExpp=this.visitExpp(ctx.expp());
			
			if(TyExpp==null || TyExpp.equals(this.err)) {return TyTr;}
			if(!TyTr.equals(TyExpp)) 
			{
				System.err.println("Type Error:i tipi sono incoerenti: '" + TyTr + "' e '" + TyExpp + "'");
				return this.err;
			}
		}
		else 
		{//Gestione fine ricorsione
			return TyTr;
		}
		//gestione tutti gli altri casi

		return TyTr;
	}
	
	@Override
	public String visitTr(TrContext ctx)  
	{ 
		String TyVal= this.err;
		String TyTrp= this.err;
		
		TyVal= this.visitVal(ctx.val());
		if(ctx.trp()!=null) 
		{
			TyTrp=this.visitTrp(ctx.trp());
		}
		return TyVal;
	}

	@Override
	public String visitTrp(TrpContext ctx)  
	{
		String TyVal= this.err;
		String TyTrp= this.err;
		
		if(ctx.TIMES()!=null) 
		{
			TyVal=this.visitVal(ctx.val());
		}
		else if (ctx.DIV()!=null) 
		{
			TyVal=this.visitVal(ctx.val());
		}
		if(ctx.trp()!=null) 
		{
			TyTrp=  visitTrp(ctx.trp());
			if(TyTrp==null || TyTrp.equals(this.err)) {return TyVal;}
			//gestione tuuti gli altri casi
			if(!TyVal.equals(TyTrp)) 
			{
				System.err.println("Type Error: I tipi sono incoerenti: '" + TyVal + "'e'" + TyTrp + "'");
				return this.err;
			}
		}
		else 
		{//Gestione fino ricorsione
			return TyVal;
		}
	
		return TyVal;
	}
	
	@Override
	public String visitVal(ValContext ctx)  
	{
		String id=null;
        String valType=null;
        
        // Verifica il tipo di dato del valore
        if (ctx.ID() != null) {
        	Token token = ctx.ID().getSymbol();
        	id= ctx.ID().getText();
            if(this.SymbolTable.get(id)!=null) 
            {
            	valType = this.SymbolTable.get(id);
            }
            else 
            {
            	System.err.println("TypeError:"+ id +" a linea "+token.getLine()+ "in posizione"+token.getCharPositionInLine()+"non è stato inizializzato");
            }
                
        } else if (ctx.INT() != null) {
            valType = "TYINT";
        } else if (ctx.FLOAT() != null) {
            valType = "TYFLOAT";
        }
		return valType;
	}
	
	   @Override
	    public String visitTy(TyContext ctx) {
	        String ty = ctx.getText();
	        if(ty.equals("int")) 
	        {
	        	return "TYINT";
	        }
	        else if(ty.equals("float")) 
	        {
	        	return "TYFLOAT";
	        }
	        else if (!ty.equals("int") && !ty.equals("float")) {
	            System.err.println("Type Error:  data type invalido: '" + ty + "'");
	            ty = this.err; // Assume un tipo di default
	        }
	        
	        return ty;
	    }


}
