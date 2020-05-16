import java.security.PublicKey;

public class Main {

    public static void main(String[] Args){

        Planets earth = new Planets(100,70000000,5);
        Planets mars = new Planets(50,0,1);

        System.out.println(earth.population);
        System.out.println(earth.radius);
        System.out.println(earth.continents);

        earth.setPopulation(6000000);
        earth.setRadius(50);

        System.out.println(earth.population);
        System.out.println(earth.radius);
        System.out.println(earth.getContinents());
    }   
}
