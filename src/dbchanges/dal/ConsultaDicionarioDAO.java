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
    private Integer colunas;
    private Integer fks;
    private Integer constraints;
    private Integer indices;
    private Integer triggers;

    public ConsultaDicionarioDAO(ConnectionParameters conexao) {
        this.connection = conexao.getConnection();
    }

    public ConsultaDicionarioDTO recuperarDadosDicionario(String valor) {
        ConsultaDicionarioDTO dicionario = new ConsultaDicionarioDTO();
        try {
            String sql = "SELECT count(1) FROM " + valor;
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
            linhas = rs.getInt(1);
            dicionario.setLinhas(linhas);
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return dicionario;
    }
    
        public ConsultaDicionarioDTO recuperarDadosDicionarioColunas(String valor) {
        ConsultaDicionarioDTO dicionario1 = new ConsultaDicionarioDTO();
        try {
            String sql = "select count(1) from USER_TAB_COLUMNS where table_name = '" + valor + "'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
            colunas = rs.getInt(1);
            dicionario1.setColunas(colunas);
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return dicionario1;
    }
	
	public ConsultaDicionarioDTO recuperarDadosDicionarioFks(String valor) {
        ConsultaDicionarioDTO dicionario2 = new ConsultaDicionarioDTO();
        try {
            String sql = "select * from all_constraints where table_name = '" + valor + "' and constraint_type = 'R'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
            fks = rs.getInt(1);
            dicionario2.setFks(fks);
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return dicionario2;
    }
	
	public ConsultaDicionarioDTO recuperarDadosDicionarioConstraints(String valor) {
        ConsultaDicionarioDTO dicionario3 = new ConsultaDicionarioDTO();
        try {
            String sql = "select count(1) from all_constraints where table_name = '" + valor + "'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
            constraints = rs.getInt(1);
            dicionario3.setConstraints(constraints);
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return dicionario3;
    }
	
	public ConsultaDicionarioDTO recuperarDadosDicionarioIndex(String valor) {
        ConsultaDicionarioDTO dicionario4 = new ConsultaDicionarioDTO();
        try {
            String sql = "SELECT count(1) FROM user_objects where object_name like '%" + valor + "' and object_type = 'INDEX'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
            indices = rs.getInt(1);
            dicionario4.setIndices(indices);
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return dicionario4;
    }
	
	public ConsultaDicionarioDTO recuperarDadosDicionarioTrigger(String valor) {
        ConsultaDicionarioDTO dicionario5 = new ConsultaDicionarioDTO();
        try {
            String sql = "select count(1) from all_triggers where table_name = '" + valor + "'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
            triggers = rs.getInt(1);
            dicionario5.setTriggers(triggers);
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return dicionario5;
    }
}
