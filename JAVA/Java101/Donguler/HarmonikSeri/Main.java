package JAVA.Java101.Donguler.HarmonikSeri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n sayısını giriniz : ");
        int n = scanner.nextInt();

        double result = 0;

        for (double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.print("sonuç : " + result);
    }
}
