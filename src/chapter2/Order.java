package chapter2;

public class Order {
	long orderNumber;
	String orderID;
	String orderDate;
	String orderName;
	String orderProductNumber;
	String orderAddress;
	
	public static void main(String[] args) {
		Order test = new Order( );
		test.orderNumber = 201803120001L;
		test.orderID = "abc123";
		test.orderDate = "2018�� 3�� 12��";
		test.orderName = "ȫ�浿";
		test.orderProductNumber = "PD0345-12";
		test.orderAddress = "����� �������� ���ǵ��� 20����";
	
		
		
		System.out.println("�ֹ���ȣ : "+ test.orderNumber);
		System.out.println("�ֹ��� ���̵� : "+ test.orderID);
		System.out.println("�ֹ��� ��¥ : "+ test.orderDate);
		System.out.println("�ֹ��� �̸� : "+ test.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : "+ test.orderProductNumber);
		System.out.println("��� �ּ� : "+ test.orderAddress);
		
		

	}

}
