package swiftfood;

public class Order {

	private static int orderIdCounter ;
	private	int orderId;
	private Customer customer ;
	private	Food[] orderedFoods;
	private	double totalPrice;
	private String status;
	
	static {
		orderIdCounter = 100 ;
	}
	
		
		// Parameterless constructor
		public Order() {
		status = "Ordered";
		//this.calculateTotalPrice(20) ;
		
		}

		// Parameterised constructor not register
		
		public Order( Food[] orderedFoods) {
		this.orderId = ++Order.orderIdCounter ;
		this.orderedFoods = orderedFoods;
		status = "Ordered";
		
		}
		
		Order( Food[] orderedFoods, Customer customer ){
			
			this.orderId = ++Order.orderIdCounter ;
			this.orderedFoods =orderedFoods ;
			this.status = status ;
			this.customer = customer ;
		}
		 
//			}
//		 //	this.displayDetails();
//
//			}
		
		 public static int getTotalNumberOfOrder() {
			 return Order.orderIdCounter - 100 ;
		 }
//		
		
		
		
		public int getOrderId() {
			return orderId;
		}

//		public static int getOrderIdCounter() {
//			return orderIdCounter;
//		}
//
//		public static void setOrderIdCounter(int orderIdCounter) {
//			Order.orderIdCounter = orderIdCounter;
//		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public Food[] getOrderedFoods() {
			return orderedFoods;
		}

		public void setOrderedFoods(Food[] orderedFoods) {
			this.orderedFoods = orderedFoods;
		}

		public double getTotalPrice() {
			return totalPrice;
		}

		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public void  displayDetails () {
			
			System.out.println("Order Detalis");
			System.out.println("Order Id : "+orderId);
			
			for(Food food :orderedFoods) {
				
				
			System.out.println( " Ordered Foods : "+food.getFoodName() +" "+food.getFoodType()+ " price  ");
			
			}
			System.out.println("Total Price you have to pay "+totalPrice);
			
			System.out.println("Status: "+status);
			System.out.println("Total price : "+totalPrice);
		}

		

		// with 5 % service charge
		public double calculateTotalPrice( String str) {
			
			 
			for(Food food :orderedFoods) {
				
				
		totalPrice += (double)food.getUnitPrice()+ (food.getUnitPrice() *5/100.0);
		
			}
			
		return totalPrice ;

		}
		
	
}
