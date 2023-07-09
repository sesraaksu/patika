package JAVA.Java101.Degiskenler.Daire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        int r;
        double pi = 3.14;
        double alan, cevre;

        Scanner imput = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = imput.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);
        */

        // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.  (𝜋 * (r*r) * 𝛼) / 360

        int r, a;
        double pi = 3.14, alan;

        Scanner imput = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = imput.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz : ");
        a = imput.nextInt();

        alan = (pi * (r * r) * a) / 360;
        System.out.println("Dairenin alanı : " + alan);

    }
}
