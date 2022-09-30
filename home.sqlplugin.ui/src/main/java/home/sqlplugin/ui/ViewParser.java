package home.sqlplugin.ui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import home.sqlplugin.ui.composite.SqlParsingViewer;

public class ViewParser extends ViewPart {

    private SqlParsingViewer sqlParsingViewer;

    @Override
    public void createPartControl(Composite parent) {
        sqlParsingViewer = SqlParsingViewer.create(parent);
    }

    @Override
    public void setFocus() {
        sqlParsingViewer.setFocusOnButton();
    }
}
