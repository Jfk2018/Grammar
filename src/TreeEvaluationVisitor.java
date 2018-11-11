public final class TreeEvaluationVisitor extends JfkGrammarBaseVisitor<Double>
{
    @Override
    public Double visitNumber(JfkGrammarParser.NumberContext ctx) throws IllegalArgumentException
    {
        try {
            return Main.parse(ctx.getText());
        } catch (java.text.ParseException e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Double visitOperation(JfkGrammarParser.OperationContext ctx) throws IllegalArgumentException
    {
        if (null == ctx.op) // '(' operation ')'
            return visit(ctx.operation(0));

        Function<Double, Double, Double> operand;
        switch(ctx.op.getType()) {
            case JfkGrammarParser.Multiply:
                operand = (a, b) -> a * b;
                break;
            case JfkGrammarParser.Divide:
                operand = (a, b) -> a / b;
                break;
            case JfkGrammarParser.Add:
                operand = (a, b) -> a + b;
                break;
            case JfkGrammarParser.Subtract:
                operand = (a, b) -> a - b;
                break;
            case JfkGrammarParser.Power:
                operand = Math::pow;
                break;
            case JfkGrammarParser.Max:
                operand = Math::max;
                break;
            case JfkGrammarParser.Min:
                operand = Math::min;
                break;
            default:
                throw new IllegalArgumentException();
        }

        double left = visit(ctx.getChild(1));
        double right = visit(ctx.getChild(2));
        return operand.binary(left, right);
    }
}
