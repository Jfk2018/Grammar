// Generated from C:/Users/damia/Desktop/jfkTest/Grammar\JfkGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JfkGrammarParser}.
 */
public interface JfkGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JfkGrammarParser#first_operation}.
	 * @param ctx the parse tree
	 */
	void enterFirst_operation(JfkGrammarParser.First_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JfkGrammarParser#first_operation}.
	 * @param ctx the parse tree
	 */
	void exitFirst_operation(JfkGrammarParser.First_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JfkGrammarParser#second_operation}.
	 * @param ctx the parse tree
	 */
	void enterSecond_operation(JfkGrammarParser.Second_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JfkGrammarParser#second_operation}.
	 * @param ctx the parse tree
	 */
	void exitSecond_operation(JfkGrammarParser.Second_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JfkGrammarParser#third_operation}.
	 * @param ctx the parse tree
	 */
	void enterThird_operation(JfkGrammarParser.Third_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JfkGrammarParser#third_operation}.
	 * @param ctx the parse tree
	 */
	void exitThird_operation(JfkGrammarParser.Third_operationContext ctx);
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