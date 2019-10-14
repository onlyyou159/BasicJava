package constructor;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PersonTest {
 public  static void main(String[] args) {
	 Person personKim = new Person ( );
	 personKim.name = "김유신";
	 personKim.weight = 85.5F;
	 personKim.height = 180.0F;
	 
	 Person personLee = new Person("이순신", 175, 75);
	
	 System.out.println(personKim.name);
	 System.out.println(personKim.weight);
	 System.out.println(personKim.height);
	 System.out.println(personLee.name);
	 System.out.println(personLee.weight);
	 System.out.println(personLee.height);
	 
 }
}
