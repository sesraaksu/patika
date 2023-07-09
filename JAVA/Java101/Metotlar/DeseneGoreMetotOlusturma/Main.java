package JAVA.Java101.Metotlar.DeseneGoreMetotOlusturma;
import java.util.Scanner;
public class Main {
    static void minus(int n, int temp) {
        if (n > 0) {
            System.out.print(n + " ");
            minus((n - 5), temp);
        } else if (n <= 0) {
            plus(n, temp);
        }
    }
    static void plus(int n, int temp) {
        if (temp >= n) {
            System.out.print(n + " ");
            plus((n + 5), temp);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = scanner.nextInt();
        int temp =  n;

        minus(n,temp);
    }
}
