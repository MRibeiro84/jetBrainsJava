import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String a = scanner.next();
         int aint = Integer.parseInt(a);
         /*String B = scanner.next();
         int BInt = Integer.parseInt(B);
         String H = scanner.next();
         int HInt = Integer.parseInt(H);*/

         if (-14 <= aint && aint <= 12 || 15 <= aint && aint <= 16 || aint >= 19) {
             System.out.println("True");
         } else {
             System.out.println("False");
         }
    }
}
