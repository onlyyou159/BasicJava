package ex;
import java.util.ArrayList;

import array.Book;
public class DogTestArrayList {

	public static void main(String[] args) {
		ArrayList<DogTest1> Spuer = new ArrayList<DogTest1>( ); 
		
		Spuer.add(new DogTest1("1ȣ","������"));
		Spuer.add(new DogTest1("2ȣ","��Ƽ��"));
		Spuer.add(new DogTest1("3ȣ","���"));
		Spuer.add(new DogTest1("4ȣ","ǳ�갳"));
		Spuer.add(new DogTest1("5ȣ","��������"));
		
		for(DogTest1 i : Spuer)
			System.out.println(i.showDogTest1Info());
		}

	}

