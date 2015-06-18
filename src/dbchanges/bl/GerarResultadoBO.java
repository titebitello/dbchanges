package dbchanges.bl;

import dbchanges.dtl.VariaveisDTO;
import static java.lang.String.format;
import java.util.List;
import static java.util.Locale.US;
import static java.lang.String.format;
import static java.lang.Double.valueOf;

public class GerarResultadoBO {

    public float calcularTempo(List<Double> coeficientes, VariaveisDTO variaveis) {
        double value = valueOf(format(US, "%1$.10f", coeficientes.get(0))) * 10;
        double resultado = value;
        double value1 = valueOf(format(US, "%1$.10f", coeficientes.get(1))) * 10;
        double resultado1 = value1 * variaveis.getLinhas();
        double value2 = valueOf(format(US, "%1$.10f", coeficientes.get(2))) * 10;
        double resultado2 = value2 * variaveis.getColunas();
        double value3 = valueOf(format(US, "%1$.10f", coeficientes.get(3))) * 10;
        double resultado3 = value3 * variaveis.getFks();
        double value4 = valueOf(format(US, "%1$.10f", coeficientes.get(4))) * 10;
        double resultado4 = value4 * variaveis.getConstraints();
        double value5 = valueOf(format(US, "%1$.10f", coeficientes.get(5))) * 10;
        double resultado5 = value5 * variaveis.getIndices();
        double value6 = valueOf(format(US, "%1$.10f", coeficientes.get(6))) * 10;
        double resultado6 = value6 * variaveis.getTriggers();
        double value7 = valueOf(format(US, "%1$.10f", coeficientes.get(7))) * 10;
        double resultado7 = value7 * variaveis.getFunctions();
        double value8 = valueOf(format(US, "%1$.10f", coeficientes.get(8))) * 10;
        double resultado8 = value8 * variaveis.getViews();
        double value9 = valueOf(format(US, "%1$.10f", coeficientes.get(9))) * 10;
        double resultado9 = value9 * variaveis.getTabelas();
        double value10 = valueOf(format(US, "%1$.10f", coeficientes.get(10))) * 10;
        double resultado10 = value10;

        double tempo = resultado + resultado1 + resultado2 + resultado3 + resultado4 + resultado5
                + resultado6 + resultado7 + resultado8 + resultado9 + resultado10;

        return (float) tempo;
    }
}