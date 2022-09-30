package home.sqlplugin.parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import home.sqlplugin.parser.antlr.SqlLexer;
import home.sqlplugin.parser.antlr.SqlParser;
import home.sqlplugin.parser.antlr.SqlParser.From_itemContext;
import home.sqlplugin.parser.antlr.SqlParser.Select_stmtContext;
import home.sqlplugin.parser.antlr.SqlParser.SqlContext;
import home.sqlplugin.parser.model.SqlNode;
import home.sqlplugin.parser.model.SqlNodeType;

public final class SqlFileParser {

    public SqlNode parse(Path file) {
        SqlContext sqlCtx = parseToRuleCtx(file);
        Select_stmtContext selectStmtCtx = sqlCtx.query().select_stmt();
        return createAndFillSqlNode(selectStmtCtx);
    }

    private SqlContext parseToRuleCtx(Path file) {
        try (InputStream inputStream = Files.newInputStream(file)) {
            SqlLexer lexer = new SqlLexer(CharStreams.fromStream(inputStream));
            SqlParser parser = new SqlParser(new CommonTokenStream(lexer));
            return parser.sql();
        } catch (IOException e) {
            throw new IllegalStateException("File read exeption: " + file, e);
        }
    }

    private SqlNode createAndFillSqlNode(Select_stmtContext selectStmtCtx) {
        SqlNode parent = SqlNode.create(null, SqlNode.FIRST_NODE_NAME, SqlNodeType.SELECT_IN_FROM);
        processingCtxAndAddResultToParent(selectStmtCtx, parent, getNodeName(selectStmtCtx));
        return parent;
    }

    private void processingCtxAndAddResultToParent(Select_stmtContext selectStmtCtx, SqlNode parent, String nodeName) {
        From_itemContext fromItemCtx = selectStmtCtx.from_item();

        if (fromItemCtx.select_stmt() != null) {
            SqlNode selNode = SqlNode.create(parent, nodeName, SqlNodeType.SELECT_IN_FROM);
            Select_stmtContext subSelectCtx = fromItemCtx.select_stmt();
            processingCtxAndAddResultToParent(subSelectCtx, selNode, getNodeName(subSelectCtx));
        } else if (fromItemCtx.table_name() != null) {
            SqlNode.create(parent, nodeName, SqlNodeType.TABLE_IN_FROM);
        }
    }

    private String getNodeName(Select_stmtContext selectStmtCxt) {
        From_itemContext fromItemCtx = selectStmtCxt.from_item();

        if (fromItemCtx.select_stmt() != null) {
            return "sel_" + fromItemCtx.alias().getText();
        } else if (fromItemCtx.table_name() != null) {
            return "tab_" + fromItemCtx.table_name().getText() + "_" + fromItemCtx.alias().getText();
        }

        throw new IllegalStateException("Node name getting error.");
    }
}
