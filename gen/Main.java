import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("C:\\Users\\HP\\Desktop\\test12.txt");

            pblgrammarLexer lexer = new pblgrammarLexer(input);
            pblgrammarParser parser = new pblgrammarParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListener());

            parser.program();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
