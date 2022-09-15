package hu.zm.oraifeladat0908;

import java.util.Scanner;

public class feladat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy szöveget: ");
        String szoveg = sc.nextLine();
        String menuPont = "";
        while (!menuPont.equals("f")) {
            System.out.println("Válassza ki mit szeretne: ");
            System.out.println("- Nagy betűssé alakítani (a)");
            System.out.println("- Kisbetűssé alakítani (b)");
            System.out.println("- Lekérdezni a hosszát (c)");
            System.out.println("- Összehasonlítani egy másik szöveggel (d)");
            System.out.println("- Egy részét kiiratni a szövegnek (e)");
            System.out.println("- Kilépni (f)");
            System.out.println("Adja meg a menüpontot: ");
            menuPont = sc.nextLine().toLowerCase();
            switch (menuPont) {
                case "a":
                    System.out.println(szoveg.toUpperCase());
                    break;
                case "b":
                    System.out.println(szoveg.toLowerCase());
                    break;
                case "c":
                    System.out.println("A szöveg hossza: " + szoveg.length());
                    break;
                case "d":
                    System.out.println("Kérem adja meg a másik szöveget!");
                    String masikSzoveg = sc.nextLine();
                    int osszehasonlitas = szoveg.compareTo(masikSzoveg);
                    if (osszehasonlitas < 0) {
                        System.out.println("Az első szöveg van előrébb az ABC -ben");
                    } else if (osszehasonlitas > 0) {
                        System.out.println("A második szöveg van előrébb az ABC - ben");
                    } else {
                        System.out.println("A 2 szöveg megegyezik");
                    }
                    break;
                case "e":
                    System.out.println("Kérem adja meg a karakter sorszámát, amit ki szeretne írni: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Kérem adja meg az utolsó karaktert, amitől le szeretné vágni");
                    int b = sc.nextInt();
                    sc.nextLine();
                    System.out.println(szoveg.substring(a - 1, b - 1));
                    break;
                case "f":
                    System.out.println("Viszlát!");
                    break;
                default:
                    System.out.println("Rossz lehetőséget adott meg, kérem a lehetőségek közül válasszon");
                    break;
            }
        }

    }
}
