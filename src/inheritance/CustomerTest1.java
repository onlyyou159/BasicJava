package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		VIPCustomer customerLee = new VIPCustomer(0, null, 0 );
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("ÀÌ¼ø½Å");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo( ));
	
		

	}

}
