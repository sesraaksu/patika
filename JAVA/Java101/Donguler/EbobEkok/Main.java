package JAVA.Java101.Donguler.EbobEkok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = scanner.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = scanner.nextInt();

        int ebob;

        int i = 1;
        while (i<=n1){
            if (n1%i==0 && n2%i==0){
                System.out.println("ortak bölenler : " + i);
            }
            i++;
        }

        int j = n1;
        while (j>=1){
            if (n1%j==0 && n2%j==0){
                ebob = j;
                System.out.println("ebob : " + ebob);
                break;
            }
            j--;
        }

        while (i<=(n1*n2)){
            if (i%n1==0 && i%n2==0){
                System.out.println("ekok : " + i);
                break;
            }
            i++;
        }
    }
}
