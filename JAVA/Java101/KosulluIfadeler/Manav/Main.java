package JAVA.Java101.KosulluIfadeler.Manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //tutarlar
        double armutTutar = 2.14, elmaTutar = 3.67, domatesTutar = 1.11, muzTutar = 0.95, patlicanTutar = 5.00;
        //kilolar
        double armut, elma, domates, muz, patlican;
        double toplam;

        Scanner imput = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut = imput.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = imput.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = imput.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = imput.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = imput.nextDouble();

        toplam = armut * armutTutar + elma * elmaTutar + muz * muzTutar + patlican * patlicanTutar + domates * domatesTutar;
        System.out.print("Toplam Tutar : " + toplam);

    }
}
