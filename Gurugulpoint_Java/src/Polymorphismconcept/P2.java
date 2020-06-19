package Polymorphismconcept;

public class P2 extends Pc {

	public static void main(String[] args) {
		
		P2 obj = new P2();
		
	//	obj.show();
		Pc obj3 = new Pc();
		//obj3.show();
		
		Pc t = new P2();
	
		
		t.show();
		
		
	}

	
	public void show() {
		
		System.out.println("calling child class");
		
	}
	
}


class main{
	public static void main(String[] args) {
	
	Pc n= new P2();
	

	
	}
	
}
