package MultiThreadingDemo;

public class Beta extends Thread{
	
	public Beta(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=11;i<=20;i++) {
			System.out.println("\t " + i);
		}
		
	}
}
