package Constructor;

public class C {

	//constructor is a member function with the same name as a class name
	//construction return memory
	//
	C(int i)
	
	{
		
		System.out.println(i);
	}
	
	
	C(){
		
		System.out.println("rahul");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 

		C obj= new C();
		
		C obj2 = new C(5);
		
		}

}
