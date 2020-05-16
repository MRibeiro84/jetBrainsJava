import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        int[] numbers2 = {1,2,3,4};

        String[] myFavouriteCandyBars = {"twix", "mars", "snickers","bla"};
        System.out.println("index 1:" + myFavouriteCandyBars[0]);
        System.out.println("Comprimento do Array de strings: " + myFavouriteCandyBars.length);


    }

}
