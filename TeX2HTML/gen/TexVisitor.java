// Generated from /home/samar/ITMO-2018-19/MT/MT3/src/Tex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code texT}
	 * labeled alternative in {@link TexParser#tex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexT(TexParser.TexTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqT}
	 * labeled alternative in {@link TexParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqT(TexParser.EqTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code endeqT}
	 * labeled alternative in {@link TexParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndeqT(TexParser.EndeqTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code supsubT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupsubT(TexParser.SupsubTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fracT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFracT(TexParser.FracTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrT(TexParser.BrTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryT(TexParser.UnaryTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivT(TexParser.MulDivTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subsupT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubsupT(TexParser.SubsupTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexT(TexParser.IndexTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code chooseT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChooseT(TexParser.ChooseTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubT(TexParser.AddSubTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrtT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtT(TexParser.SqrtTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomT}
	 * labeled alternative in {@link TexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomT(TexParser.AtomTContext ctx);
}