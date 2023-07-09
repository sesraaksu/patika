package JAVA.Java101.KosulluIfadeler.Hipotenus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        double kenar1, kenar2, hipotenus;
        Scanner imput = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        kenar1 = imput.nextDouble();
        System.out.print("2. kenarı giriniz : ");
        kenar2 = imput.nextDouble();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.print("Hipotenüs değeri : " + hipotenus);
        */

        // ödev : üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        double knr1, knr2, knr3, alan, cevre;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        knr1 = girdi.nextDouble();
        System.out.print("2. kenarı giriniz : ");
        knr2 = girdi.nextDouble();
        System.out.print("3. kenarı giriniz : ");
        knr3 = girdi.nextDouble();

        cevre = (knr1 + knr2 + knr3)/2;
        alan = Math.sqrt(cevre * (cevre - knr1) * (cevre - knr2) * (cevre - knr3));

        System.out.print("Üçgenin alanı : " + alan);
    }
}
