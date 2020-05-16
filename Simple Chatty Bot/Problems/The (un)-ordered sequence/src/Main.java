import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int numeroIntroduzido = 0;
        int numeroAnterior = 0;
        boolean ascending = false;
        boolean descending = false;
        boolean fucked = false;
        while(scanner.hasNextInt()) {
            i++ ;
            if ( i == 1 ){
                numeroIntroduzido = scanner.nextInt();
                continue;
            } else {
                numeroAnterior = numeroIntroduzido;
                numeroIntroduzido = scanner.nextInt();
            }
            if (numeroIntroduzido == 0) {
                if (!fucked) {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }

            //se maior que o anterior e não descendente -> ascendente a true
            if ( numeroIntroduzido >= numeroAnterior) {
                if (!descending) {
                    ascending = true;
                }
                    else fucked = true;
            } else if ( numeroIntroduzido <= numeroAnterior ) {
                if (!ascending) {
                    descending = true;
                }
                else fucked = true;
            }

        }
    }
}
