/*W.A.J. P to create one thread by implementing Runnable interface in 
Class. */


package assignment;

class MyRunnable implements Runnable {
	public void run() {
		for(int i = 1; i <= 5; i++) {
		System.out.println("Thread is running:- " +i);
		try {
			Thread.sleep(1000); //Sleep for 1 second
		} catch (InterruptedException e) {
			System.out.println(e);
			}
		}
	}
}
public class threadinterrun {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		
		t.start();
	}

}
