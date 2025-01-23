package acoesMatriz;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        double[][] matriz = new double[N][N];

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                matriz[i][j] = input.nextDouble();
            }
        }

        int L = input.nextInt();
        double[] linhaEscolhida = new double[L];
        int C = input.nextInt();
        double[] colunaEscolhida = new double[C];

        //a) calcular e imprimir a soma de todos os elementos positivos da matriz.
        double soma = 0.0;

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(matriz[i][j] > 0.0) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("SOMA DOS POSITIVOS: " + soma);

        //b) fazer a leitura do índice de uma linha da matriz e imprimir todos os elementos desta linha.
        System.out.print("LINHA ESCOLHIDA: ");
        for(int i=0; i<N; i++) {
            System.out.print(matriz[L][i] + " ");
        }

        //c) fazer a leitura do índice de uma coluna da matriz e imprimir todos os elementos desta coluna.
        System.out.println();
        System.out.print("COLUNA ESCOLHIDA: ");
        for(int i=0; i<N; i++) {
            System.out.print(matriz[i][C] + " ");
        }

        //d) imprimir os elementos da diagonal principal da matriz.

        System.out.println();
        System.out.print("DIAGONAL PRINCIPAL: ");
        for(int i=0; i<N; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        //e) alterar a matriz elevando ao quadrado todos os números negativos. Em seguida imprimir a matriz alterada.

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(matriz[i][j] < 0.0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
            }
        }
        System.out.println();
        System.out.println("MATRIZ ALTERADA:");
        for(int i=0; i<N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        input.close();

    }

}
