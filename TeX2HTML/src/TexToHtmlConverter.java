
import org.antlr.v4.runtime.*;


public class TexToHtmlConverter {

    public static String solv(String str) {

        CharStream inputStream = CharStreams.fromString(str);
        TexLexer lexer = new TexLexer(inputStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        TexParser parser = new TexParser(tokenStream);
        TexParser.TexContext ctx = parser.tex();
        Visitor sol = new Visitor();
        String ans = sol.visit(ctx);
        return ans;
    }




}