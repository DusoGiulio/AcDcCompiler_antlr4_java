package Visitor;

import org.antlr.v4.runtime.*;

import ANTLR4.*;
import ANTLR4.ACDCParser.ProgContext;



public class ASTTest {
	public static void main(String[] args) {
	//creo un char stream, posso inserire siaun file di testo che una stringa	
	CharStream input = new  ANTLRInputStream("float a = 3;"
			+ "float b=2.0;\n float c= a*b+5;"
			+ "c=2.0; ");
	//creo uno scanner utilizzando il lexer generato automaticamente da ANTLR4
	ACDCLexer lexer = new ACDCLexer(input);
	//creo una sequenza di token usando lo scanner
	CommonTokenStream tokens = new CommonTokenStream(lexer);
    tokens.fill();
    //Creo un parser usando il parser di ANTLR immettendo la sequenza dei token
	ACDCParser parser = new ACDCParser(tokens);
    // creo un albero di parsing partendo dal nodo prog che è il nodo di partenza della grammatica
    ProgContext p= parser.prog();
    //istanzio un nuovo visitor
    TypeCheker visitor= new TypeCheker();
    //eseguo la visita sull'albero
    System.out.println(visitor.visitProg(p));
	}
}
