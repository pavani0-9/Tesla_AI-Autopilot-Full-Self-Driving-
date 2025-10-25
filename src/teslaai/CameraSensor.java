package teslaai;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CameraSensor extends Sensor {
    public CameraSensor() {
        super("Camera Sensor");
    }
    @Override
    public void readData() throws Exception {
    	Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter distance (in meters) detected by Camera Sensor: ");
            distance = sc.nextDouble();

            if (distance < 0) {
                throw new IllegalArgumentException("Distance cannot be negative!");
            }

        } catch (InputMismatchException e) {
            throw new Exception("Invalid input! Please enter a numeric value.");
        }
    }
}
