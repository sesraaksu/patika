package JAVA.Java101.Donguler.UstelKuvvet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int n = scanner.nextInt();

        System.out.print("4'ün kuvvetleri : ");
        for (int i = 1; i <= n; i *= 4){
            System.out.print(i + " ");
        }

        System.out.print("\n5'in kuvvetleri : ");
        for (int j = 1; j <= n; j *= 5){
            System.out.print(j + " ");
        }
    }
}
