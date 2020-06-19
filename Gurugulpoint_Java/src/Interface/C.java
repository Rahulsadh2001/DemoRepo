package Interface;

public class C implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   C pt = new C();
   pt.calling();
   pt.gallery();
}

	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling");
	}

	@Override
	public void gallery() {
		// TODO Auto-generated method stub
		System.out.println("gallery");
	
	}
	
}
