package Oops_concept;

public class Bankdev implements Interface,Bankfeature {

	public static void main(String[] args) {
		Bankdev dev = new Bankdev();
		dev.changepincode();
		
		Interface dev2 = new Bankdev();//runtime polymorphism
		//Bankdev dev3 = new Interface();
	
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public void checkbalance() {
		System.out.println("testing");// TODO Auto-generated method stub
		
	}

	@Override
	public void accountsummery() {
		System.out.println("testing");// TODO Auto-generated method stub
		
	}

	@Override
	public void changepincode() {
		// TODO Auto-generated method stub
		System.out.println("testing");
	}

	@Override
	public void craditcard() {
		// TODO Auto-generated method stub
		System.out.println("testing");
	}

	
	public void testingdev() {
		System.out.println("testing");
	}
	
}
