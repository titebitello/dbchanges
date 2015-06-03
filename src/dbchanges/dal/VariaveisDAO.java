package dbchanges.dal;

import dbchanges.factory.ConnectionFactory;
import dbchanges.dtl.VariaveisDTO;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class VariaveisDAO {

    private Connection connection;

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
            
            String sql = "INSERT INTO historico (id_historico, linhas, colunas, fks, constraints2, index2, trigger2, function2, view2, tabela, prj_id, tempoestimado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, id);
            prepareStatement.setInt(2, variaveis.getLinhas());
            prepareStatement.setInt(3, variaveis.getColunas());
            prepareStatement.setInt(4, variaveis.getFks());
            prepareStatement.setInt(5, variaveis.getConstraints());
            prepareStatement.setInt(6, variaveis.getIndices());
            prepareStatement.setInt(7, variaveis.getTriggers());
            prepareStatement.setInt(8, variaveis.getFunctions());
            prepareStatement.setInt(9, variaveis.getViews());
            prepareStatement.setInt(10, variaveis.getTabelas());
            prepareStatement.setInt(11, variaveis.getIdProjeto());
            prepareStatement.setFloat(12, variaveis.getTempoEstimado());
            prepareStatement.executeUpdate();
            prepareStatement.close();
            stmt.close();
            rs.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        } 
    }

}
