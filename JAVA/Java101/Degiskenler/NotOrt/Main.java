package JAVA.Java101.Degiskenler.NotOrt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        if((mat>=0 && mat<=100) && (fizik>=0 && fizik<=100) && (kimya>=0 && kimya<=100) && (turkce>=0 && turkce<=100) && (muzik>=0 && muzik<=100)){
            double average = (mat + fizik + kimya + turkce + muzik) / 5;
            if(average <= 55){
                System.out.println("Sınıfta kaldı.");
            }else{
                System.out.println("Sınıfı geçti");
            }
            System.out.println("Ortalamanız : " + average);
        }else{
            System.out.print("Lütfen 0 ile 100 arasında bir not giriniz.");
        }
    }
}
