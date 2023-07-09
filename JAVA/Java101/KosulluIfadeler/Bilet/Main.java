package JAVA.Java101.KosulluIfadeler.Bilet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mesafe, yas, yolTipi;
        double tutar, indYas, indBilet, indTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolTipi = input.nextInt();

        if (mesafe>0 && yas>0 && (yolTipi == 1 || yolTipi == 2)){
            tutar = mesafe * 0.10;
            if (yas<12){
                indYas = tutar * 0.50;
                indTutar = tutar - indYas;
                if(yolTipi == 1){
                    System.out.print("Toplam tutar : " + indTutar);
                }else{
                    indBilet = indTutar * 0.20;
                    tutar = (indTutar - indBilet) * 2;
                    System.out.print("Toplam tutar : " + tutar);
                }
            } else if (yas>12 && yas<24) {
                indYas = tutar * 0.10;
                indTutar = tutar - indYas;
                if(yolTipi == 1){
                    System.out.print("Toplam tutar : " + indTutar);
                }else{
                    indBilet = indTutar * 0.20;
                    tutar = (indTutar - indBilet) * 2;
                    System.out.print("Toplam tutar : " + tutar);
                }
            } else if (yas>65) {
                indYas = tutar * 0.30;
                indTutar = tutar - indYas;
                if(yolTipi == 1){
                    System.out.print("Toplam tutar : " + indTutar);
                }else{
                    indBilet = indTutar * 0.20;
                    tutar = (indTutar - indBilet) * 2;
                    System.out.print("Toplam tutar : " + tutar);
                }
            } else {
                if(yolTipi == 1){
                    System.out.print("Toplam tutar : " + tutar);
                }else{
                    indBilet = tutar * 0.20;
                    tutar = (tutar - indBilet) * 2;
                    System.out.print("Toplam tutar : " + tutar);
                }
            }
        }else{
            System.out.print("Hatalı veri girdiniz.");
        }
    }
}

