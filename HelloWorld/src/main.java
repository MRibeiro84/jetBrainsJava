import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("hello World");
        System.out.println("MR -> bla");

        //car myCar = new Car(25.5, "00-80-Qu","Silver",true);
        Car mycar = new Car(25.5,
                "00-80-Qu",
                Color.BLACK,
                true);

        Car mamaCar = new Car(20.0,
                "00-65-XR",
                Color.BLUE,
                true);

        System.out.println("my cars color is:" + mycar.paintColor);
        System.out.println("my mom's car license plate is:" + mamaCar.licensePlate);

        mycar.changePaintColor(Color.white);
        System.out.println("my cars color is:" + mycar.paintColor);

        double myCarSpeed = myCarSpeed = mycar.speedUp(190);
        System.out.println(myCarSpeed);

       /*System.out.println("Enter a word:");
       Scanner sc = new Scanner(System.in);
       int userNumber = sc.nextInt();
       System.out.println(userNumber);
       String userImput = sc.next();
       String uppercased = userImput.toUpperCase();
       char firstCharacter = userImput.charAt(0);
       System.out.println(userImput);
        System.out.println(uppercased);
        System.out.println(firstCharacter);
        System.out.println("contains: " + userImput.contains("Enter".toLowerCase()));*/

       String s = "bla";
       String sRplaced = s.replace("b","p");
       System.out.println(sRplaced);
    }
}

