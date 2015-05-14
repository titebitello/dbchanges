package dbchanges.factory;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","dbchanges_owner","dbchanges");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
