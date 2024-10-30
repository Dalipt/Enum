package com.java.multithreading;

class MyCar implements Runnable
{
	//If we have single resource and multiple threads we use Synchronized keyword even delay
	//In Synchronized environment single thread run multihreading allow but only thread execute
	
	public synchronized void run() 
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" has entered in parking lot");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has entered into car");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has started driving car");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has parked car after driving");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
public class ImplementThreadRunnable {

	public static void main(String[] args) 
	{
		MyCar mc= new MyCar();
		
		Thread td= new Thread(mc);
		Thread td1= new Thread(mc);
		Thread td2= new Thread(mc);
		
		td.setName("Rama");
		td1.setName("Shyam");
		td2.setName("Raju");
		td.start();
		td1.start();
		td2.start();
	}

}
