package dbchanges.dal;

import dbchanges.factory.ConnectionFactory;
import dbchanges.dtl.ProjetoDTO;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CadastroProjetoDAO {
    private Connection connection;
    Number id;
    String nome;
    String observacao;
    String responsavel;

    public CadastroProjetoDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(ProjetoDTO projeto){
            
        try {
            String sql_select = "SELECT SQ_PROJETO.NEXTVAL FROM DUAL ";
            PreparedStatement stmt = connection.prepareStatement(sql_select);
            stmt = connection.prepareStatement(sql_select);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            if (rs.next()) {
            id = rs.getInt(1);
            }
            
           String sql = "INSERT INTO projeto (prj_id, prj_nome, prj_observacao, prj_responsavel) VALUES (?,?,?,?)";
           stmt = connection.prepareStatement(sql);
           stmt.setInt(1, (int) id);
           stmt.setString(2, projeto.getNome());
           stmt.setString(3, projeto.getObservacao());
           stmt.setString(4, projeto.getResponsavel());
           stmt.executeUpdate();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
