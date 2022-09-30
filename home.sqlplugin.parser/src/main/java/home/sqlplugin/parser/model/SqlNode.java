package home.sqlplugin.parser.model;

import java.util.Objects;

public class SqlNode {

    public static final String FIRST_NODE_NAME = "tree";

    private final SqlNode parent;
    private SqlNode child;

    private final String name;

    private final SqlNodeType type;

    private SqlNode(SqlNode parent, String name, SqlNodeType type) {
        this.parent = parent;
        this.name = name;
        this.type = type;
    }

    /**
     * Create SqlNode with checking its parameters and adding created SqlNode to the
     * parent SqlNode, if it exists
     *
     * @param parent - parent node for new SqlNode object
     * @param name   - name for new SqlNode object
     * @param type   - type of new SqlNode object
     *
     * @return SqlNode object
     */
    public static SqlNode create(SqlNode parent, String name, SqlNodeType type) {
        checkParam(parent, name);

        SqlNode node = new SqlNode(parent, name, type);

        if (parent != null) {
            parent.setChild(node);
        }

        return node;
    }

    private static void checkParam(SqlNode parent, String name) {
        if (FIRST_NODE_NAME.equals(name)) {
            return;
        }

        if (parent == null) {
            throw new IllegalArgumentException("parent is null for " + name);
        }

        if (parent.getType() != SqlNodeType.SELECT_IN_FROM) {
            throw new IllegalArgumentException("parent '" + parent.getName()
                    + "' can't be: " + parent.getType());
        }
    }

    public SqlNode getParent() {
        return parent;
    }

    public SqlNode getChild() {
        return child;
    }

    public void setChild(SqlNode child) {
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public SqlNodeType getType() {
        return type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(child,
                name,
                // "parent" commented because of stack overflow in UI
                // parent,
                type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SqlNode other = (SqlNode) obj;
        return Objects.equals(child, other.child)
                && Objects.equals(name, other.name)
                // "parent" commented because of stack overflow in UI
                // && Objects.equals(parent, other.parent)
                && type == other.type;
    }

    @Override
    public String toString() {
        return toStringWithOffset(0);
    }

    private String toStringWithOffset(int counter) {
        StringBuilder sb = new StringBuilder();
        sb.append(offsetString(counter));
        if (parent != null) {
            sb.append("parent '" + parent.getName() + "': ");
        } else {
            sb.append("parent 'null': ");
        }
        sb.append(name).append(" [").append(type).append("]\n");
        if (child != null) {
            sb.append(child.toStringWithOffset(++counter));
        }
        return sb.toString();
    }

    private String offsetString(int counter) {
        var sb = new StringBuilder();
        for (int i = 0; counter > i; i++) {
            sb.append("    ");
        }
        return sb.toString();
    }
}
