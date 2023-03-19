// Generated from ACDC.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ACDCParser}.
 */
public interface ACDCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ACDCParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(@NotNull ACDCParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(@NotNull ACDCParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#trp}.
	 * @param ctx the parse tree
	 */
	void enterTrp(@NotNull ACDCParser.TrpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#trp}.
	 * @param ctx the parse tree
	 */
	void exitTrp(@NotNull ACDCParser.TrpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#dss}.
	 * @param ctx the parse tree
	 */
	void enterDss(@NotNull ACDCParser.DssContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#dss}.
	 * @param ctx the parse tree
	 */
	void exitDss(@NotNull ACDCParser.DssContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#ty}.
	 * @param ctx the parse tree
	 */
	void enterTy(@NotNull ACDCParser.TyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#ty}.
	 * @param ctx the parse tree
	 */
	void exitTy(@NotNull ACDCParser.TyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(@NotNull ACDCParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(@NotNull ACDCParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull ACDCParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull ACDCParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#expp}.
	 * @param ctx the parse tree
	 */
	void enterExpp(@NotNull ACDCParser.ExppContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#expp}.
	 * @param ctx the parse tree
	 */
	void exitExpp(@NotNull ACDCParser.ExppContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterStm(@NotNull ACDCParser.StmContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitStm(@NotNull ACDCParser.StmContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#dclp}.
	 * @param ctx the parse tree
	 */
	void enterDclp(@NotNull ACDCParser.DclpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#dclp}.
	 * @param ctx the parse tree
	 */
	void exitDclp(@NotNull ACDCParser.DclpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ACDCParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ACDCParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACDCParser#tr}.
	 * @param ctx the parse tree
	 */
	void enterTr(@NotNull ACDCParser.TrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACDCParser#tr}.
	 * @param ctx the parse tree
	 */
	void exitTr(@NotNull ACDCParser.TrContext ctx);
}