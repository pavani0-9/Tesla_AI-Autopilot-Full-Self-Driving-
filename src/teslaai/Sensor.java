package teslaai;
	public abstract class Sensor {
	    protected String sensorType;
	    protected double distance;
	    public Sensor(String type) {
	        this.sensorType = type;
	    }
	    public String getType() {
	        return sensorType;
	    }
	    public double getDistance() {
	        return distance;
	    }
	    public void setDistance(double distance) {
	        this.distance = distance;
	    }
	    public abstract void readData() throws Exception;
	}
