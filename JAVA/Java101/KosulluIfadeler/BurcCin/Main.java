package JAVA.Java101.KosulluIfadeler.BurcCin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        yil = input.nextInt();

        switch (yil % 12) {
            case 0 -> System.out.println("Çin Zodyağı Burcunuz : maymun");
            case 1 -> System.out.println("Çin Zodyağı Burcunuz : horoz");
            case 2 -> System.out.println("Çin Zodyağı Burcunuz : köpek");
            case 3 -> System.out.println("Çin Zodyağı Burcunuz : domuz");
            case 4 -> System.out.println("Çin Zodyağı Burcunuz : fare");
            case 5 -> System.out.println("Çin Zodyağı Burcunuz : öküz");
            case 6 -> System.out.println("Çin Zodyağı Burcunuz : kaplan");
            case 7 -> System.out.println("Çin Zodyağı Burcunuz : tavşan");
            case 8 -> System.out.println("Çin Zodyağı Burcunuz : ejderha");
            case 9 -> System.out.println("Çin Zodyağı Burcunuz : yılan");
            case 10 -> System.out.println("Çin Zodyağı Burcunuz : at");
            case 11 -> System.out.println("Çin Zodyağı Burcunuz : koyun");
        }
    }
}
