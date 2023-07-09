package JAVA.Java101.Donguler.Kombinasyon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // C(n,r) = n! / (r! * (n-r)!)

        int toplam, ntotal = 1, rtotal = 1, nrtotal = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("kümenin eleman sayısı : ");
        int n = scanner.nextInt();
        System.out.print("gruplandırılacak eleman sayısı : ");
        int r = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            ntotal = ntotal * i;
        }

        for (int i = 1; i <= r; i++){
            rtotal = rtotal * i;
        }

        for (int i = 1; i <= n-r; i++){
            nrtotal = nrtotal * i;
        }

        toplam = ntotal/(rtotal*nrtotal);
        System.out.println("kombinasyon : " + toplam);

    }
}
