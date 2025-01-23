package somaAcimaDiagonalPrincipal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[][] diagonal = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                diagonal[i][j] = input.nextInt();
            }
        }

        int soma = 0;

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                soma += diagonal[i][j];
            }
        }

        System.out.print(soma);

        input.close();

    }
}
