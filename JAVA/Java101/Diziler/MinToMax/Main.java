package JAVA.Java101.Diziler.MinToMax;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();
        System.out.println("Dizinin elemanlarını giriniz : ");
        int[] value = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print((i+1) + ". Elemanı : ");
            value[i] = scanner.nextInt();
        }

        Arrays.sort(value);
        System.out.print("Sıralama :  " + Arrays.toString(value));

    }
}
