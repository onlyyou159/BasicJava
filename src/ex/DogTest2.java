package ex;

public class DogTest2 {

	public static void main(String[] args) {
		DogTest1[ ] apple = new DogTest1[5];
		
		apple[0] = new DogTest1("1ȣ", "������");
		apple[1] = new DogTest1("2ȣ","��Ƽ��");
		apple[2] = new DogTest1("3ȣ", "���");
		apple[3] = new DogTest1("4ȣ", "ǳ�갳");
		apple[4] = new DogTest1("5ȣ", "��������");
		
		for(int i = 0; i < apple.length; i++) 
		 System.out.println(apple[i].showDogTest1Info());
		
		for(DogTest1 i : apple)
			System.out.println(i.showDogTest1Info());

	}

}
