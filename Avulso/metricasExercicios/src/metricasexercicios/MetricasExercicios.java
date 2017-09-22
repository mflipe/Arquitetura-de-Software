/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricasexercicios;

/**
 *
 * @author Marcos Felipe
 */
public class MetricasExercicios {

    public static double[][] multiply(double[][] A, double[][] B) {
        int mA = A.length;
        int nA = A[0].length;
        int mB = B.length;
        int nB = A[0].length;
        if (nA != mB) {
            throw new RuntimeException("Illegal matrix dimensions");
        }
        double[][] C = new double[mA][nB];
        for (int i = 0; i < mA; i++) {
            for (int j = 0; j < nB; j++) {
                for (int k = 0; k < nA; k++) {
                    C[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }
        return C;
    }
    
    public int test01(int a)
    {
        return (a>0) ? 1 : -1;
    }

    public int test03(int a) 
    {
        if (a > 10 || a < -10) 
            return 0;
        else
            return 1;
    }

    public int test02(int a)
    {
        switch(a)
        {
            case 1: return 1;
            case 2:
                return 2;
            default:
                return 0;
        }
    }
    public MetricasExercicios() {
    }
}
