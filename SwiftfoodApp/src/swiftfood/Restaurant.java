package swiftfood;

public class Restaurant {

	private String restaurantName;
	private long[] restaurantContact;
	private	String restaurantAddress;
	private float rating;
	
	
	public Restaurant(String restaurantName,float rating,long[] restaurantContact,String restaurantAddress){
	this.restaurantName=restaurantName;
	this.rating=rating;
	this.restaurantContact=restaurantContact;
	this.restaurantAddress=restaurantAddress;
	
 //	this.displaysRestaurantDetail();
	}
	
	
	public String getRestaurantName() {
		return restaurantName;
	}


	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}


	public long[] getRestaurantContact() {
		return restaurantContact;
	}


	public void setRestaurantContact(long[] restaurantContact) {
		this.restaurantContact = restaurantContact;
	}


	public String getRestaurantAddress() {
		return restaurantAddress;
	}


	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}


	public float getRating() {
		return rating;
	}


	public void setRating(float rating) {
		this.rating = rating;
	}


	public void viewRestaurantDetail() {
		
	System.out.println("Restaurant Details \n *******************");
	System.out.println("Restaurant Name :"+restaurantName);
	System.out.println("Restaurant Rating :"+rating);
	
	for (long contactNumber : restaurantContact) {
		System.out.print(contactNumber +" ");
	}
	
	System.out.println("\n Restaurant Address :"+ restaurantAddress);
	
	}
	
}
