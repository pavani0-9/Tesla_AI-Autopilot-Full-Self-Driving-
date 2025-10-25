package teslaai;
import java.util.ArrayList;
import java.util.List;
public class AIController {
    private List<Sensor> sensors = new ArrayList<>();
    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }
    public void analyzeData() {
        System.out.println("\n=== ANALYZING SENSOR DATA ===");
        for (Sensor sensor : sensors) {
            double d = sensor.getDistance();
            System.out.println(sensor.getType() + " detects object at " + d + " meters.");
            makeDecision(d);
        }
    }
    private void makeDecision(double distance) {
        if (distance < 20) {
            System.out.println(" Obstacle very close! Applying brakes.\n");
        } else if (distance < 50) {
            System.out.println(" Object nearby! Slowing down.\n");
        } else {
            System.out.println(" Road clear. Maintaining speed.\n");
        }
    }
}
