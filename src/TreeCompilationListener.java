import org.objectweb.asm.*;

import java.text.ParseException;

public final class TreeCompilationListener extends JfkGrammarBaseListener
{
    private final MethodVisitor _mv;
    private int _currentTreeDepth, _maxTreeDepth;

    public int getTreeDepth(){
        return this._maxTreeDepth;
    }

    public TreeCompilationListener(MethodVisitor mv) {
        this._mv = mv;
    }

    @Override
    public void enterExpression(JfkGrammarParser.ExpressionContext ctx)
    {
        this._currentTreeDepth = 0;
        this._maxTreeDepth = 0;
    }

    @Override
    public void enterNumber(JfkGrammarParser.NumberContext ctx)
    {
        this._currentTreeDepth++;
        if (this._currentTreeDepth > this._maxTreeDepth)
            this._maxTreeDepth = this._currentTreeDepth;

        try {
            this._mv.visitLdcInsn(Main.parse(ctx.getText()));
        } catch (ParseException e) {
            throw new IllegalArgumentException("Number is not of the double type.");
        }
    }

    @Override
    public void exitFirst_operation(JfkGrammarParser.First_operationContext ctx)
    {
        switch(ctx.getRuleIndex())
        {
            case JfkGrammarParser.POW:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "pow", "(DD)D", false);
                break;
            default:
                throw new IllegalArgumentException();
        }
        this._currentTreeDepth--;
    }

    @Override
    public void exitSecond_operation(JfkGrammarParser.Second_operationContext ctx)
    {
        switch(ctx.getRuleIndex())
        {
            case JfkGrammarParser.MUL:
                this._mv.visitInsn(Opcodes.DMUL);
                break;
            case JfkGrammarParser.DIV:
                this._mv.visitInsn(Opcodes.DDIV);
                break;
            case JfkGrammarParser.POW:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "pow", "(DD)D", false);
                break;
            default:
                throw new IllegalArgumentException();
        }
        this._currentTreeDepth--;
    }

    @Override
    public void exitThird_operation(JfkGrammarParser.Third_operationContext ctx)
    {
        switch(ctx.getRuleIndex())
        {
            case JfkGrammarParser.ADD:
                this._mv.visitInsn(Opcodes.DADD);
                break;
            case JfkGrammarParser.SUB:
                this._mv.visitInsn(Opcodes.DSUB);
                break;

            default:
                throw new IllegalArgumentException();
        }
        this._currentTreeDepth--;
    }
}
