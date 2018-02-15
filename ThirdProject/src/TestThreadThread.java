import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadThread extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + 
				"This is currently running on the main thread, " + " the id is: " + Thread.currentThread().getId());
		TestThreadThread worker = new TestThreadThread();
		Thread thread = new Thread(worker);
		thread.start();
		Thread t2 = new Thread(worker);
		t2.start();
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		Thread t5 = new Thread(worker);
		t5.start();
		Thread t6 = new Thread(worker);
		t6.start();
		Thread t7 = new Thread(worker);
		t7.start();
		
		ldt = LocalDateTime.now();
		System.out.println(ldt + " : main finished running . . . . " );

	}

	@Override
	public void run() {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + 
				"This is currently running on a separate thread, " + "the id is : " + Thread.currentThread().getId() + "with name : " + Thread.currentThread().getName() + " , with priority : " +Thread.currentThread().getPriority());
	for (int i=0;i<1000;i++) {
		
	}
	ldt = LocalDateTime.now();
	System.out.println(ldt + 
			"This is currently running on a separate thread, " + "the id is : " + Thread.currentThread().getId() + "with name : " + Thread.currentThread().getName() + " , with priority : " +Thread.currentThread().getPriority());	
	}

}
