// Generated from /home/samar/ITMO-2018-19/MT/MT3/src/Tex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TexParser}.
 */
public interface TexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code texT}
	 * labeled alternative in {@link TexParser#tex}.
	 * @param ctx the parse tree
	 */
	void enterTexT(TexParser.TexTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code texT}
	 * labeled alternative in {@link TexParser#tex}.
	 * @param ctx the parse tree
	 */
	void exitTexT(TexParser.TexTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqT}
	 * labeled alternative in {@link TexParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEqT(TexParser.EqTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqT}
	 * labeled alternative in {@link TexParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEqT(TexParser.EqTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endeqT}
	 * labeled alternative in {@link TexParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEndeqT(TexParser.EndeqTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endeqT}
	 * labeled alternative in {@link TexParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEndeqT(TexParser.EndeqTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code supsubT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSupsubT(TexParser.SupsubTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code supsubT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSupsubT(TexParser.SupsubTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fracT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFracT(TexParser.FracTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fracT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFracT(TexParser.FracTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBrT(TexParser.BrTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBrT(TexParser.BrTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryT(TexParser.UnaryTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryT(TexParser.UnaryTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivT(TexParser.MulDivTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivT(TexParser.MulDivTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subsupT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubsupT(TexParser.SubsupTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subsupT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubsupT(TexParser.SubsupTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexT(TexParser.IndexTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexT(TexParser.IndexTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code chooseT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterChooseT(TexParser.ChooseTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code chooseT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitChooseT(TexParser.ChooseTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubT(TexParser.AddSubTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubT(TexParser.AddSubTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrtT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSqrtT(TexParser.SqrtTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrtT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSqrtT(TexParser.SqrtTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomT(TexParser.AtomTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomT(TexParser.AtomTContext ctx);
}