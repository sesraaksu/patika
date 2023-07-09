package JAVA.Java101.Donguler.MukemmelSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int toplam = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        for(int i = 1; i < sayi; i++) {
            if(sayi % i == 0) {
                toplam += i;
            }
        }

        if(sayi == toplam) {
            System.out.println(sayi + " mükemmel bir sayıdır");
        } else {
            System.out.println(sayi + " mükemmel bir sayı degildir");
        }
    }
}
