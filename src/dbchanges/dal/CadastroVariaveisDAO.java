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

public class CadastroVariaveisDAO {

    private Connection connection;
    Number id;
    Number linhas;
    Number colunas;
    Number fks;
    Number constraints;
    Number indices;
    Number triggers;
    Number functions;
    Number views;
    Number tabelas;
    Number idprojeto;

    public CadastroVariaveisDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(VariaveisDTO variaveis) {

        try {
            String sql_select = "SELECT SQ_HISTORICO.NEXTVAL FROM DUAL ";
            PreparedStatement stmt = connection.prepareStatement(sql_select);
            stmt = connection.prepareStatement(sql_select);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            
            String sql = "INSERT INTO historico (id_historico, linhas, colunas, fks, constraints2, index2, trigger2, function2, view2, tabela, prj_id) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, (int) id);
            stmt.setInt(2, (int) variaveis.getLinhas());
            stmt.setInt(3, (int) variaveis.getColunas());
            stmt.setInt(4, (int) variaveis.getFks());
            stmt.setInt(5, (int) variaveis.getConstraints());
            stmt.setInt(6, (int) variaveis.getIndices());
            stmt.setInt(7, (int) variaveis.getTriggers());
            stmt.setInt(8, (int) variaveis.getFunctions());
            stmt.setInt(9, (int) variaveis.getViews());
            stmt.setInt(10, (int) variaveis.getTabelas());
            stmt.setInt(11, (int) variaveis.getIdProjeto());
            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

}
