package JAVA.Java101.Donguler.BasamakToplami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Girin: ");
        int num = scanner.nextInt();

        int toplam=0;

        while(num != 0) {
            toplam = toplam + (num%10);
            num /= 10;
        }

        System.out.println("Basamak Toplamı: " + toplam);
    }
}
