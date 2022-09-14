package hu.zm.oraifeladat0908;

import java.util.Scanner;

public class feladat16 {
    public static void main(String[] args) {
        int[] tomb=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Adjon meg 5 számot: ");
        int bekertszam=sc.nextInt();
        for (int i = 0; i < tomb.length-1; i++) {
            tomb[i]=bekertszam;
            bekertszam=sc.nextInt();
        }
        for (int i = 0; i < tomb.length-1; i++) {
            System.out.print(tomb[i]+" ");
        }
        System.out.print(bekertszam);
        System.out.println("\n"+" Visszafele: ");
        System.out.print(bekertszam+" ");
        for (int i = 3; i > -1; i--) {
            System.out.print(tomb[i]+" ");
        }

    }
}
