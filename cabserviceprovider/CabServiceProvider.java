package cabserviceprovider;

public class CabServiceProvider {

	private String cabServiceName  ;
	private int totalCabs  ;
	
	
	
	public CabServiceProvider(String cabServiceName, int totalCabs) {
		// super();
		
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	
	 public double calculateRewardPrice(Driver driver){
	       
	       double reward = 0 ;
	       
	       if(driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5 && cabServiceName.equals("Halo")   ){
	             reward = 10 *driver.getAverageRating()  ;
	       }else if(  driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5 && cabServiceName.equals("Halo")  ){
	            reward = 5*driver.getAverageRating() ;
	       }else if(  driver.getAverageRating() >= 4.5 && driver.getAverageRating() <= 5 && cabServiceName.equals("Aber")  ){
	            reward = 8*driver.getAverageRating() ;
	       }else if(  driver.getAverageRating() >= 4 && driver.getAverageRating() < 4.5 && cabServiceName.equals("Aber")  ){
	            reward =  3*driver.getAverageRating() ;
	       }else{
	            reward = 0 ;
	       }
	       
	       return Math.round(reward*100.0)/100.0 ;
	        
	   }
	
	
}
