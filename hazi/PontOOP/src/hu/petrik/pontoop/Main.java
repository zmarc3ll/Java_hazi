package hu.petrik.pontoop;

import hu.petrik.pontoop.pont.Pont;
import hu.petrik.pontoop.kor.Kor;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont();
        Pont p2 = new Pont(0, 0);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);

        //System.out.println(p1);
        //System.out.println(p2);
        //System.out.println(p3);
        //System.out.println(p4);

        Pont[] pontok = new Pont[10];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(10);
        }
        for (Pont p : pontok) {
            System.out.println(p);
        }

        //Origotól legtávolabb eső pont
        int LegtavolabbiPontIndex = 0;
        for (int i = 1; i < pontok.length; i++) {
            if (pontok[LegtavolabbiPontIndex].getOrigotolMertTavolsag() < pontok[i].getOrigotolMertTavolsag()) {
                LegtavolabbiPontIndex = i;
            }
        }
        System.out.printf("A legtávolabbi pont az Origótól a(z) %d. pont, koordinátái: %s, Origótól mért távolságra: %.3f"
                , (LegtavolabbiPontIndex + 1), pontok[LegtavolabbiPontIndex], pontok[LegtavolabbiPontIndex].getOrigotolMertTavolsag());

        System.out.printf("Az eggyik pont: %s, a másik pont %s , a két pont távolsága: %.3f\n", p3, p4, p3.getTavolsag(p4));

        System.out.printf("A %s pont elhelyezkedése: %s\n", p3, p3.getSiknegyedSzoveges());
        System.out.printf("A %s pont elhelyezkedése: %s\n", p3, p2.getSiknegyedSzoveges());
        System.out.printf("A %s pont elhelyezkedése: %s\n", p4, p4.getSiknegyedSzoveges());

        //KÖR
        System.out.println("Kör: ");

        Kor kor1 = new Kor(5 , 6 ,4);
        System.out.println("Kör kerülete: "+Kor.getCircumference(kor1.getRadius()));
        System.out.println("Kör területe: "+Kor.getArea(kor1.getRadius()));
        System.out.println("Nagyobb kör: "+kor1.getX() + " " + kor1.getY() + " " + Kor.getNagyitas(kor1.getRadius(), 2));
        System.out.println("Eredeti kör: "+kor1);

        Kor[] korok = new Kor[10];
        for (int i = 0; i < korok.length ; i++) {
            korok[i] = new Kor(10 ,15);
        }
        for (Kor kor : korok) {
            System.out.println(kor);
        }

        int legnagyobbterulet = 0;
        for (int i = 0; i < korok.length; i++) {

            if (Kor.getArea(korok[i].getRadius()) > Kor.getArea(korok[legnagyobbterulet].getRadius()) ){
                legnagyobbterulet = i;
            }
        }
        System.out.println("A legnagyobb területü kör : " + korok[legnagyobbterulet]);
    }
}


