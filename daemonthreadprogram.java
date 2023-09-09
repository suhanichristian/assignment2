/*W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set 
Daemon () method of Thread class and check whether the thread is set daemon or 
not by using is Daemon () method. 
TestDaemonThread2 t1=new TestDaemonThread2(); 
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start(); 
t1.setDaemon(true);//will throw exception here t2.start(); 
Write a Java program to create a new array list, add some colors (string) and print out 
the collection.*/


package assignment;

public class daemonthreadprogram {
	public static void main(String[] args) {
		TestDaemonThread2 t1 = new TestDaemonThread2();
		TestDaemonThread2 t2=new TestDaemonThread2();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		
		if (t1.isDaemon()) {
			System.out.println("t1 is a daemon thread.");
		} else {
			System.out.println("t1 is not a daemon thread.");
		}
		
		if (t2.isDaemon()) {
			System.out.println("t2 is a daemon thread.");
		} else {
			System.out.println("t2 is not a daemon thread.");
		}	
	}
}

class TestDaemonThread2 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running.");
	}
}
