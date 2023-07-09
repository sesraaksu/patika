package JAVA.Java101.Donguler.Calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, total = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("bir sayı giriniz : ");
            n = scanner.nextInt();
            if (n%4 == 0){
                total += n;
            }
        } while (n%2 == 0);

        System.out.print("toplam : " + total);
    }
}
