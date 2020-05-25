import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.*;

public class MyListener extends pblgrammarBaseListener {
    public HashMap<String, List<String>> variable;

    public MyListener() {
        variable = new HashMap<>();
    }

    @Override
    public void exitVariable_declaration(pblgrammarParser.Variable_declarationContext ctx) {
        int i = 0;
        String decType = "";
        String tmp = ctx.variable_value().getText();
        while(tmp.charAt(i) != '(') {
            decType += tmp.charAt(i);
            i++;
        }

        switch (decType) {
            case "snapshot":
                List<String> values = new ArrayList<String>();
                values.add(ctx.variable_value().date_of_birth().DIGIT(1).getText());
                values.add(ctx.variable_value().date_of_birth().DIGIT(0).getText());
                values.add(ctx.variable_value().date_of_birth().DIGIT(2).getText());
                String tmp1 = ctx.variable_value().time_of_birth().DIGIT(0).getText();
                tmp1 += ':';
                tmp1 += ctx.variable_value().time_of_birth().DIGIT(1).getText();
                values.add(tmp1);
                values.add(ctx.variable_value().zone().STRING().getText());
                values.add(ctx.variable_value().location().DEG(0).getText());
                values.add(ctx.variable_value().location().DEG(1).getText());
                variable.put(ctx.variable_name().STRING().getText(), values);
                break;

            case "getSnapChart":
                String tmp2 = ctx.variable_value().function_parameters().getText();
                List<String> funtionCallParam = variable.get(tmp2);
                String command = "astrolog -q";
                for(int j = 0; j < funtionCallParam.size(); ++j) {
                    command += ' ' + funtionCallParam.get(j);
                }
                command += " -E";
                //var a = snapshot(day:31, month:12, year:2012, 14:45, EET, 12E32, 14N26)
                try {
                    FileWriter writer = new FileWriter("C:\\Users\\HP\\Desktop\\output.txt");
                    PrintWriter printWriter = new PrintWriter(writer);
                    final Process process = Runtime.getRuntime().exec("cmd /c cd C:\\Users\\HP\\Desktop\\astr && " + command);
                    final InputStream in = process.getInputStream();
                    int ch;
                    while((ch = in.read()) != -1) {
                        printWriter.print((char)ch);
                    }
                    printWriter.close();
                    File myFile = new File("C:\\Users\\HP\\Desktop\\output.txt");
                    Scanner scanner = new Scanner(myFile);
                    List<String> lines = new ArrayList<>();

                    while(scanner.hasNextLine()) {
                        lines.add(scanner.nextLine());
                    }
                    scanner.close();
                    lines.remove(0);
                    int k;
                    for(k = 15; k < lines.size();) {
                        lines.remove(k);
                    }
                    for(i = 0; i < lines.size(); ++i) {
                        System.out.println(lines.get(i));
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Helou");
                break;
        }

    }

    @Override
    public void exitPrint_statement(pblgrammarParser.Print_statementContext ctx) {
    }
}
