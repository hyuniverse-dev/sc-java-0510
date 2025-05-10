package part1.section10_extends.access1;

public class Extends05_1 {
	
	public static void main(String[] args) {
		
		ProtectedA protectedA = new ProtectedA(11);
		protectedA.printA();
		
		DefaultA defaultA = new DefaultA(12);
		defaultA.printA();
		
		 PrivateA privateA = PrivateA.getInstance();
		 
		
	}

}
