package ex;

public class DogTest1 {
	private String name;
	private String tpye;
	
		public DogTest1 () { }
		
		public DogTest1 (String name, String tpye) {
			this.name = name;
			this.tpye = tpye;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTpye() {
			return tpye;
		}

		public void setTpye(String tpye) {
			this.tpye = tpye;
		}
		public String showDogTest1Info( ) {
			return name + "," + tpye;
		}
	
	

}
