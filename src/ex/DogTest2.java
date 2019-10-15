package ex;

public class DogTest2 {

	public static void main(String[] args) {
		DogTest1[ ] apple = new DogTest1[5];
		
		apple[0] = new DogTest1("1호", "진돗개");
		apple[1] = new DogTest1("2호","말티즈");
		apple[2] = new DogTest1("3호", "비글");
		apple[3] = new DogTest1("4호", "풍산개");
		apple[4] = new DogTest1("5호", "차우차우");
		
		for(int i = 0; i < apple.length; i++) 
		 System.out.println(apple[i].showDogTest1Info());
		
		for(DogTest1 i : apple)
			System.out.println(i.showDogTest1Info());

	}

}
