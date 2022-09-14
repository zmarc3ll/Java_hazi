package hu.zm.oraifeladat0908;

import java.util.Scanner;

public class feladat5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg a téglalap 'a' oldalát: ");
        var a = sc.nextDouble();
        sc.nextLine(); //sortörés karakterek eltávolítása
        System.out.println("Adjon meg a téglalap 'b' oldalát: ");
        var b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Kérem adja meg, mit szeretne kiszámítani:  (K: kerület, T: terület)");
        String muvelet = sc.nextLine();
        if (muvelet.equals("K")) {                                          //equals tartalom egyezést vizsgál.
            double kerulet = 2 * (a + b);
            System.out.printf("A téglalap kerülete %.2f cm\n", kerulet);
        } else if (muvelet.equals("T")) {
            double terulet = a * b;
            System.out.printf("A téglalap területe %.2f cm^2\n", terulet);
        } else {
            System.out.println("Hibás karaktert adott meg!\n");
        }
        if (a == b) {
            System.out.println("Ez egy négyzet.");
        }
    }
}
