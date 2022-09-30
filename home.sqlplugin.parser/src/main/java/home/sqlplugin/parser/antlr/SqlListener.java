// Generated from java-escape by ANTLR 4.11.1
package home.sqlplugin.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(SqlParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(SqlParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(SqlParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(SqlParser.ColContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#from_item}.
	 * @param ctx the parse tree
	 */
	void enterFrom_item(SqlParser.From_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#from_item}.
	 * @param ctx the parse tree
	 */
	void exitFrom_item(SqlParser.From_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SqlParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SqlParser.Table_nameContext ctx);
}