package Multithreading;

public class MultithreadingMainRunnable2 {

	public static void main(String[] args) {
		for(int i =0 ; i<5;i++) {
		MultithreadingImplementsRunnable2 myThing = new MultithreadingImplementsRunnable2(i);
		Thread myThread = new Thread(myThing);
		myThread.start();
		
		/*
		try {
			myThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
	 //.join() method waits for above thread to die and then prints the next thread
	 //.isAlive() method retunts a boolean if a thread is alive or not it is running or not	
		}

	}

}
