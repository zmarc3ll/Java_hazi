package hu.zm.oraifeladat0908;

import java.util.Scanner;

public class feladat1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Kérem adja meg a medence átmérőjét!");
        double diameter = sc.nextDouble();
        System.out.print("Kérem adja meg a medence magasságát!");
        double height = sc.nextDouble();
        double radius = diameter / 2;
        double area = radius * radius * Math.PI;
        double volume = area * height;
        /*  Egész szám %d
            Tört szám %f
            Szöveg, egyéb %s
        */
        System.out.printf("A medence térfogata %f köbméter.", volume); //%.3f --> 3 tizedesjeggyel írja ki.
    }
}
