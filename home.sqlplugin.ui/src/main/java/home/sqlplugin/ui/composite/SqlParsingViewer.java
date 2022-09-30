package home.sqlplugin.ui.composite;

import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import home.sqlplugin.parser.SqlFileParser;
import home.sqlplugin.parser.model.SqlNode;

public final class SqlParsingViewer {

    private final Composite parent;

    private Composite buttonPanel;
    private Composite treePanel;
    private Composite textPanel;

    private Button btnOpen;
    private CheckboxTreeViewer treeViewer;
    private Text text;

    private final List<SqlNode> selectedSqlNodes = new LinkedList<>();

    private SqlParsingViewer(Composite parent) {
        this.parent = parent;
    }

    public static SqlParsingViewer create(Composite parent) {
        var sqlParsingViewer = new SqlParsingViewer(parent);
        sqlParsingViewer.builderViewer();
        return sqlParsingViewer;
    }

    private void builderViewer() {
        configParentComposite();
        createPanels();
        createPanelsElemets();
    }

    private void configParentComposite() {
        parent.setLayout(new GridLayout(2, false));
        setBackgroundColor(parent, Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GRAY));
    }

    private void setBackgroundColor(Composite parent, Color color) {
        parent.setBackground(color);
        color.dispose();
    }

    private void createPanels() {
        buttonPanel = createPanel(parent,
                new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1),
                new GridLayout(2, false),
                new Color(parent.getDisplay(), 250, 155, 100));

        treePanel = createPanel(parent,
                new GridData(SWT.FILL, SWT.FILL, true, true),
                new GridLayout(),
                Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));

        textPanel = createPanel(parent,
                new GridData(SWT.FILL, SWT.FILL, true, true),
                new GridLayout(),
                Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
    }

    private Composite createPanel(Composite parent, GridData gridData, GridLayout gridLayout, Color systemColor) {
        var panel = new Composite(parent, SWT.NONE);

        panel.setLayoutData(gridData);
        panel.setLayout(gridLayout);
        return panel;
    }

    private void createPanelsElemets() {
        new Label(buttonPanel, SWT.LEFT).setText("Open Sql file ->");
        createButton();
        createTree();
        createText();
    }

    private void createButton() {
        btnOpen = new Button(buttonPanel, SWT.PUSH);
        btnOpen.setText("Open");
        btnOpen.setLayoutData(new GridData(80, 30));

        btnOpen.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent event) {
                var dialog = new FileDialog(parent.getShell(), SWT.OPEN);

                var filterNames = new String[] { "SQL", "All files (*)" };

                var filterExtensions = new String[] { "*.sql", "*" };

                dialog.setFilterNames(filterNames);
                dialog.setFilterExtensions(filterExtensions);

                String path = dialog.open();

                if (path != null) {
                    text.setText("");

                    SqlNode sqlNode = new SqlFileParser().parse(Paths.get(path));

                    treeViewer.setInput(sqlNode);
                    treeViewer.expandAll();
                }
            }
        });
    }

    private void createTree() {
        treeViewer = new CheckboxTreeViewer(treePanel,
                SWT.FILL | SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);

        Tree tree = treeViewer.getTree();
        tree.setHeaderVisible(true);
        tree.setLinesVisible(true);

        addColumn(treeViewer, "Name", 200, SWT.LEFT,
                element -> ((SqlNode) element).getName());
        addColumn(treeViewer, "Type", 120, SWT.RIGHT,
                element -> ((SqlNode) element).getType().toString());

        treeViewer.setContentProvider(new TreeContentProvider());

        treeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

        treeViewer.addCheckStateListener(event -> {
            var selectedSqlNode = (SqlNode) event.getElement();

            if (event.getChecked()) {
                selectedSqlNodes.add(selectedSqlNode);
            } else {
                selectedSqlNodes.remove(selectedSqlNode);
            }

            var sb = new StringBuilder();

            if (!selectedSqlNodes.isEmpty()) {
                for (SqlNode node : selectedSqlNodes) {
                    sb.append('[').append(node.getType()).append(']')
                            .append(' ').append(node.getName())
                            .append("\n");
                }
            } else {
                sb.append("Empty");
            }

            text.setText(sb.toString());
        });
    }

    private void addColumn(CheckboxTreeViewer treeViewer, String name,
            int widht, int style, Function<Object, String> elementTextGetter) {
        var treeViewerCol = new TreeViewerColumn(treeViewer, style);

        TreeColumn treeCol = treeViewerCol.getColumn();
        treeCol.setText(name);
        treeCol.setWidth(widht);
        treeCol.setAlignment(SWT.LEFT);

        treeViewerCol.setLabelProvider(new ColumnLabelProvider() {

            @Override
            public String getText(Object element) {
                return elementTextGetter.apply(element);
            }
        });
    }

    private void createText() {
        text = new Text(textPanel, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
        text.setLayoutData(new GridData(GridData.FILL_BOTH));
        text.setText("Empty");
    }

    public void setFocusOnButton() {
        btnOpen.setFocus();
    }
}
