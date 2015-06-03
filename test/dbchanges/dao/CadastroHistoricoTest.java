/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbchanges.dao;

import dbchanges.dal.HistoricosDAO;
import dbchanges.dtl.HistoricosDTO;
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
public class CadastroHistoricoTest {
    
    public CadastroHistoricoTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void buscarTodosHistoricosComTempoRealPreenchido() throws SQLException{
        HistoricosDAO dao = new HistoricosDAO();
        List<HistoricosDTO> historicos = dao.buscarHistoricoComTempoRealPreenchido();
        Assert.assertTrue(historicos.size() > 1);
    }
}
