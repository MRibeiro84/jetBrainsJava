import java.awt.*;

public class Car {
    double averageMilePerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTaillightsWorking;

    public Car(double inputAverageMilePerGallon,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTaillightsWorking){
        this.averageMilePerGallon = inputAverageMilePerGallon;
        this.licensePlate=inputLicensePlate;
        this.paintColor=inputPaintColor;
        this.areTaillightsWorking=inputAreTaillightsWorking;


    }

    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
    }

    public double speedUp(double currentSpeed){
        currentSpeed+=100;
        return currentSpeed;
    }
}
