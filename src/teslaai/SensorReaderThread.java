package teslaai;
public class SensorReaderThread extends Thread {
    private Sensor sensor;
    public SensorReaderThread(Sensor sensor) {
        this.sensor = sensor;
    }
    @Override
    public void run() {
        try {
            sensor.readData();
            System.out.println(sensor.getType() + " reading complete: " 
                               + sensor.getDistance() + " meters.");
        } catch (Exception e) {
            System.out.println("Error reading " + sensor.getType() + ": " + e.getMessage());
        }
    }
}
