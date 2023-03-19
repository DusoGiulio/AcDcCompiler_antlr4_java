package ANTLR4;
// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ACDCParser}.
 */
public interface ACDCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ACDCParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ACDCParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ACDCParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#dss}.
	 * @param ctx the parse tree
	 */
	void enterDss(ACDCParser.DssContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#dss}.
	 * @param ctx the parse tree
	 */
	void exitDss(ACDCParser.DssContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStm(ACDCParser.StmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStm(ACDCParser.StmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(ACDCParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(ACDCParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#dclp}.
	 * @param ctx the parse tree
	 */
	void enterDclp(ACDCParser.DclpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#dclp}.
	 * @param ctx the parse tree
	 */
	void exitDclp(ACDCParser.DclpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ACDCParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ACDCParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#expp}.
	 * @param ctx the parse tree
	 */
	void enterExpp(ACDCParser.ExppContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#expp}.
	 * @param ctx the parse tree
	 */
	void exitExpp(ACDCParser.ExppContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#tr}.
	 * @param ctx the parse tree
	 */
	void enterTr(ACDCParser.TrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#tr}.
	 * @param ctx the parse tree
	 */
	void exitTr(ACDCParser.TrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#trp}.
	 * @param ctx the parse tree
	 */
	void enterTrp(ACDCParser.TrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#trp}.
	 * @param ctx the parse tree
	 */
	void exitTrp(ACDCParser.TrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#ty}.
	 * @param ctx the parse tree
	 */
	void enterTy(ACDCParser.TyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#ty}.
	 * @param ctx the parse tree
	 */
	void exitTy(ACDCParser.TyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(ACDCParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(ACDCParser.ValContext ctx);
}