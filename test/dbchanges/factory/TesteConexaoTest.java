/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbchanges.factory;

import java.sql.Connection;
import java.sql.SQLException;
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
public class TesteConexaoTest {

    public TesteConexaoTest() {
    }

    @Test
    public void hello() throws SQLException {
        Connection connection = new ConnectionFactory().getConnection();
        Assert.assertNotNull(connection);
        connection.close();
    }
}