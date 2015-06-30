package dbchanges.factory;

import dbchanges.dal.ProjetosDAO;
import dbchanges.dtl.ProjetosDTO;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class ConnectionParameters {
    private ProjetosDAO projetoDAO;
    private ProjetosDTO projeto;
    
    public ConnectionParameters() {
        this.projetoDAO = new ProjetosDAO();
    }

    public ConnectionParameters(ProjetosDTO projeto) {
        this.projeto = projeto;
    }

    public ProjetosDTO carregaDadosProjetoParaConexao() throws SQLException {
        int idProjeto = 0;
        return projetoDAO.buscaDadosProjetoParaConexao(idProjeto);
    }
    
    public Connection getConnection() {
    String usuarioDaConexao;
    String senha;
    String host;
    Integer porta;
    String sid;
    String url;

        usuarioDaConexao = projeto.getUsuarioDaConexao();
        senha = projeto.getSenha();
        host = projeto.getHost();
        porta = projeto.getPorta();
        sid = projeto.getSid();
        url = "jdbc:oracle:thin:@" + host + ":" + porta + ":" + sid;
        try {
            return DriverManager.getConnection(url, usuarioDaConexao, senha);
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}