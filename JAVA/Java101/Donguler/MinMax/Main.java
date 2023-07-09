package JAVA.Java101.Donguler.MinMax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(i + ". sayıyı giriniz : ");
            int num = scanner.nextInt();
            if (num > max){
                max = num;
            } else if (num < min){
                min = num;
            }
        }

        System.out.println("en büyük değer: " + max);
        System.out.println("en küçük değer: " + min);
    }
}
