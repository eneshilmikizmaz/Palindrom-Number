import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Sayı giriniz : ");
        Scanner scanner = new Scanner(System.in);
        PalindromNum num = new PalindromNum();
        System.out.println(num.isPalindrom(scanner.nextInt()));
    }
}