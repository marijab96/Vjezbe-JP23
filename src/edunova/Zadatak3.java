package edunova;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        // Kreirati program koji za dva unesena broja ispisuje sve prim/prosti/prime brojeve između njih.

        Scanner ulaz = new Scanner(System.in);


        System.out.println("Unesi broj 1: ");
        int x = ulaz.nextInt();

        System.out.println("Unesi broj 2: ");
        int y = ulaz.nextInt();

        int poc = Math.min(x, y);
        int kraj = Math.max(x, y);

        for (int i = poc; i < kraj; i++) {
            if (i <= 1) {
                System.out.println(i + " Nije");
            } else if (i == 2) {
                System.out.println(i + " Je");
            } else if (i % 2 == 0) {
                System.out.println(i + " Nije");
            } else {

                boolean bo = false;

                for (int n = 3; n <= Math.sqrt(i); n += 2) {
                    if (i % n == 0) {
                        bo = true;
                        System.out.println(i + " Nije");
                        break;
                    }
                }
                if(!bo) {
                    System.out.println(i + " Je");
                }

            }
        }
    }
}









