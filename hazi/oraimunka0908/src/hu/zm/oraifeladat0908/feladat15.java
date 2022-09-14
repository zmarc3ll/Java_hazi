package hu.zm.oraifeladat0908;

public class feladat15 {
    public static void main(String[] args) {
        double[] tomb = new double[25];
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = Math.random() * 200 - 100;
        }
        for (int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i] * tomb[i] + " ");
        }
    }
}

