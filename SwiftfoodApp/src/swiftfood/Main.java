package swiftfood;

//import refrence.com.Address;

public class Main {
	

				public static void main(String[] args) {

					// Object creation
					//Customer customer = new Customer( );
				//	Customer customer = new Customer("Stephen Abram" ,7856341287L ,"D089, St. Louis Street, Springfield, 62729" );

					// Assigning values to the instance variables
					// customer.customerId = "C101";
//					customer.customerName = "Stephen Abram";
//					customer.contactNumber = 7856341287L;
//					customer.address = "D089, St. Louis Street, Springfield, 62729";

					// Displaying the customer details
//					customer.displayCustomerDetails();
//					
//					 customer.payBill(100 ,5) ; // abstraction - that hides the internal implementation details
//					
					
//					updateContact(customer);
					
					
					Address address = new Address("g12" ,"next to road ","bhopal" ,45423);
					
					Customer customer1 = new Customer("Sam", 9945000009L, address );
					Customer customer2 = new Customer("John", 9645000009L, address);
					Customer customer3 = new Customer("Alex", 9745000009L, address);
					customer1.displayCustomerDetails();
					System.out.println("Customer Id for the first customer is: " + customer1.getAddress().getCity());
					System.out.println("Customer Id for the second customer is: " + customer2.getAddress().getZipCode());
					System.out.println("Customer Id for the third customer is: " + customer3.getAddress().getStreet());
				System.out.println(customer1.payBill(20));
				System.out.println(Customer.getCounter());
				
				 Customer.setCounter(100);
				 Customer.setDeliveryCharge(3.5f);
				
					
				
					Customer.setCounter(111);
					System.out.println(Customer.getCounter());
					
					//
					
					Food food1 = new Food( "biryani" ,"veg" , 20 , 20 );
					Food food2 = new Food("burgur" ,"nonveg" ,20 ,25);
					
//					food.foodName= "biryani" ;
//					food.foodType= "veg" ;
//					food.quantityAvailable= 2 ;
//					food.unitPrice = 12 ;
					
					// food.displayFoodDetails();
					Food[] food = {food1 ,food2} ;
				    Food[] food0 = {food1} ;
					
					// 
					
					Order order1=new Order(food);  // Aggregation  reference of one class is member of other class  has a relation
					
					System.out.println("totalPrice :"+order1.getOrderId());
					Order ordere2 =new Order(food0 ,customer1);
					System.out.println("totalPrice :"+ordere2.getOrderId());
					 System.out.println("totalPrice :"+Order.getTotalNumberOfOrder());
					 
					 System.out.println("totalPrice :"+ordere2.getCustomer().getCustomerName());
					 System.out.println("totalPrice :"+ordere2.getCustomer().getCustomerId());
					
					
					
					//
					
					long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
					
					
					Restaurant restaurant1 =new Restaurant("McDonald's",4.1F,restaurantContacts,"SH1109,Carolina Street,Springfield");
                           restaurant1.viewRestaurantDetail(); 
                           
                           
                           
                           
                           Bill bill1 = new Bill("DebitCard");
                           Bill bill2 = new Bill("PayPal");
                           bill1.generateBill(order1);   // association only pass  obj to method uses a relation
                           
                           //Create more objects and add them to the bills array for testing your code
                                 
                           Bill[] bills = { bill1, bill2 };
                                 
                           for (Bill bill : bills) {
                               System.out.println("Bill Details");
                               System.out.println("Bill Id: " + bill.getBillId());
                               System.out.println("Payment method: " + bill.getPaymentMode());
                           
                               System.out.println();
                               
                          }
                           
                           
                           
                           
				
				
				
				
				
				Regular regular1 = new Regular("loki",987655433458L, address);
		       
				regular1.displayCustomerDetails();
				System.out.println( regular1.payBill(500));
				
				PremiumCustomer p = new PremiumCustomer("1001", "loki",987655433458L, address);
				
				System.out.println( p.payBill(500));
				
				Guest g = new Guest() ;
				System.out.println(g.payBill(500));
				
				
				
				
				
//				public static void updateContact(Customer customer) { 
//				     customer.setContactNumber(9786758497L);
//				}
				

				Address custAddress = new Address("D089", "St. Louis Street",
						"Springfield", 62729);
				Customer premiumCustomer = new PremiumCustomer("C1016",
						"Stephen Abram", 7856341287L, custAddress);
				premiumCustomer.displayCustomerDetails();
				double amountRemaining = premiumCustomer.payBill(140);
				System.out.println("Final amount to be paid " + amountRemaining);

				
}
			

}
