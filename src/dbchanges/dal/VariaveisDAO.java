package dbchanges.dal;

import dbchanges.dtl.HistoricosDTO;
import dbchanges.dtl.ProjetosDTO;
import dbchanges.factory.ConnectionFactory;
import dbchanges.dtl.VariaveisDTO;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class VariaveisDAO {

    private Connection connection;
    Integer idTipoOperacao;
    String nomeTipoOperacao;
    Integer idTipoObjeto;
    String nomeTipoObjeto;
    
    public VariaveisDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(VariaveisDTO variaveis) {
        Statement stmt = null;
        PreparedStatement prepareStatement = null;
        int id = 0;

        try {
            String sql_select = "SELECT SQ_HISTORICO.NEXTVAL FROM DUAL ";
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql_select);
            if (rs.next()) {
                id = rs.getInt(1);
            }

            String sql = "INSERT INTO historico (hst_id, hst_datahora, hst_status, hst_linhas, hst_colunas, hst_fks, hst_constraints2, hst_index2, hst_trigger2, hst_function2, hst_view2, hst_tabela, prj_id, hst_tempoestimado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, id);
            prepareStatement.setTimestamp(2, getCurrentTimeStamp());
            prepareStatement.setString(3, variaveis.getStatus());
            prepareStatement.setFloat(4, variaveis.getLinhas());
            prepareStatement.setInt(5, variaveis.getColunas());
            prepareStatement.setInt(6, variaveis.getFks());
            prepareStatement.setInt(7, variaveis.getConstraints());
            prepareStatement.setInt(8, variaveis.getIndices());
            prepareStatement.setInt(9, variaveis.getTriggers());
            prepareStatement.setInt(10, variaveis.getFunctions());
            prepareStatement.setInt(11, variaveis.getViews());
            prepareStatement.setInt(12, variaveis.getTabelas());
            prepareStatement.setInt(13, variaveis.getIdProjeto());
            prepareStatement.setFloat(14, variaveis.getTempoEstimado());
            prepareStatement.executeUpdate();
            prepareStatement.close();
            stmt.close();
            rs.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private static java.sql.Timestamp getCurrentTimeStamp() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Timestamp(today.getTime());
    }
    
    public List<VariaveisDTO> recuperarTipoOperacaoComboBox() throws SQLException {
        List<VariaveisDTO> variaveis = new ArrayList<VariaveisDTO>();
        String sql = "SELECT * FROM tipooperacao ORDER BY top_nome ";
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            VariaveisDTO variavel = new VariaveisDTO();
            idTipoOperacao = resultSet.getInt("top_id");
            nomeTipoOperacao = resultSet.getString("top_nome");
            variavel.setId(idTipoOperacao);
            variavel.setNomeTipoOperacao(nomeTipoOperacao);
            variaveis.add(variavel);
        }
        resultSet.close();
        statement.close();
        return variaveis;
    }
    
        public List<VariaveisDTO> recuperarTipoObjetoComboBox() throws SQLException {
        List<VariaveisDTO> variaveis = new ArrayList<VariaveisDTO>();
        String sql = "SELECT * FROM tipoobjeto ORDER BY tob_nome ";
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            VariaveisDTO variavel = new VariaveisDTO();
            idTipoObjeto = resultSet.getInt("tob_id");
            nomeTipoObjeto = resultSet.getString("tob_nome");
            variavel.setId(idTipoObjeto);
            variavel.setNomeTipoOperacao(nomeTipoObjeto);
            variaveis.add(variavel);
        }
        resultSet.close();
        statement.close();
        return variaveis;
    }

}
