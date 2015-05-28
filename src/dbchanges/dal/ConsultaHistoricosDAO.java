package dbchanges.dal;

import dbchanges.dtl.ConsultaHistoricosDTO;
import dbchanges.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaHistoricosDAO {

    private Connection connection;

    public ConsultaHistoricosDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void atualizaComboBox(ConsultaHistoricosDTO projeto) {
        Statement stmt = null;
        int id = 0;
        try {
            String sql_select = "SELECT PRJ_NOME FROM PROJETO ORDER BY PRJ_NOME ";
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql_select);
            
            if (rs.next()) {
                id = rs.getInt(1);
            }
            stmt.close();
            rs.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
