package cabserviceprovider;

public class Driver {

	private String driverName ;
	private float averageRating ;
	
	
	
	
	
	public Driver(String driverName, float averageRating) {
	//	super();
		
		this.driverName = driverName;
		this.averageRating = averageRating;
	}
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public float getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public String toString() {
		return "Driver [driverName=" + driverName + ", averageRating=" + averageRating + "]";
	}
	
	
	
	
	
}
