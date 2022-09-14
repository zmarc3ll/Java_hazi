package hu.zm.oraifeladat0908;

import java.util.Scanner;

public class feladat8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adja meg a tippjét! (0 a fej vagy 1 az írás)");
        int tipp = sc.nextInt();
        //véletelen egész zám a és b között: ((int)Math.random() * (b - a + 1)) + a
        int feldobas = (int) (Math.random() * 2);
        System.out.printf("A dobás eredménye %s\n", (feldobas == 0) ? "fej" : "iras"); //3 lábú operator
        if (tipp == feldobas) {
            System.out.println("Gratulalok, nyert!");
        } else {
            System.out.println("Sajnos nem nyert, próbálja újra!");
        }
    }
}
