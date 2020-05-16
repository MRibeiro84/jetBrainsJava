import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numeroOne = scanner.nextInt();
        int numeroTwo = scanner.nextInt();
        int numeroThree = scanner.nextInt();

        if (numeroOne >= numeroTwo && numeroOne <=  numeroThree || 
        numeroOne <= numeroTwo && numeroOne >=  numeroThree) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
