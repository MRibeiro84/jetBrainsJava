import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        String available = "aAeEiIoOuU";

        //int teste = available.indexOf('r');
        //if (available.indexOf(ch) >= 0) {
            return available.indexOf(ch) >= 0;
        //}
        //return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
