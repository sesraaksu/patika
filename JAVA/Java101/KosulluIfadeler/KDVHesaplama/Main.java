package JAVA.Java101.KosulluIfadeler.KDVHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, KDVOran1 = 0.18, KDVOran2 = 0.08 , KDVTutar , KDVliTutar;

        Scanner imput = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz : ");
        tutar = imput.nextDouble();

        if(tutar>0 && tutar<1000){
            KDVTutar = tutar * KDVOran1;
            System.out.println("KDV oranı : " + KDVOran1);
        }else{
            KDVTutar = tutar * KDVOran2;
            System.out.println("KDV oranı : " + KDVOran2);
        }

        KDVliTutar = tutar + KDVTutar;

        System.out.println("KDVsiz tutar : " + tutar);
        System.out.println("KDV tutarı : " + KDVTutar);
        System.out.println("KDVli tutar : " + KDVliTutar);
    }
}
