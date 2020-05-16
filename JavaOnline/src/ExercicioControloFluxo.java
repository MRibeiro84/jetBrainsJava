public class ExercicioControloFluxo {
    public static void main(String[] args) {
        double salario = 4000;
        System.out.println(salario<1000 ? salario*0.05 : salario>=1000&&salario<2000 ? salario *0.10 :salario>=2000&&salario<4000? salario*0.15:salario*0.2);
    }
}
