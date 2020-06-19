package Abstract;

public class A extends Son{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//comment
		A a = new A();
	a.mobile();
     a.test();
     }

}
//if method is abstract so it is mandotiry to class should be abstract

 abstract class Father{
	
	abstract void mobile();
	
	public void test() {
		
		
		System.out.println("testing");
	}
	
}

class Son extends Father{
	void mobile() {
		
		System.out.println("testing by parents");
		
	}
	
	
} 