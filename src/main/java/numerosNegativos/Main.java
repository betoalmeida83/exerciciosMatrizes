package numerosNegativos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int N = input.nextInt();

        int[][] numNegativos = new int[M][N];

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                numNegativos[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(numNegativos[i][j] < 0) {
                    System.out.println(numNegativos[i][j]);
                }
            }
        }

        input.close();

    }
}
