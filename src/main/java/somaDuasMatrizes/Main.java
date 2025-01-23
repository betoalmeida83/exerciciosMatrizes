package somaDuasMatrizes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();

        int[][] matrizA = new int[M][N];
        int[][] matrizB = new int[M][N];

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                matrizA[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                matrizB[i][j] = input.nextInt();
            }
        }

        int[][] soma = new int[M][N];

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

        input.close();

    }
}
