package JAVA.Java101.Degiskenler.VKIHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // "Vücut Kitle İndeks" değerini hesaplama

        double boy, kilo, indeks;

        Scanner imput = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = imput.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = imput.nextDouble();


        indeks = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);

    }
}
