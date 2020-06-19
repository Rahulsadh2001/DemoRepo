
public class G {

	public static void main(String[] args) {
	
		 try{
	       float i=1/0;
	         System.out.println("First print statement in try block"+i);
	     }
	     catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	     }

	}

}
