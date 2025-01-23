package maiorNumeroDaLinha;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[][] matriz = new int[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        int[] maiorNum = new int[N];
        int aux = 0;
        for(int i=0; i<N; i++) {
            aux = 0;
            for(int j=0; j<N; j++) {
                if(matriz[i][j] > aux) {
                    aux = matriz[i][j];
                }
            }
            System.out.println(aux);
        }

        input.close();

    }
}
