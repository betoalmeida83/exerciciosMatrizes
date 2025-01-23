package pelotao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();

        int[][] pelotao = new int[M][N];

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                pelotao[i][j] = input.nextInt();
            }
        }

        int escolha = input.nextInt();

        int aux = pelotao[escolha-1][N-1];
        pelotao[escolha-1][4] = pelotao[escolha-1][N-2];
        pelotao[escolha-1][3] = pelotao[escolha-1][N-3];
        pelotao[escolha-1][2] = pelotao[escolha-1][N-4];
        pelotao[escolha-1][1] = pelotao[escolha-1][0];
        pelotao[escolha-1][0] = aux;

        System.out.println();
        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                System.out.print(pelotao[i][j] + " ");
            }
            System.out.println();
        }

        input.close();

    }
}
