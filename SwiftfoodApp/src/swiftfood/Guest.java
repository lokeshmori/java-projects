package swiftfood;

public class Guest extends Customer {
	
	private float dilivayCharge ;
	
	Guest(){
		
		super();
		System.out.println("Gust");
		dilivayCharge = 10.0f ;
		
	}
	@Override 
	public double payBill(double totalPrice) {
		
		System.out.println("Calculating final amount to be paid.....");
		
		double finalBillAmount = totalPrice +(totalPrice * dilivayCharge)/100;
		return finalBillAmount;
	}
	public float getDilivayCharge() {
		return dilivayCharge;
	}
	public void setDilivayCharge(float dilivayCharge) {
		this.dilivayCharge = dilivayCharge;
	}
	

}

