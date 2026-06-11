package MultiThreadingDemo;

public class SingleThreadDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		for (int i=1;i<=10;i++) {
			System.out.println(i);
		}
		for (int i=11;i<=20;i++) {
			System.out.println(i);
		}
		for (int i=21;i<=30;i++) {
			System.out.println(i);
		}
	}
}
