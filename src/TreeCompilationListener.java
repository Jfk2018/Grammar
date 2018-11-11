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
    public void exitOperation(JfkGrammarParser.OperationContext ctx) {
        if (null == ctx.op) // '(' operation ')'
            return;
        switch(ctx.op.getType()) {
            case JfkGrammarParser.Multiply:
                this._mv.visitInsn(Opcodes.DMUL);
                break;
            case JfkGrammarParser.Divide:
                this._mv.visitInsn(Opcodes.DDIV);
                break;
            case JfkGrammarParser.Add:
                this._mv.visitInsn(Opcodes.DADD);
                break;
            case JfkGrammarParser.Subtract:
                this._mv.visitInsn(Opcodes.DSUB);
                break;
            case JfkGrammarParser.Power:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "pow", "(DD)D", false);
                break;
            case JfkGrammarParser.Max:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "max", "(DD)D", false);
                break;
            case JfkGrammarParser.Min:
                this._mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Math", "min", "(DD)D", false);
                break;
            default:
                throw new IllegalArgumentException();
        }
        this._currentTreeDepth--;
    }
}
