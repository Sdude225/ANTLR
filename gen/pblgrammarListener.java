// Generated from C:/Users/HP/Desktop/antlr-demo\pblgrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pblgrammarParser}.
 */
public interface pblgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pblgrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pblgrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pblgrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pblgrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(pblgrammarParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(pblgrammarParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration(pblgrammarParser.Array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration(pblgrammarParser.Array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(pblgrammarParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(pblgrammarParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#variable_value}.
	 * @param ctx the parse tree
	 */
	void enterVariable_value(pblgrammarParser.Variable_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#variable_value}.
	 * @param ctx the parse tree
	 */
	void exitVariable_value(pblgrammarParser.Variable_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(pblgrammarParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(pblgrammarParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(pblgrammarParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(pblgrammarParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#zone}.
	 * @param ctx the parse tree
	 */
	void enterZone(pblgrammarParser.ZoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#zone}.
	 * @param ctx the parse tree
	 */
	void exitZone(pblgrammarParser.ZoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#date_of_birth}.
	 * @param ctx the parse tree
	 */
	void enterDate_of_birth(pblgrammarParser.Date_of_birthContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#date_of_birth}.
	 * @param ctx the parse tree
	 */
	void exitDate_of_birth(pblgrammarParser.Date_of_birthContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#time_of_birth}.
	 * @param ctx the parse tree
	 */
	void enterTime_of_birth(pblgrammarParser.Time_of_birthContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#time_of_birth}.
	 * @param ctx the parse tree
	 */
	void exitTime_of_birth(pblgrammarParser.Time_of_birthContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(pblgrammarParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(pblgrammarParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pblgrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(pblgrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link pblgrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(pblgrammarParser.BoolContext ctx);
}