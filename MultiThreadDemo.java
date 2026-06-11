package MultiThreadingDemo;

public class MultiThreadDemo {
	public static void main(String[] args) {
		Alpha t1 = new Alpha("A1");
		Beta t2 = new Beta("B2");
		Gama t3 = new Gama("C3");
		
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
