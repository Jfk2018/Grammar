public final class TreeEvaluationVisitor extends JfkGrammarBaseVisitor<Integer>
{
    @Override
    public Integer visitNumber(JfkGrammarParser.NumberContext ctx) throws IllegalArgumentException
    {
        try
        {
            return Main.parse(ctx.getText());
        }
        catch (java.text.ParseException e)
        {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Integer visitFirst_operation(JfkGrammarParser.First_operationContext ctx) throws IllegalArgumentException
    {
        Function<Integer, Integer, Integer> operand;
        switch(ctx.getRuleIndex())
        {
            case JfkGrammarParser.POW:
                operand = (a, b) -> (int)Math.pow(a, b);
                break;
            default:
                throw new IllegalArgumentException();
        }

        int left = visit(ctx.getChild(1));
        int right = visit(ctx.getChild(2));
        return operand.binary(left, right);
    }

    @Override
    public Integer visitSecond_operation(JfkGrammarParser.Second_operationContext ctx) throws IllegalArgumentException
    {
        Function<Integer, Integer, Integer> operand;
        switch(ctx.getRuleIndex())
        {
            case JfkGrammarParser.MUL:
                operand = (a, b) -> a * b;
                break;
            case JfkGrammarParser.DIV:
                operand = (a, b) -> a / b;
                break;
            default:
                throw new IllegalArgumentException();
        }

        int left = visit(ctx.getChild(1));
        int right = visit(ctx.getChild(2));
        return operand.binary(left, right);
    }

    @Override
    public Integer visitThird_operation(JfkGrammarParser.Third_operationContext ctx) throws IllegalArgumentException
    {
        Function<Integer, Integer, Integer> operand;
        switch(ctx.getRuleIndex())
        {
            case JfkGrammarParser.ADD:
                operand = (a, b) -> a + b;
                break;
            case JfkGrammarParser.SUB:
                operand = (a, b) -> a - b;
                break;
            default:
                throw new IllegalArgumentException();
        }

        int left = visit(ctx.getChild(1));
        int right = visit(ctx.getChild(2));
        return operand.binary(left, right);
    }
}