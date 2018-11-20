// Generated from C:/Users/Konrad/IdeaProjects/stock_tree/Grammar.IntelliJIdea/Grammar\JfkGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JfkGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JfkGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JfkGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(JfkGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JfkGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JfkGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JfkGrammarParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(JfkGrammarParser.ResultContext ctx);
}