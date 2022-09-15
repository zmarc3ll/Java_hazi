package hu.zm.oraifeladat0908;

import java.util.Scanner;

public class feladat10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int osszeg = 0;
        int paros = 0;
        int paratlan = 0;
        System.out.println("Kérem adjon meg egész számokat!");
        while (osszeg <= 100) {
            int szam = sc.nextInt();
            osszeg += szam;
            if (szam % 2 == 0) {
                paros++;
            } else {
                paratlan++;
            }
        }
        System.out.printf("A megadott számok között %d páros éés %d páratlan szám volt.", paros, paratlan);
    }
}
