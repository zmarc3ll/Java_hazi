package hu.zm.oraifeladat0908;

import java.util.Scanner;

public class feladat12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pénz összeget: (min 1, max 1000)");
        double eredetiosszeg = sc.nextDouble();
        double osszeg = eredetiosszeg;
        int ft200 = 0;
        int ft100 = 0;
        int ft50 = 0;
        int ft20 = 0;
        int ft10 = 0;
        int ft5 = 0;
        boolean hibas = false;
        while (osszeg != 0) {
            if (osszeg >= 200) {
                ft200++;
                osszeg = osszeg - 200;

            } else if (osszeg < 200 && osszeg >= 100) {
                ft100++;
                osszeg = osszeg - 100;

            } else if (osszeg < 100 && osszeg >= 50) {
                ft50++;
                osszeg = osszeg - 50;

            } else if (osszeg < 50 && osszeg >= 20) {
                ft20++;
                osszeg = osszeg - 20;

            } else if (osszeg < 20 && osszeg >= 10) {
                ft10++;
                osszeg = osszeg - 10;

            } else if (osszeg < 10 && osszeg >= 5) {
                ft5++;
                osszeg = osszeg - 5;
            } else {
                hibas = true;
                break;
            }
        }
        if (hibas) {
            System.out.println("Adjon meg vagy egészre vagy 5- re végződő számjegyet!");
        } else {
            System.out.println(eredetiosszeg + " Ft- ot legkevesebb erméből " + ft200 + " 200-as " + ft100 + " 100-as "
                    + ft50 + " 50-es " + ft20 + " 20-as " + ft10 + " 10-es " + ft5 + " 5-ös " + "-ből lehet összeálítani.");
        }


    }
}
