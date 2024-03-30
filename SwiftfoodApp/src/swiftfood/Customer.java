 package swiftfood;

//import refrence.com.Address;

public class Customer {

	private static int counter ;
	private String customerId ;
	private String customerName ;
	private long contactNumber ;
	private Address address ;
	private static float deliveryCharge;
	 
	 static {
		   counter = 100 ;
		   deliveryCharge = 2.5f ;
	 }
	   Customer(){
		   System.out.println("customer");
	   }
	 
	 // for no register ;
	 
	 public Customer(String customerName, long contactNumber,
			 Address address ) {
		 this.customerName = customerName;
			this.contactNumber = contactNumber;
			this.address = address;
			this.customerId = "D" + ++Customer.counter ;
		 
	 }
	 
	 
	 public Customer(String customerId, String customerName, long contactNumber,
			Address address) {
//			// this() is used to invoke the constructor of the current class
//			// Since no parameters are specified, parameterless constructor will be invoked
//		//	this();
			this.customerId = customerId;
			this.customerName = customerName;
			this.contactNumber = contactNumber;
			this.address = address;
		}
	 
	 
	 
	 
	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		Customer.counter = counter;
	}


	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public static float getDeliveryCharge() {
		return deliveryCharge;
	}


	public static void setDeliveryCharge(float deliveryCharge) {
		Customer.deliveryCharge = deliveryCharge;
	}


	public void displayCustomerDetails() {
		
		System.out.println("Displaying customer details");
		System.out.println("Customer Id: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Address: " + address.getDoorNo()+ " "+address.getStreet()+ " "+address.getCity()+" "+address.getZipCode());
		System.out.println("Delivery Charge: " + Customer.deliveryCharge);
		System.out.println();
	}
	public double payBill(double totalPrice) {
		double discountPercentage = 5;
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		double finalBillAmount = priceAfterDiscount + Customer.deliveryCharge;
		return finalBillAmount;
	}

	
	
	
}
