package ANTLR4;
// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ACDCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ACDCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ACDCParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ACDCParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#dss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDss(ACDCParser.DssContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStm(ACDCParser.StmContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(ACDCParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#dclp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclp(ACDCParser.DclpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(ACDCParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#expp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpp(ACDCParser.ExppContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#tr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTr(ACDCParser.TrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#trp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrp(ACDCParser.TrpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#ty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTy(ACDCParser.TyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ACDCParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(ACDCParser.ValContext ctx);
}