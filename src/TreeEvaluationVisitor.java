public final class TreeEvaluationVisitor extends JfkGrammarBaseVisitor<Integer> {

    public Integer visitExpression(JfkGrammarParser.ExpressionContext ctx) throws IllegalArgumentException {
        if (null == ctx.op) // number
        {
            try {
                return Main.parse(ctx.getText());
            } catch (java.text.ParseException e) {
                throw new IllegalArgumentException();
            }
        }

        Function<Integer, Integer, Integer> operand;
        switch(ctx.op.getType()) {
            case JfkGrammarParser.MUL:
                operand = (a, b) -> a * b;
                break;
            case JfkGrammarParser.DIV:
                operand = (a, b) -> a / b;
                break;
            case JfkGrammarParser.ADD:
                operand = (a, b) -> a + b;
                break;
            case JfkGrammarParser.SUB:
                operand = (a, b) -> a - b;
                break;
            case JfkGrammarParser.POW:
                operand = (a, b) -> (int)Math.pow(a, b);
                break;
            case JfkGrammarParser.MOD:
                operand = (a, b) -> a % b;
                break;
            case JfkGrammarParser.LP:
                return visit(ctx.expression(0));
            case JfkGrammarParser.RP:
                return visit(ctx.expression(0));
            default:
                throw new IllegalArgumentException();
        }

        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));
        return operand.binary(left, right);
    }
}
