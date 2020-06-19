package Inheritance;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child c=new Child();
		
		c.method2();
		
		c.method1();
		
	}

	
	public void method2() {
		
		System.out.println("Calling chid class method");
		
	}
	
}
