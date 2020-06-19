
public class Testingpoint {

	static int p=3;//global variable
	
	int e=5;//instant variable
	
	
	public static void main(String[] args) {
		//obj is refrence variable
		Testingpoint obj = new Testingpoint();
	      System.out.println(obj.e);
	
	obj.test();
	
	System.out.println(Testingpoint.p);
	
		
		
		
	}
	
	
	public void test() {
		//local variable
		int c=6;
		
	System.out.println(c);
		
		
	}

}
