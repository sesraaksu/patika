package JAVA.Java101.Donguler.ModOrt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float toplam = 0, sayac = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number; i++){
            if(i%3 == 0 || i%4 == 0){
                sayac++;
                toplam += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nSayıların toplamı : " + toplam);
        System.out.println("Sayıların adedi : " + (sayac - 1)); // 0 hariç

        float ortalama = toplam / (sayac - 1);

        System.out.print("3 ve 4'e tam bölünen sayıların ortalaması : " + ortalama);
    }
}
