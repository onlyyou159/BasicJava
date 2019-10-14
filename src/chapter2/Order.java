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
		test.orderDate = "2018년 3월 12일";
		test.orderName = "홍길동";
		test.orderProductNumber = "PD0345-12";
		test.orderAddress = "서울시 영등포구 여의도동 20번지";
	
		
		
		System.out.println("주문번호 : "+ test.orderNumber);
		System.out.println("주문자 아이디 : "+ test.orderID);
		System.out.println("주문자 날짜 : "+ test.orderDate);
		System.out.println("주문자 이름 : "+ test.orderName);
		System.out.println("주문 상품 번호 : "+ test.orderProductNumber);
		System.out.println("배송 주소 : "+ test.orderAddress);
		
		

	}

}
