package swiftfood;

public class Bill {

	private static int counter ;
	private String  billId  ;
	private String paymentMode ;
	
	
	static {
		counter  = 9000 ;
	}
	
	
	public Bill(String paymentMode) {
		//super();
		this.paymentMode = paymentMode;
		this.billId = "C" + ++Bill.counter ;
	}
	
	
	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		Bill.counter = counter;
	}


	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	public boolean generateBill(Order order) {
		System.out.println("Bill details \n***********");
		System.out.println("Bill Id : " + this.getBillId());
		System.out.println("Items ordered : ");
		for (Food food : order.getOrderedFoods()) {
			System.out.println(food.getFoodName());
		}
		double payableAmount = order.calculateTotalPrice(this.getPaymentMode());
		System.out.println("Payable Amount : $" + (int) (payableAmount * 100)
				/ 100.0);
		return true;
}
	
	
}
