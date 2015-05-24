/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbchanges.bl;

import dbchanges.dtl.HistoricoDTO;
import java.sql.SQLException;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Facensa
 */
public class MultipleLinearRegressionBOTest {
    
    @Test
    public void carregaDadosHistoricoParaCalculo() throws SQLException{
        MultipleLinearRegressionBO regression = new MultipleLinearRegressionBO();
        List<HistoricoDTO> historicos = regression.carregaDadosHistoricoParaCalculo();
        Assert.assertTrue(historicos.size() > 1);
    }
    
    @Test
    public void montarDadosVariavelXParaCalculo(){
        MultipleLinearRegressionBO regression = new MultipleLinearRegressionBO();
        double[][] matrizX = regression.montarDadosVariavelXParaCalculo();
        Assert.assertNotNull(matrizX);
    }
    
    @Test
    public void montarDadosVariavelYParaCalculo(){
        MultipleLinearRegressionBO regression = new MultipleLinearRegressionBO();
        double[] vetorY = regression.montarDadosVariavelYParaCalculo();
        Assert.assertNotNull(vetorY);
    }        

    @Test
    public void calcularCoeficientes(){
        MultipleLinearRegressionBO regression = new MultipleLinearRegressionBO();
        List<Double> coeficientes = regression.calcularCoeficientes();
        Assert.assertTrue(coeficientes.size() == 3);
        for (Double coeficiente : coeficientes) {
            System.out.println(coeficiente);
        }
    }
}
