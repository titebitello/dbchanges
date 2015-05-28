package dbchanges.bl;

import dbchanges.dtl.VariaveisDTO;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class GerarResultadoBOTest {

    @Test
    public void Calcular() {
        List<Double> coeficientes = new ArrayList();
        for (int i = 0; i <= 10; ++i) {
            Double coeficiente = new Double(1);
            coeficientes.add(coeficiente);
        }

        VariaveisDTO variaveis = new VariaveisDTO();
        
        variaveis.setLinhas(100);
        variaveis.setColunas(100);
        variaveis.setFks(100);
        variaveis.setConstraints(100);
        variaveis.setIndices(100);
        variaveis.setTriggers(100);
        variaveis.setFunctions(100);
        variaveis.setViews(100);
        variaveis.setTabelas(100);
        
        
        GerarResultadoBO tempo = new GerarResultadoBO();
        tempo = coeficientes 
                + variaveis.setLinhas() *  coeficientes
                + variaveis.setColunas(1) * coeficientes
                + variaveis.setFks(1) * coeficientes
                + variaveis.setConstraints(1) * coeficientes
                + variaveis.setIndices(1) * coeficientes
                + variaveis.setTriggers(1) * coeficientes
                + variaveis.setFunctions(1) * coeficientes
                + variaveis.setViews(1) * coeficientes
                + variaveis.setTabelas(1) * coeficientes
                + coeficientes;
        System.out.println(tempo);
        }
    }