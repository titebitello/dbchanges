package dbchanges.bl;

import Jama.Matrix;
import Jama.QRDecomposition;
import dbchanges.bl.QRDecompositionMy;

public class MultipleLinearRegressionBOOld {

    private final int N;        // number of 
    private final int p;        // number of dependent variables
    private final Matrix beta;  // regression coefficients
    private double SSE;         // sum of squared
    private double SST;         // sum of squared

    public MultipleLinearRegressionBOOld(double[][] x, double[] y) {
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

    }

    public double beta(int j) {
        return beta.get(j, 0);
    }

    public double R2() {
        return 1.0 - SSE / SST;
    }

    public static void main(String[] args) {
        /*  double[][] x = { {  1,  10,  20, 1 },
         {  1,  20,  40, 5 },
         {  1,  40,  15, 0 },
         {  1,  80, 100, 0 },
         {  1, 160,  23, 0 },
         {  1, 200,  18, 0 } };
         double[] y = { 243, 483, 508, 1503, 1764, 2129 };*/

	double[][] x = {{1, 99544, 1, 0, 0, 0, 0, 0, 0, 1, 2},
        {1, 99544, 1, 1, 1, 1, 1, 1, 1, 1, 2},
        {1, 164268, 1, 5, 1, 2, 3, 4, 5, 1, 1},
        {1, 440178, 1, 0, 0, 0, 0, 0, 0, 2, 11},
        {1, 274604, 1, 0, 0, 0, 0, 0, 0, 1, 7},
        {1, 355961, 1, 0, 0, 0, 0, 0, 0, 1, 8},
        {1, 188300, 1, 0, 0, 0, 0, 0, 0, 3, 3},
        {1, 298595, 2, 0, 0, 0, 0, 0, 0, 4, 13},
        {1, 246006, 2, 0, 0, 0, 0, 0, 0, 4, 5},
        {1, 429307, 5, 0, 0, 0, 0, 0, 0, 1, 10},
        {1, 858445, 5, 0, 0, 0, 0, 0, 0, 1, 21},
        {1, 819854, 3, 0, 0, 0, 0, 0, 0, 1, 16},
        {1, 2310170, 2, 0, 0, 0, 0, 0, 0, 1, 64}};
        
	/*double[][] x = { { 99544,1,1,2},
                     { 99544,1,1,2},
                     { 164268,1,1,1},
                     { 440178,1,2,11},
                     { 274604,1,1,7},
                     { 355961,1,1,8},
                     { 188300,1,3,3},
                     { 298595,2,4,13},
                     { 246006,2,4,5},
                     { 429307,5,1,10},
                     { 858445,5,1,21},
                     { 819854,3,1,16},
                     { 2310170,2,1,64 }};*/

        double[] y = {2, 2, 3, 7.26, 4.7, 5.95, 3.39, 5.1, 4.29, 7.08, 13.69, 13.09, 36.02};
        //double[] y = {2, 2, 3, 726, 47, 595, 339, 51, 429, 708, 1369, 1309, 3602};
        MultipleLinearRegressionBOOld regression = new MultipleLinearRegressionBOOld(x, y);

        System.out.printf("%.2f + %.2f beta1 + %.2f beta2 + %.2f beta3  (R^2 = %.2f)\n", regression.beta(0), regression.beta(1), regression.beta(2), regression.beta(3), regression.R2());
    }
}
