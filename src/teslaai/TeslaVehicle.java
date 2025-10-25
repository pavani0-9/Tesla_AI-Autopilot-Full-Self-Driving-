package teslaai;
public class TeslaVehicle {
    private String model;
    private String color;
    private int year;
    public TeslaVehicle(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void displayVehicleInfo() {
        System.out.println("\n=== TESLA VEHICLE INFORMATION ===");
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}
