package MultiThreadingDemo;

public class Alpha extends Thread{
	public Alpha(String name) {
		Thread.currentThread().setName(name);	
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}

}
