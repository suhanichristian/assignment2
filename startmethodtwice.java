/*W.A.J.P to start the same Thread twice by calling start () method twice. Test 
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); */


package assignment;

public class startmethodtwice {
	public static void main(String[] args) {
		Threadtwice1 t1 = new Threadtwice1();
		t1.start();
		
		Threadtwice1 t2 = new Threadtwice1();
		t2.start();
	}
}

class Threadtwice1 extends Thread {
	@Override
	public void run() {
		System.out.println("thread is running");
	}
}