/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbchanges.dal;

import dbchanges.factory.ConnectionFactory;
import dbchanges.dtl.HistoricosDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Facensa
 */
public class HistoricosDAO {
    private final Connection connection;
    
    public HistoricosDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }

    public List<HistoricosDTO> buscarHistoricoComTempoRealPreenchido() throws SQLException {
        List<HistoricosDTO> historicos = new ArrayList<HistoricosDTO>();
        String sql = "SELECT * FROM historico WHERE temporeal is not null";
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            HistoricosDTO historico = new HistoricosDTO();
            int linhas = resultSet.getInt("linhas");
            int colunas = resultSet.getInt("colunas");
            int fks = resultSet.getInt("fks");
            int constraints2 = resultSet.getInt("constraints2");
            int index2 = resultSet.getInt("index2");
            int trigger2 = resultSet.getInt("trigger2");
            int function2 = resultSet.getInt("function2");
            int view2 = resultSet.getInt("view2");
            int tabela = resultSet.getInt("tabela");
            int tempoReal = resultSet.getInt("temporeal");
            int tempoEstimado = resultSet.getInt("tempoestimado");
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
    
}
