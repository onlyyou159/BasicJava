package array;
import java.util.*;

public class Array {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList =new ArrayList<>();
//		ArrayList<Integer> arrayList2 =new ArrayList<>();
		arrayList.add (1);
		arrayList.add (2);
		arrayList.add (3);
		arrayList.add (4);
		arrayList.add (5);
		
		List<Integer> list = arrayList.subList(1, 3);
		System.out.println(list);
		
		
//addAll()�żҵ带 ���� arrayList�� �ִ� �������߰�.	
		/*arrayList2.add (10);
		arrayList2.add (30);
		arrayList2.add (20);
//		*/
//		arrayList.remove(1);//index 1�� �ش��ϴ� 
		
//		arrayList.add(1,10);//��ҵ��� �ڵ����� �ڷ� �з���
		
		for(int i :arrayList){
			System.out.println("value :" +  i);
		}
			System.out.println();
			
		for(int j: list) System.out.println(j);
	}
}
