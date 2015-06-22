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
    private final ProjetosDAO projetoDAO;
    
    public ConnectionParameters() {
        this.projetoDAO = new ProjetosDAO();
    }

    public List<ProjetosDTO> carregaDadosProjetoParaConexao() throws SQLException {
        int idProjeto = 0;
        return projetoDAO.buscaDadosProjetoParaConexao(idProjeto);
    }
    
    public Connection getConnection(ProjetosDTO projetos) {
    String usuarioDaConexao;
    String senha;
    String host;
    Integer porta;
    String sid;
    String url;

        usuarioDaConexao = projetos.getUsuarioDaConexao();
        senha = projetos.getSenha();
        host = projetos.getHost();
        porta = projetos.getPorta();
        sid = projetos.getSid();
        url = "jdbc:oracle:thin:@" + host + ":" + porta + ":" + sid;
        try {
            return DriverManager.getConnection(url, usuarioDaConexao, senha);
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}