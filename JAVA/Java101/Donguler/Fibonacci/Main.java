package JAVA.Java101.Donguler.Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        int sayi1 = 0; // fibonacci serisinin ilk elemanı
        int sayi2 = 1; // fibonacci serisinin ikinci elemanı
        int toplam;

        System.out.print(sayi + " elemanlı fibonacci serisi : ");

        for (int i = 1; i <= sayi; i++){
            toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
            System.out.print(sayi1 + " ");

        }
    }
}
