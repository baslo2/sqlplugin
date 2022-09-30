package home.sqlplugin.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import home.sqlplugin.parser.model.SqlNode;
import home.sqlplugin.parser.model.SqlNodeType;

final class SqlFileParserTest {

    private static final String FILE_NAME = "example.sql";

    @Test
    void parserTest() throws URISyntaxException {
        SqlNode expected = getExpected();

        Path path = Paths.get(getClass().getResource(FILE_NAME).toURI()).toAbsolutePath();
        SqlNode actual = new SqlFileParser().parse(path);

        assertEquals(expected, actual);
    }

    private SqlNode getExpected() {
        SqlNode expected = SqlNode.create(null, SqlNode.FIRST_NODE_NAME, SqlNodeType.SELECT_IN_FROM);
        SqlNode selT = SqlNode.create(expected, "sel_t", SqlNodeType.SELECT_IN_FROM);
        SqlNode selP = SqlNode.create(selT, "sel_p", SqlNodeType.SELECT_IN_FROM);
        SqlNode.create(selP, "tab_public.some_table_k", SqlNodeType.TABLE_IN_FROM);

        return expected;
    }
}
