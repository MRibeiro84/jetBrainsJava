import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = 0;
        int dividirPor = 0;

        for (int number = a; number <= b; number++) {
         if (number % 3 == 0){
             dividirPor++;
          soma = soma + number;
         }
        }
        //float resultado = (float) soma/dividirPor;
        System.out.println((float) soma/dividirPor);
    }
}
