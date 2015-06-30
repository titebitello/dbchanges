package dbchanges.dal;

import dbchanges.dtl.ConsultaDicionarioDTO;
import dbchanges.dtl.ProjetosDTO;
import dbchanges.dtl.VariaveisDTO;
import dbchanges.factory.ConnectionParameters;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaDicionarioDAO {

    private Connection connection;
    private String valor;
    private Integer linhas;

    public ConsultaDicionarioDAO(ConnectionParameters conexao) {
        this.connection = conexao.getConnection();
    }

    public ConsultaDicionarioDTO recuperarDadosDicionario(String valor) {
        ConsultaDicionarioDTO dicionario = new ConsultaDicionarioDTO();
        try {
            String sql = "SELECT count(1) FROM " + valor;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            //dicionario.setLinhas(rs.getInt(Integer.SIZE));
            if (rs.next()) {
            linhas = rs.getInt(1);
            }

            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return dicionario;
    }
}
