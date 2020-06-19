package Abstract;

public abstract class Abstract {
 
	abstract void test();
	
	
	public void test2() {
		
		
		System.out.println("testing abstarct method");
	}
	
}




class Rahul extends Abstract{
	
	void test()
	{
		
		System.out.println("success implement abstarct method");
		
	}	
	
}


class Hershit{
	public static void main(String[] args) {
	
		Rahul rj = new Rahul();
		rj.test();
		rj.test2();
		
		Abstract abs = new Rahul();
		
		abs.test();
		
		
	}
	
}
