package polymorphism;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer( );
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo( ));
	
		Customer customerKim = new VIPCustomer(10020, "������", 12345);
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerKim.showCustomerInfo( ));
		System.out.println("===== �������� ���ʽ��� ����Ʈ ��� =====");
		
		int price = 10000;
		int leeprice = customerLee.calcPrice(price);
		int kimprice = customerKim.calcPrice(price);
		
		System.out.println(customerLee.getCustomerName() + "����" + leeprice + "�� �����ϼ̽��ϴ�." );
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.getCustomerName() + "����" + kimprice + "�� �����ϼ̽��ϴ�." );
		System.out.println(customerKim.showCustomerInfo());
	}
	

}
