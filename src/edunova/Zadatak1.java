package edunova;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        int [] niz = new int[24];

        Scanner ulaz = new Scanner(System.in);

        for(int i = 0; i < niz.length; i++) {
            System.out.println("Upiši " + (i+1) + " broj");
            niz[i] = ulaz.nextInt();
        }

        System.out.println(Arrays.toString(niz));

        int sum = 0;

        for(int i=0; i< niz.length ;i++)
        {
            sum+= niz [i];
        }
        System.out.println("Zbroj je"+ " " + sum);

        int max=niz [0], min=niz [0];

        for(int i=0;i< niz.length; i++) {

            if (niz[i] > max)
                max = niz[i];

            if (niz[i] < min)
                min = niz[i];
        }

        System.out.println("Najveći broj" + " "+ max);
        System.out.println("Najmanji broj" + " "+ min);

    }

}

