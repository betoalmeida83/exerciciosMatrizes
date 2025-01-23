package diagonalPrincipal;

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

        System.out.println("DIAGONAL PRINCIPAL:");
        for(int i=0; i<N; i++) {
            System.out.print(diagonal[i][i] + " ");
        }

        int cont = 0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(diagonal[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);

        input.close();

    }
}
