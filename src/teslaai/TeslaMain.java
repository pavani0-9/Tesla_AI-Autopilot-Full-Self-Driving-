package teslaai;
import java.util.Scanner;
public class TeslaMain {
    public static void main(String[] args) {
        System.out.println("=== TESLA AI-ENABLED VEHICLE SYSTEM SIMULATION ===\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Tesla Model: ");
        String model = sc.nextLine();
        System.out.print("Enter Vehicle Color: ");
        String color = sc.nextLine();
        System.out.print("Enter Manufacture Year: ");
        int year = sc.nextInt();
        TeslaVehicle vehicle = new TeslaVehicle(model, color, year);
        vehicle.displayVehicleInfo();
        Sensor camera = new CameraSensor();
        Sensor radar = new RadarSensor();
        SensorReaderThread t1 = new SensorReaderThread(camera);
        SensorReaderThread t2 = new SensorReaderThread(radar);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        AIController ai = new AIController();
        ai.addSensor(camera);
        ai.addSensor(radar);
        ai.analyzeData();
        System.out.println("=== END OF TESLA SIMULATION ===");
    }
}
