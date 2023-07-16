package JAVA.Java101.Diziler.MinMax;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        System.out.print("Bir sayı giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Girilen Sayı : " + n);

        int min = n;
        int max = n;
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for (int i= 0; i < list.length; i++){
            if (list[i] > n){
                max = list[i];
                break;
            }
        }

        for (int i = list.length-1; i >= 0; i--){
            if (list[i] < n){
                min = list[i];
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
