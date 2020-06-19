package Constructor;

public class W {

	
	W()//default constructor without arguments
	
{System.out.println("calling constructer");}
	
	
	W(int t) //with arguments
	{
		
		System.out.println("single parameter");
		
	}
	
	
	
	W(int c,int d){
		
		System.out.println("double parameter");
	}
	public static void main(String[] args) {
		
      W obj = new W();
		
	}

}
