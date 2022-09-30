package home;

import java.nio.file.Path;
import java.nio.file.Paths;

import home.sqlplugin.parser.SqlFileParser;
import home.sqlplugin.parser.model.SqlNode;

public final class Main {

    public static void main(String[] args) {
        try {
            Path path = Paths.get("example.sql");
            SqlNode sqlNode = new SqlFileParser().parse(path);
            System.out.println(sqlNode);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
