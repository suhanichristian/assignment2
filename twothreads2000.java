/*W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
2000ms and check the execution.*/


package assignment;

public class twothreads2000 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new run1("Thread 1"));
		t1.start();
		
		Thread t2 = new Thread(new run1("Thread 2"));
		t2.start();
	}
}

class run1 implements Runnable {
	private String threadName;
	
	public run1(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		System.out.println(threadName + " is running.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadName + " has finished.");
	}
}
