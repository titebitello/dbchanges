package dbchanges.bl;

import Jama.Matrix;
import Jama.QRDecomposition;
import dbchanges.dal.HistoricosDAO;
import dbchanges.dtl.HistoricosDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MultipleLinearRegressionBO {

    private final HistoricosDAO historicoDAO;
    private int N;              // number of 
    private int p;              // number of dependent variables
    private Matrix beta;        // regression coefficients
    private double SSE;         // sum of squared
    private double SST;

    public MultipleLinearRegressionBO() {
        this.historicoDAO = new HistoricosDAO();
    }

    protected List<HistoricosDTO> carregaDadosHistoricoParaCalculo() throws SQLException {
        return historicoDAO.buscarHistoricoComTempoRealPreenchido();
    }

    protected double[][] montarDadosVariavelXParaCalculo() {
        double[][] matriz = null;
        try {
            List<HistoricosDTO> historicos = carregaDadosHistoricoParaCalculo();
            int linhas = historicos.size();
            int colunas = 11;
            int linha = 0;
            matriz = new double[linhas][colunas];
            for (HistoricosDTO historico : historicos) {
                matriz[linha][0] = 1;
                matriz[linha][1] = historico.getLinhas();
                matriz[linha][2] = historico.getColunas();
                matriz[linha][3] = historico.getFks();
                matriz[linha][4] = historico.getConstraints2();
                matriz[linha][5] = historico.getIndex2();
                matriz[linha][6] = historico.getTrigger2();
                matriz[linha][7] = historico.getFunction2();
                matriz[linha][8] = historico.getView2();
                matriz[linha][9] = historico.getTabela();
                matriz[linha][10] = historico.getTempoReal();
                ++linha;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        double[][] x = {{1, 10, 20},
        {1, 20, 40},
        {1, 40, 15},
        {1, 80, 100},
        {1, 160, 23},
        {1, 200, 18}};

        return matriz;
    }

    protected double[] montarDadosVariavelYParaCalculo() {
        double[] vetor = null;
        try {
            List<HistoricosDTO> historicos = carregaDadosHistoricoParaCalculo();
            vetor = new double[historicos.size()];
            int coluna = 0;
            for (HistoricosDTO historico : historicos) {
                vetor[coluna] = historico.getTempoEstimado();
                ++coluna;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //double[] y = { 243, 483, 508, 1503, 1764, 2129 };
        return vetor;
    }

    public List<Double> calcularCoeficientes() {
        double[][] x = montarDadosVariavelXParaCalculo();
        double[] y = montarDadosVariavelYParaCalculo();

        if (x.length != y.length) {
            throw new RuntimeException("dimensions don't agree");
        }
        N = y.length;
        p = x[0].length;

        Matrix X = new Matrix(x);

        // create matrix from vector
        Matrix Y = new Matrix(y, N);

        // find least squares solution
        QRDecomposition qr = new QRDecomposition(X);
        beta = qr.solve(Y);

        // mean of y[] values
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += y[i];
        }
        double mean = sum / N;

        // total variation to be accounted for
        for (int i = 0; i < N; i++) {
            double dev = y[i] - mean;
            SST += dev * dev;
        }

        // variation not accounted for
        Matrix residuals = X.times(beta).minus(Y);
        SSE = residuals.norm2() * residuals.norm2();

        List<Double> coeficientes = new ArrayList<Double>();
        for (int i = 0; i <= 10; ++i) {
            Double coeificiente = beta(i);
            coeficientes.add(coeificiente);
        }
        return coeficientes;
    }

    public double beta(int j) {
        return beta.get(j, 0);
    }

    public double R2() {
        return 1.0 - SSE / SST;
    }
}