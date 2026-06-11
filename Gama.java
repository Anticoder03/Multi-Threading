package MultiThreadingDemo;

public class Gama extends Thread{
	public Gama(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		for(int i=21;i<=30;i++) {
			System.out.println(i);
		}
	}
}
