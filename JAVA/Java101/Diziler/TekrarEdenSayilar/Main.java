package JAVA.Java101.Diziler.TekrarEdenSayilar;
import java.util.Arrays;

public class Main {

    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {2, 2, 2, 71, 71, 65, 38, 38, 46, 90};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if ((list[i] % 2 == 0) && (i != j) && (list[i] == list[j])){
                    if (!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));
    }
}
