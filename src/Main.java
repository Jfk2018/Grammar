import java.io.*;
import java.nio.file.*;
import java.text.*;
import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.objectweb.asm.*;

import static java.lang.System.out;

public class Main {
    private static final DecimalFormat _format = new DecimalFormat();

    static {
        DecimalFormatSymbols _symbols = new DecimalFormatSymbols();
        _format.setDecimalFormatSymbols(_symbols);
    }

    static int parse(String text) throws ParseException {
        int myInt;
        if(text.charAt(0) == '0' && (text.charAt(1) == 'x' || text.charAt(1) == 'X'))
            myInt = Integer.parseInt(text.substring(2),16);
        else if(text.charAt(0) == '0' && (text.charAt(1) != 'x' || text.charAt(1) != 'X'))
            myInt = Integer.parseInt(text.substring(1),8);
        else
            myInt = Integer.parseInt(text,10);
        return myInt;
    }

    public static void main(String[] args) {
        String input;
        out.println("Key in the input string:");
        try (Scanner reader = new Scanner(System.in)) {
            input = reader.nextLine();
        }

        CharStream charStream = CharStreams.fromString(input);
        JfkGrammarLexer lexer = new JfkGrammarLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        JfkGrammarParser parser = new JfkGrammarParser(tokenStream);
        //parser.removeErrorListeners();
        parser.setBuildParseTree(true);
        ParseTree tree = parser.result();
        int errors = parser.getNumberOfSyntaxErrors();

        out.println("Number of syntax errors: " + errors);
        out.println(tree.toStringTree(parser));

        if (0 == errors) {
            TreeEvaluationVisitor visitor = new TreeEvaluationVisitor();
            int result = visitor.visit(tree);
            out.println("Result = " + result);

            // Synteza
            if (args.length > 0)
                compile(tree, args[0]);
            else
                compile(tree);
        }
    }

    private static void compile(ParseTree tree) {
        compile(tree, "Grammar/out/CompilationClass.class");
    }

    private static void compile(ParseTree tree, String classPath) {
        if (null == tree)
            throw new NullPointerException("parse tree cannot be null.");

        try {
            Path path = Paths.get(classPath);
            byte[] bytes = Files.readAllBytes(path);
            ClassReader cr = new ClassReader(bytes);
            //ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS); // no need to calculate visitMaxs(int maxStack, int maxLocals) arguments
            ClassWriter cw = new ClassWriter(cr, 0);
            cr.accept(new CompilationClassVisitor(cw, tree), 0);
            bytes = cw.toByteArray();
            Files.write(path, bytes);
        } catch (IOException e) {
            out.println("CompilationClass.class not found.");
        }
    }
}
