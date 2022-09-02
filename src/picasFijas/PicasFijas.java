package picasFijas;

import java.util.Scanner;

public class PicasFijas {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        adivinar();
    }

    public static void adivinar() {
        int numFijas = 0, numPicas = 0;
        int a[] = {3, 4, 6, 1};
        int b[] = new int[4];

        do {
            for (int i = 0; i < a.length; i++) {
                b[i] = sc.nextInt();
            }
            numFijas = 0;
            numPicas = 0;
            for (int j = 0; j < a.length; j++) {
                if (b[j] == a[j]) {
                    numFijas++;
                } else if (b[0] == a[j] || b[1] == a[j] || b[2] == a[j] || b[3] == a[j]) {
                    numPicas++;
                }
            }
            System.out.println(numFijas + " Fijas " + numPicas + " Picas");
            if (numFijas == a.length) {
                System.out.println("Adivinaste el número");
            } else {
                System.out.println("Intenta de nuevo");
            }
        } while (numFijas != a.length);

    }

}
