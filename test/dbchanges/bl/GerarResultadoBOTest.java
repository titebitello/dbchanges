package dbchanges.bl;

import dbchanges.dtl.VariaveisDTO;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class GerarResultadoBOTest {
    
    @Test
    public void Calcular(){
        MultipleLinearRegressionBO regression = new MultipleLinearRegressionBO();
        List<Double> coeficientes = regression.calcularCoeficientes();

        VariaveisDTO variaveis = new VariaveisDTO();
        
        double tempo = coeficientes.get(0)
                + variaveis.getLinhas() * coeficientes.get(1)
                + variaveis.getColunas() * coeficientes.get(2)
                + variaveis.getFks() * coeficientes.get(3)
                + variaveis.getConstraints() * coeficientes.get(4)
                + variaveis.getIndices() * coeficientes.get(5)
                + variaveis.getTriggers() * coeficientes.get(6)
                + variaveis.getFunctions() * coeficientes.get(7)
                + variaveis.getViews() * coeficientes.get(8)
                + variaveis.getTabelas() * coeficientes.get(9)
                + coeficientes.get(10);
        System.out.println(tempo);
    }
}
