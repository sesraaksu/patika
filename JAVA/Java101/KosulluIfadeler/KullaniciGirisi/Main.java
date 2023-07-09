package JAVA.Java101.KosulluIfadeler.KullaniciGirisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPassword;
        int secim;

        Scanner imput = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz : ");
        userName = imput.nextLine();
        System.out.print("Şifre giriniz : ");
        password = imput.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş yapıldı!");
        }else{
            System.out.print("Bilgileriniz yanlış! Şifreyi sıfırlamak ister misiniz?\n1 - Evet\n2 - Hayır\n");
            secim = imput.nextInt();
            switch (secim){
                case 1:
                    Scanner girdi = new Scanner(System.in);
                    System.out.print("Yeni şifreyi giriniz : ");
                    newPassword = girdi.nextLine();
                    if(newPassword.equals("java123")){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }else{
                        System.out.print("Şifre oluşturuldu");
                    }
                case 2:
                    break;
            }
        }
    }
}
