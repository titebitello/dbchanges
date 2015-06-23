package dbchanges.factory;

import dbchanges.dal.ProjetosDAO;
import dbchanges.dtl.ProjetosDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Facensa
 */
public class TesteConexaoParametrosTest {

    @Test
    public void TesteConexaoParametrosTest() throws SQLException {
        ProjetosDTO projetos = new ProjetosDTO();
        projetos.setUsuarioDaConexao("dbchanges_owner");
        projetos.setSenha("dbchanges");
        projetos.setHost("localhost");
        projetos.setPorta(1521);
        projetos.setSid("orcl");
        projetos.setUrl("jdbc:oracle:thin:@" + projetos.getHost() + ":" + projetos.getPorta() + ":" + projetos.getSid());
        Connection connection = new ConnectionParameters().getConnection(projetos);
        
        System.out.println("Conectado!");

        Assert.assertNotNull(connection);
        connection.close();
    }
}