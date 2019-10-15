package ex;
import java.util.ArrayList;

import array.Book;
public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<DogTest1> Spuer = new ArrayList<DogTest1>( ); 
		
		Spuer.add(new DogTest1("1호","진돗개"));
		Spuer.add(new DogTest1("2호","말티즈"));
		Spuer.add(new DogTest1("3호","비글"));
		Spuer.add(new DogTest1("4호","풍산개"));
		Spuer.add(new DogTest1("5호","차우차우"));
		
		for(DogTest1 i : Spuer)
			System.out.println(i.showDogTest1Info());
		}

	}

