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
    private Integer functions;
    private Integer views;

    public ConsultaDicionarioDAO(ConnectionParameters conexao) {
        this.connection = conexao.getConnection();
    }

    public ConsultaDicionarioDTO recuperarDadosDicionarioLinhas(String valor) {
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
    
        public ConsultaDicionarioDTO recuperarDadosDicionarioColunas(String conexao, String valor) {
        ConsultaDicionarioDTO dicionario1 = new ConsultaDicionarioDTO();
        try {
            //String sql = "select count(1) from sys.all_tab_cols t where t.owner = '" + conexao + "' and t.table_name = '" + valor + "'";
            String sql = "select count(1) from sys.all_tab_cols t where t.table_name = '" + valor + "'";
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
	
	public ConsultaDicionarioDTO recuperarDadosDicionarioFks(String conexao, String valor) {
        ConsultaDicionarioDTO dicionario2 = new ConsultaDicionarioDTO();
        try {
            String sql = "select count(1) from sys.all_constraints t where t.table_name = '" + valor + "' and t.constraint_type = 'R'";
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
	
	public ConsultaDicionarioDTO recuperarDadosDicionarioConstraints(String conexao, String valor) {
        ConsultaDicionarioDTO dicionario3 = new ConsultaDicionarioDTO();
        try {
            String sql = "select count(1) from sys.all_constraints t where t.table_name = '" + valor + "' and t.constraint_type = 'C'";
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
	
	public ConsultaDicionarioDTO recuperarDadosDicionarioIndex(String conexao, String valor) {
        ConsultaDicionarioDTO dicionario4 = new ConsultaDicionarioDTO();
        try {
            String sql = "select count(1) qt from sys.all_indexes t where t.table_name = '" + valor + "'";
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
	
    public ConsultaDicionarioDTO recuperarDadosDicionarioTrigger(String conexao, String valor) {
        ConsultaDicionarioDTO dicionario5 = new ConsultaDicionarioDTO();
        try {
            String sql = "select count(1) from sys.all_dependencies t where t.referenced_name = '" + valor + "' and t.referenced_type = 'TRIGGER'";
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
    
    public ConsultaDicionarioDTO recuperarDadosDicionarioFunction(String conexao, String valor) {
        ConsultaDicionarioDTO dicionario6 = new ConsultaDicionarioDTO();
        try {
            String sql = "select count(1) from sys.all_dependencies t where t.referenced_name = '" + valor + "' and t.referenced_type = 'FUNCTION'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
            functions = rs.getInt(1);
            dicionario6.setFunctions(functions);
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return dicionario6;
    }
    
        public ConsultaDicionarioDTO recuperarDadosDicionarioView(String conexao, String valor) {
        ConsultaDicionarioDTO dicionario7 = new ConsultaDicionarioDTO();
        try {
            String sql = "select count(1) from sys.all_dependencies t where t.referenced_name = '" + valor + "' and t.referenced_type = 'FUNCTION'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
            views = rs.getInt(1);
            dicionario7.setViews(views);
            }
            rs.close();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return dicionario7;
    }
}
