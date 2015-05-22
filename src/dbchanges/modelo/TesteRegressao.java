package dbchanges.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.management.Query;
import java.sql.ResultSetMetaData;
import java.util.HashMap;

public class TesteRegressao {
    private Connection connection;
    private ResultSet rs;
    
    public List getLista() throws SQLException {
        PreparedStatement sql = connection.prepareStatement("select linhas from historico");
        rs = sql.executeQuery();

        List lista = new ArrayList();

        ResultSetMetaData meta = rs.getMetaData();

        while (rs.next()) {
            HashMap reg = new HashMap();

            for (int i = 0; i < meta.getColumnCount(); i++) {
                reg.put(meta.getColumnName(i), rs.getString(i));
            }

            lista.add(
                    reg
            );
        }
        return lista;

    }
}
