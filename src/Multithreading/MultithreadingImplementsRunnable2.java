package Multithreading;

public class MultithreadingImplementsRunnable2 implements Runnable{

	private int threadNumber;
	public MultithreadingImplementsRunnable2(int threadNumber) {
		this.threadNumber =threadNumber;
		
	}
	
	@Override
	public void run() {
		for(int i = 0; i<5;i++) {
			System.out.println(i + " Printhing from Thread No " + threadNumber);
			
		/*	if(threadNumber ==3) {
				throw new RuntimeException();
			} // so we can see even after exception it prints the values
			*/
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
