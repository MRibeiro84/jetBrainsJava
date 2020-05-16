public class Planets {

    double radius;
    long population;
    int continents;

    public Planets(double inputRadius, long inputPopulation, int inputContinents){
        this.radius =inputRadius;
        this.population = inputPopulation;
        this.continents = inputContinents;

    }

        public void setPopulation(long newPopulation){
        population = newPopulation;

        }

        public void setRadius(double newRadius){
        radius = newRadius;
        }

        public int getContinents(){
        return continents;
        }


}
