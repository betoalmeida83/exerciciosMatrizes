package somaLinhaMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();

        double[][] somaLinha = new double[M][N];

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                somaLinha[i][j] = input.nextDouble();
            }
        }

        double[] soma = new double[M];

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                soma[i] += somaLinha[i][j];
            }
            System.out.println(soma[i]);
        }

        input.close();

    }
}
