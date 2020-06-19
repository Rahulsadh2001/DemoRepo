package polymorphism;

public class T extends P {

	public static void main(String[] args) {
		
		T obj = new T();
	//	obj.show(); //method overiding it will call show method of T class
		
		P obj2 = new T();
		obj2.show();
		
	P obj3 = new P();
	//obj3.show();
				
		// TODO Auto-generated method stub

	}

	
public void show() {
		
		System.out.println("show value class T");
	}
	

}
