import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int numeroDeImpressoes = scanner.nextInt();
            int i = 0;
            int contadordeImpressoes = 0;
            boolean breaked = false;
            while (i <= numeroDeImpressoes && !breaked) {
                i++;
                for (int n = 0; n < i; n++) {
                    System.out.println(i);
                    contadordeImpressoes++;
                    if (contadordeImpressoes == numeroDeImpressoes) {
                        breaked = true;
                        break;
                    }
                }
            }
    }
}
