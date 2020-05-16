import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextInt();
        int P = scanner.nextInt();
        int K = scanner.nextInt();
        int nAnos = 0;

        while (M < K){
            M = M + (M * P / 100);
            nAnos = nAnos + 1;
        }
        System.out.println(nAnos);
    }
}
