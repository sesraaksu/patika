package JAVA.Java101.KosulluIfadeler.NotOrtalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenleri tanımla
        int mat, fiz, kim, tr, tar, mz;

        // scannerı tanımla
        Scanner input = new Scanner(System.in);

        // kullanıcı değerlerini al
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        tr = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tar = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        mz = input.nextInt();

        int toplam = mat + fiz + kim + tr + tar + mz;
        double sonuc = toplam / 6;

        String str = (sonuc>=60) ? "Sınıfı geçtiniz" : "Sınıfta kaldınız";

        System.out.println("Not Ortalaması : " + sonuc);
        System.out.println(str);

    }
}
