//W.A.J. P to create one thread by extending Thread class in another Class.


package assignment;

class MyThread extends Thread {
	public void run() {
		System.out.println("Thread is running.");
	}
}

public class extendingthreadclass {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		
		mt.start();
	}
}
