package home.sqlplugin.parser.model;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

final class SqlNodeTest {

    @Test
    void nodeWithNullParentTest() {
        assertThrows(IllegalArgumentException.class,
                () -> SqlNode.create(null, "test_parent_null", SqlNodeType.SELECT_IN_FROM));
    }

    @Test
    void nodeWithIncorrectParentType() {
        var parent = SqlNode.create(null, SqlNode.FIRST_NODE_NAME, SqlNodeType.TABLE_IN_FROM);
        assertThrows(IllegalArgumentException.class,
                () -> SqlNode.create(parent, "test_table_parent", SqlNodeType.TABLE_IN_FROM));
    }

    @Test
    void nodeWithCorrectFillingTest() {
        var parent = SqlNode.create(null, SqlNode.FIRST_NODE_NAME, SqlNodeType.SELECT_IN_FROM);
        assertDoesNotThrow(() -> SqlNode.create(parent, "test_correct", SqlNodeType.SELECT_IN_FROM));
    }
}
