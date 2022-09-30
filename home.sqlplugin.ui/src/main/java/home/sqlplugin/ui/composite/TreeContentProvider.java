package home.sqlplugin.ui.composite;

import org.eclipse.jface.viewers.ITreeContentProvider;

import home.sqlplugin.parser.model.SqlNode;
import home.sqlplugin.parser.model.SqlNodeType;

public final class TreeContentProvider implements ITreeContentProvider {

    @Override
    public Object[] getElements(Object inputElement) {
        return getChildren(inputElement);
    }

    @Override
    public Object[] getChildren(Object parentElement) {
        SqlNode parentNode = (SqlNode) parentElement;

        if (parentNode.getType() == SqlNodeType.SELECT_IN_FROM) {
            return new Object[] { parentNode.getChild() };
        }
        return new Object[0];
    }

    @Override
    public Object getParent(Object element) {
        SqlNode infoNode = (SqlNode) element;

        if (infoNode.getParent() != null) {
            return infoNode.getParent();
        }
        return null;
    }

    @Override
    public boolean hasChildren(Object element) {
        SqlNode infoNode = (SqlNode) element;
        if (infoNode.getType() == SqlNodeType.SELECT_IN_FROM) {
            return true;
        }
        return false;
    }

}
