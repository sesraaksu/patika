package JAVA.Java101.KosulluIfadeler.MinToMax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1, sayi2, sayi3;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        sayi2 = input.nextInt();
        System.out.print("3. sayıyı giriniz : ");
        sayi3 = input.nextInt();

        if(sayi1<sayi2 && sayi1<sayi3){
            if (sayi2<sayi3){
                System.out.print("1. sayı < 2. sayı < 3. sayı : " + sayi1 + " " + sayi2 + " " + sayi3);
            }else{
                System.out.print("1. sayı < 3. sayı < 2. sayı : " + sayi1 + " " + sayi3 + " " + sayi2);
            }
        } else if (sayi2<sayi1 && sayi2<sayi3) {
            if (sayi1<sayi3){
                System.out.print("2. sayı < 1. sayı < 3. sayı : " + sayi1 + " " + sayi2 + " " + sayi3);
            }else{
                System.out.print("2. sayı < 3. sayı < 1. sayı : " + sayi1 + " " + sayi3 + " " + sayi2);
            }
        } else if (sayi3<sayi1 && sayi3<sayi2) {
            if (sayi1<sayi2){
                System.out.print("3. sayı < 1. sayı < 2. sayı : " + sayi1 + " " + sayi2 + " " + sayi3);
            }else{
                System.out.print("3. sayı < 2. sayı < 1. sayı : " + sayi1 + " " + sayi3 + " " + sayi2);
            }
        }
    }
}
