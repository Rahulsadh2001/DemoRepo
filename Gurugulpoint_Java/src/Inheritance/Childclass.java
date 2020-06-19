package Inheritance;


// Child class object & child class refrence this will allow to access both all the methods of base class and child class

// base class object & base class refrence this will allow to access all the methods of base class .

//base class refrence & child class object this will allow to access only base class methods not child class methods

//child class refrence & base class object it is not true

public class Childclass extends Baseclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Baseclass b = new Childclass(); //runtime poymorphism
		b.add();
		b.sub();
		
		Childclass c = new Childclass();//compile time polymorphism
		c.multi();
		c.devi();
		c.add();
		c.sub();
		
		
	}

	public void multi()
	
	{
		
		System.out.println("multiplications");
	}
	
	public void devi() {
		
		System.out.println("devided");
	}
}
