package teslaai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RadarSensor extends Sensor {

    public RadarSensor() {
        super("Radar Sensor");
    }

    @Override
    public void readData() throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter distance (in meters) detected by Radar Sensor: ");
            distance = sc.nextDouble();

            if (distance < 0) {
                throw new IllegalArgumentException("Distance cannot be negative!");
            }

        } catch (InputMismatchException e) {
            throw new Exception("Invalid input! Please enter a numeric value.");
        }
    }
}
