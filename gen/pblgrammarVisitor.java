// Generated from C:/Users/HP/Desktop/antlr-demo\pblgrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pblgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pblgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(pblgrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(pblgrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(pblgrammarParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration(pblgrammarParser.Array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(pblgrammarParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#variable_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_value(pblgrammarParser.Variable_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(pblgrammarParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(pblgrammarParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#zone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZone(pblgrammarParser.ZoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#date_of_birth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_of_birth(pblgrammarParser.Date_of_birthContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#time_of_birth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_of_birth(pblgrammarParser.Time_of_birthContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(pblgrammarParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pblgrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(pblgrammarParser.BoolContext ctx);
}