import org.antlr.v4.runtime.tree.TerminalNode;

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
