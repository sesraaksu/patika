package JAVA.Java101.Degiskenler.Taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perkm = 2.20; // km başına
        double total;
        double startPrize = 10;

        Scanner imput = new Scanner(System.in);
        System.out.print("mesafiyi km cinsinden giriniz : ");
        km = imput.nextInt();

        total = km * perkm;
        total += startPrize;

        total = ( total < 20) ? 20 : total;
        System.out.print("toplam tutarız : " + total);

    }
}
