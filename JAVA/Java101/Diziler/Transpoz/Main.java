package JAVA.Java101.Diziler.Transpoz;

public class Main {
    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        System.out.println("Matris : ");
        for (int[] ints : matris) {         //(int i = 0; i < matris.length; i++)
            for (int anInt : ints) {        //(int j = 0; j < matris[i].length; j++)
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("Transpozunu : ");
        for (int i = 0; i < matris[0].length; i++){
            for (int[] ints : matris) {     //(int j = 0; j < matris.length; j++)
                System.out.print(" " + ints[i] + " ");
            }
            System.out.println();
        }

    }
}
