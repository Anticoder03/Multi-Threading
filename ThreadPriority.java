package MultiThreadingDemo;

public class ThreadPriority {
	public static void main(String[] args) {
		System.out.println("main threrad priority: " + Thread.currentThread().getPriority());
		
		Alpha a1 = new Alpha("a");
		System.out.println("Default priority: " + a1.getPriority());
		System.out.println("After seeting it to 6");
		a1.setPriority(6);
		System.out.println("After priority: " + a1.getPriority());
	}
}
