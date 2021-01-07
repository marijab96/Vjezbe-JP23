package edunova;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        // Kreirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj

        Scanner ulaz = new Scanner(System.in);

        int[][] matrica1 = new int[4][4];
        int[][] matrica2 = new int[4][4];
        int[][] matrice = new int[4][4];

        for(int i = 0; i < matrica1.length ; i++) {
            for (int j = 0; j < matrica1.length; j++) {
                System.out.println("Upiši broj u prvu matricu pod: [" + i + "] [" + j + "] mjesto");
                matrica1[i][j] = ulaz.nextInt();
            }
            System.out.println();
        }

        for(int i = 0; i < matrica2.length ; i++) {
            for (int j = 0; j < matrica2.length; j++) {
                System.out.println("Upiši broj u drugu matricu pod: [" + i + "] [" + j + "] mjesto");
                matrica2[i][j] = ulaz.nextInt();
            }
            System.out.println();
        }



        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int sum = matrica1[i][j] + matrica2[i][j];

                matrice[i][j] = matrica1 [i] [j] + matrica2 [i] [j];

                System.out.printf("%5d", matrice[i][j]);

            }
            System.out.println();

        }
    }
}
