package hu.zm.oraifeladat0908;

import java.util.Scanner;

public class feladat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot: ");
        int n = sc.nextInt();
        int osszeg = 0;
        for (int i = 0; i < n; i++) {
            if (i <= n && i % 2 != 0) {
                osszeg = osszeg + i;
            }
        }
        System.out.println(osszeg);
    }
}
