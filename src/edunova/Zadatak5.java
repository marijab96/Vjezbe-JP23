package edunova;

import java.util.Scanner;

public class Zadatak5 {

    //Kreirati program koji ispisuje cikličnu matricu  - ulaz su dva cijela broja

    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesi broj redova: ");
        int x = ulaz.nextInt();

        System.out.println("Unesi broj stupaca: ");
        int y = ulaz.nextInt();


        int[][] matrica = new int[x][y];

        int prviRed = 0;
        int zadnjiRed = x - 1;
        int prviStupac = 0;
        int zadnjiStupac = y - 1;

        int start = 1;

        while (start <= x * y) {

            for (int i = zadnjiStupac; i >= prviStupac; i--) {
                matrica[zadnjiRed][i] = start++;//
            }
            zadnjiRed--;


            for (int i = zadnjiRed; i >= prviRed; i--) {
                matrica[i] [prviStupac] = start++;

            }
            prviStupac++;


            for (int i = prviStupac; i <= zadnjiStupac; ++i) {
                matrica[prviRed][i] = start++;

            }
            prviRed++;

            for (int i = prviRed; i <= zadnjiRed; ++i) {
                matrica[i][zadnjiStupac] = start++;

            }
            zadnjiStupac--;
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("%4d", matrica[i][j]);
            }
            System.out.println();
        }
    }
}









