package dbchanges.factory;

import dbchanges.dal.ProjetosDAO;
import dbchanges.dtl.ProjetosDTO;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ConnectionParameters {
    public Connection getConnection() {
    String usuarioDaConexao;
    String senha;
    String host;
    Integer porta;
    String sid;
    String url;

        ProjetosDTO projetos = new ProjetosDTO();
        usuarioDaConexao = projetos.getUsuarioDaConexao();
        senha = projetos.getSenha();
        host = projetos.getHost();
        porta = projetos.getPorta();
        sid = projetos.getSid();
        url = "jdbc:oracle:thin:@" + host + "/" + porta + ":" + sid;
        try {
            return DriverManager.getConnection(url, usuarioDaConexao, senha);
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}