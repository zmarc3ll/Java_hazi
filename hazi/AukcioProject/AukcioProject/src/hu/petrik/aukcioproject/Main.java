package hu.petrik.aukcioproject;

import com.sun.tools.jconsole.JConsoleContext;
import com.sun.tools.jconsole.JConsoleContext;
import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Festmenyek> festmenyek = new ArrayList<>();
        festmenyek.add(new Festmenyek("Hollókő", "Bálint Ferenc", "Expresszionizmus"));
        festmenyek.add(new Festmenyek("Hómező", "Bálint Ferenc", "Konstruktivizmus"));
        festmenyek.add(new Festmenyek("Reggel", "Bálint Ferenc", "Futurizmus"));


        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy darabszámot: ");
        int darabSzam = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < darabSzam; i++) {
            System.out.println("Adja meg a festmény címét:");
            String cim = sc.nextLine();

            System.out.println("Adja meg a festő nevét:");
            String festo = sc.nextLine();

            System.out.println("Adja meg a stílusát:");
            String style = sc.nextLine();

            festmenyek.add(new Festmenyek(cim, festo, style));
        }

        Beolvas be = new Beolvas();
        try {
            festmenyek.addAll(be.ReadFestmeny("festmenyek.csv"));
        } catch (IOException e) {
            System.out.println("Hiba a fálj beolvasása közben!");
        }


        int randomIndex = (int)(Math.random() * (festmenyek.size()));
        for (int i = 0; i < 20; i++) {
            int randomLicit = (int)(Math.random() * (100 - 10) + 1) + 10;
            festmenyek.get(randomIndex).Licit(randomLicit);
            System.out.println("Licit értéke " + randomLicit + " új érték: " + festmenyek.get(randomIndex).getLegmagasabbLicit());
        }

        int licitSzam = -1;
        boolean kezdes = true;
        boolean kilep = false;

        while (licitSzam < 0 || (licitSzam - 1) > festmenyek.size() && !kilep) {

            if (!kezdes) {
                System.out.println("Rossz éerték");
            } else {
                kezdes = true;
            }

            System.out.print("Adja meg a sorszáot: ");
            try {
                licitSzam = sc.nextInt();
                if (licitSzam == 0) {
                    kilep = true;
                }
            } catch (Exception e) {
                System.out.println("Nem szám!");
                System.exit(0);
            }
        }
        licitSzam++;

    }

}