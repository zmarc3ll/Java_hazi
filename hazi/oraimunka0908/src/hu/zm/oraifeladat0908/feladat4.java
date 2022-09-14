package hu.zm.oraifeladat0908;

import java.util.Scanner;

public class feladat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a háromszög 'a' oldalát: ");
        double a = sc.nextDouble();
        System.out.print("Kérem adja meg a háromszög 'b' oldalát: ");
        double b = sc.nextDouble();
        System.out.print("Kérem adja meg a háromszög 'c' oldalát: ");
        double c = sc.nextDouble();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double k = a + b + c;
            System.out.println("A háromszög kerülete: " + k);
        } else {
            System.out.println("Hibás adatok!");
        }
    }
}
