package dbchanges.bl;

import dbchanges.dal.VariaveisDAO;
import dbchanges.dtl.VariaveisDTO;
import dbchanges.gui.VariaveisGUI;
import java.util.List;

public class GerarResultadoBO {

    public float calcularTempo(List<Double> coeficientes, VariaveisDTO variaveis) {
                double tempo = coeficientes.get(0)
                + (variaveis.getLinhas() * coeficientes.get(1))
                + (variaveis.getColunas() * coeficientes.get(2))
                + (variaveis.getFks() * coeficientes.get(3))
                + (variaveis.getConstraints() * coeficientes.get(4))
                + (variaveis.getIndices() * coeficientes.get(5))
                + (variaveis.getTriggers() * coeficientes.get(6))
                + (variaveis.getFunctions() * coeficientes.get(7))
                + (variaveis.getViews() * coeficientes.get(8))
                + (variaveis.getTabelas() * coeficientes.get(9))
                + coeficientes.get(10);
                
                return (float) tempo;
    }
}