package dbchanges.dal;

import dbchanges.dtl.ConsultaHistoricosDTO;
import dbchanges.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultaHistoricosDAO {

    private Connection connection;

    public ConsultaHistoricosDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public List<ConsultaHistoricosDTO> recuperarProjetosPorNome(String nome) throws SQLException {
        String sql_select = "SELECT PRJ_NOME FROM PROJETO ORDER BY PRJ_NOME ";
        PreparedStatement statementSelect = connection.prepareStatement(sql_select);
        ResultSet rs = statementSelect.executeQuery();

        List<ConsultaHistoricosDTO> projeto = new ArrayList<ConsultaHistoricosDTO>();
        while (rs.next()) {
            projeto.add(recuperarObjeto(rs));
        }
        rs.close();
        statementSelect.close();
        return projeto;
        
        

    private ConsultaHistoricosDTO recuperarObjeto(ResultSet rs) throws SQLException {

        ConsultaHistoricosDTO projeto = new ConsultaHistoricosDTO();
        projeto.setId(rs.getInt("id"));
        projeto.setProjeto(rs.getString("projeto"));

        return projeto;
    }
}
}