package JAVA.Java101.Metotlar.Palindrom;

public class Main {
    static boolean isPalindrom(int number){
        int temp = number;
        int reverseNumber = 0;
        int lastNumber = 0;

        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber)
            return  true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrom(101));
    }
}
