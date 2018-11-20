// Generated from C:/Users/Konrad/IdeaProjects/stock_tree/Grammar.IntelliJIdea/Grammar\JfkGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JfkGrammarParser}.
 */
public interface JfkGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JfkGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(JfkGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JfkGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(JfkGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JfkGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JfkGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JfkGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JfkGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JfkGrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(JfkGrammarParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link JfkGrammarParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(JfkGrammarParser.ResultContext ctx);
}