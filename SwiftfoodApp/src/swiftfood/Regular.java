package swiftfood;

//import refrence.com.Address;

public class Regular extends Customer {
   
      protected float discountPersent ;
	
	
	
	public Regular(String customerId, String customerName, long customerNumer,
			Address address) {
		// TODO Auto-generated constructor stub
		super(customerId,customerName ,customerNumer ,address);
		System.out.println("Regular");
	}
	
	
	Regular(String customerName , long customerNumer ,Address address ){
		super(customerName ,customerNumer ,address);
		this.discountPersent = 5 ;
	}


	public float getDiscountPersent() {
		return discountPersent;
	}


	public void setDiscountPersent(float discountPersent) {
		this.discountPersent = discountPersent;
	}
	@Override
	public double payBill(double totalPrice) {
		//double discountPercentage = 5;
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - ( discountPersent / 100));
		
		return priceAfterDiscount;
	}
	
	
	
}
