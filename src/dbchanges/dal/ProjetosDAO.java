package dbchanges.dal;

import dbchanges.dtl.HistoricosDTO;
import dbchanges.factory.ConnectionFactory;
import dbchanges.dtl.ProjetosDTO;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjetosDAO {

    private Connection connection;
    Integer id;
    String nome;
    String observacao;
    String responsavel;
    String usuarioDaConexao;
    String senha;
    String host;
    Integer porta;
    String sid;

    public ProjetosDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(ProjetosDTO projeto) {

        try {
            String sql_select = "SELECT SQ_PROJETO.NEXTVAL FROM DUAL ";
            PreparedStatement stmt = connection.prepareStatement(sql_select);
            stmt = connection.prepareStatement(sql_select);
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            if (rs.next()) {
                id = rs.getInt(1);
            }

            String sql = "INSERT INTO projeto (prj_id, prj_nome, prj_observacao, prj_responsavel, prj_usuariodaconexao, prj_senha, prj_host, prj_porta, prj_sid) VALUES (?,?,?,?,?,?,?,?,?)";
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, (int) id);
            stmt.setString(2, projeto.getNome());
            stmt.setString(3, projeto.getObservacao());
            stmt.setString(4, projeto.getResponsavel());
            stmt.setString(5, projeto.getUsuarioDaConexao());
            stmt.setString(6, projeto.getSenha());
            stmt.setString(7, projeto.getHost());
            stmt.setInt(8, (int) projeto.getPorta());
            stmt.setString(9, projeto.getSid());
            stmt.executeUpdate();
            stmt.close();
            rs.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public List<ProjetosDTO> recuperarProjetosPorNomeComboBox() throws SQLException {
        List<ProjetosDTO> projetos = new ArrayList<ProjetosDTO>();
        String sql = "SELECT * FROM PROJETO ORDER BY PRJ_NOME ";
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            ProjetosDTO projeto = new ProjetosDTO();
            id = resultSet.getInt("prj_id");
            nome = resultSet.getString("prj_nome");
            projeto.setId(id);
            projeto.setNome(nome);
            projetos.add(projeto);
        }
        resultSet.close();
        statement.close();
        return projetos;
    }
}