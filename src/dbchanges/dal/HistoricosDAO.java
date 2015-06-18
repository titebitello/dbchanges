package dbchanges.dal;

import dbchanges.factory.ConnectionFactory;
import dbchanges.dtl.HistoricosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class HistoricosDAO {

    private final Connection connection;

    public HistoricosDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public List<HistoricosDTO> buscarHistoricoComTempoRealPreenchido() throws SQLException {
        List<HistoricosDTO> historicos = new ArrayList<HistoricosDTO>();
        String sql = "SELECT * FROM historico WHERE hst_temporeal is not null";
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            HistoricosDTO historico = new HistoricosDTO();
            int linhas = resultSet.getInt("hst_linhas");
            int colunas = resultSet.getInt("hst_colunas");
            int fks = resultSet.getInt("hst_fks");
            int constraints2 = resultSet.getInt("hst_constraints2");
            int index2 = resultSet.getInt("hst_index2");
            int trigger2 = resultSet.getInt("hst_trigger2");
            int function2 = resultSet.getInt("hst_function2");
            int view2 = resultSet.getInt("hst_view2");
            int tabela = resultSet.getInt("hst_tabela");
            int tempoReal = resultSet.getInt("hst_temporeal");
            int tempoEstimado = resultSet.getInt("hst_tempoestimado");
            historico.setLinhas(linhas);
            historico.setColunas(colunas);
            historico.setFks(fks);
            historico.setConstraints2(constraints2);
            historico.setIndex2(index2);
            historico.setTrigger2(trigger2);
            historico.setFunction2(function2);
            historico.setView2(view2);
            historico.setTabela(tabela);
            historico.setTempoReal(tempoReal);
            historico.setTempoEstimado(tempoEstimado);
            historicos.add(historico);
        }
        resultSet.close();
        statement.close();

        return historicos;
    }

    public List<HistoricosDTO> recuperarHistoricosJtable(int idProjeto) throws SQLException {
        List<HistoricosDTO> historicos = new ArrayList<HistoricosDTO>();
        String sql = "SELECT * FROM historico WHERE prj_id = ? ORDER BY hst_id ";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, idProjeto);
        ResultSet resultSet = stmt.executeQuery();
        while (resultSet.next()) {
            HistoricosDTO historico = new HistoricosDTO();
            int id = resultSet.getInt("hst_id");
            int linhas = resultSet.getInt("hst_linhas");
            int colunas = resultSet.getInt("hst_colunas");
            int fks = resultSet.getInt("hst_fks");
            int constraints2 = resultSet.getInt("hst_constraints2");
            int index2 = resultSet.getInt("hst_index2");
            int trigger2 = resultSet.getInt("hst_trigger2");
            int function2 = resultSet.getInt("hst_function2");
            int view2 = resultSet.getInt("hst_view2");
            int tabela = resultSet.getInt("hst_tabela");
            int tempoReal = resultSet.getInt("hst_temporeal");
            int tempoEstimado = resultSet.getInt("hst_tempoestimado");
            String status = resultSet.getString("hst_status");
            Date datahora = resultSet.getTimestamp("hst_datahora");
            historico.setId(id);
            historico.setLinhas(linhas);
            historico.setColunas(colunas);
            historico.setFks(fks);
            historico.setConstraints2(constraints2);
            historico.setIndex2(index2);
            historico.setTrigger2(trigger2);
            historico.setFunction2(function2);
            historico.setView2(view2);
            historico.setTabela(tabela);
            historico.setTempoReal(tempoReal);
            historico.setTempoEstimado(tempoEstimado);
            historico.setStatus(status);
            historico.setDatahora(datahora);
            historicos.add(historico);
        }
        resultSet.close();
        stmt.close();
        return historicos;
    }

    public boolean adicionaFeedback(HistoricosDTO historico) {
        boolean retorno;
        try {
            String sql = "UPDATE historico SET hst_temporeal = ?, hst_status = ?"
                       + "WHERE hst_id = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, historico.getTempoReal());
            stmt.setString(2, "1");
            stmt.setInt(3, historico.getId());
            retorno = stmt.executeUpdate() > 0;
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return retorno;
    }
}