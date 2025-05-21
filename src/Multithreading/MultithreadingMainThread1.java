package Multithreading;

public class MultithreadingMainThread1 {

	public static void main(String[] args) {
		
		for(int i =0; i<5;i++) {
			MultithreadingExtendsThread1 mything = new MultithreadingExtendsThread1(i);
			mything.start();
		} 
		//throw new RuntimeException(); 
		//if we throw exception in main also it runs even after exception
		/*
		MultithreadingExtendsThread1 mything = new MultithreadingExtendsThread1();
		MultithreadingExtendsThread1 mything2 = new MultithreadingExtendsThread1();
		
		
		mything.run();// if we run like thins it will print 0 1 2 3 4 and 0 1 2 3 4
		mything2.run();// which is not multithreaded to make it multithreaded use .start() method
		
		mything.start();
		mything2.start(); // 00 11 22 33 44 multithreaded apparaoch
		*/
	}

}
