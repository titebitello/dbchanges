package dbchanges.bl;

import dbchanges.dal.CadastroVariaveisDAO;
import dbchanges.dtl.VariaveisDTO;
import dbchanges.gui.CadastroVariaveisGUI;
import java.util.List;

public class GerarResultadoBO {

    private double tempo = 0.0;

    public GerarResultadoBO() {
        MultipleLinearRegressionBO regression = new MultipleLinearRegressionBO();
        List<Double> coeficientes = regression.calcularCoeficientes();

        VariaveisDTO variaveis = new VariaveisDTO();

        tempo = coeficientes.get(0)
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
    }
}