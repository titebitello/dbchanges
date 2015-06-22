package dbchanges.factory;

import dbchanges.dal.ProjetosDAO;
import dbchanges.dtl.ProjetosDTO;
import java.sql.Connection;
import java.sql.SQLException;
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
    public void hello() throws SQLException {
        
        ProjetosDAO projetoDao = new ProjetosDAO();
        List<ProjetosDTO> projetos = projetoDao.buscaDadosProjetoParaConexao(1);
        
        String usuarioDaConexao = "dbchanges_owner";
        String senha = "dbchanges";
        String host = "localhost";
        Integer porta = 1521;
        String sid = "orcl";
        String url = "jdbc:oracle:thin:@" + host + ":" + porta + ":" + sid;
        
        Connection connection = new ConnectionParameters().getConnection();
        Assert.assertNotNull(connection);
        connection.close();
    }
}
