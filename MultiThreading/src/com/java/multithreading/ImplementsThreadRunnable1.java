package com.java.multithreading;

class MyCar1 implements Runnable
{
	//If we have single resource and multiple threads we use Synchronized keyword even delay
	//In Synchronized environment single thread run multihreading allow but only thread execute
	//Single resource and whole resources can be synchronized
	public  void run() 
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" has entered in parking lot");
			Thread.sleep(4000);
			//We are looking specific part of code
			synchronized(this)
			{
			System.out.println(Thread.currentThread().getName()+" has entered into car");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has started driving car");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has parked car after driving");
		}}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
public class ImplementsThreadRunnable1 {

	public static void main(String[] args) 
	{
		MyCar1 mc= new MyCar1();
		
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