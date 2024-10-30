package com.java.multithreading;
//Proper use of Synchronized keyword remove deadlock
class CarShowroom implements Runnable
{
	String car= new String("Hyundai");
	String car1= new String("Maruti");
	String car2= new String("Honda");
	/*Due to cyclic dependency amongst resource or one resource is acquired by one thread 
	and second thread need that resource both stuck this scenarios is known as deadlock*/
	public void run()
	{
		String st=Thread.currentThread().getName();
		if(st.equals("Showroom"))
		{
			try
			{
				System.out.println("Car one got into showroom");
				Thread.sleep(3000);
				synchronized(car)
				{
					System.out.println("showroom found car"+ car);
					Thread.sleep(3000);
				synchronized(car1)
				{
					System.out.println("showroom found car"+ car1);
					Thread.sleep(3000);
					synchronized(car2)
					{
						System.out.println("showroom found car"+ car2);
						Thread.sleep(3000);
				}
				}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}}
	else
	{
		try
		{

			Thread.sleep(3000);
			synchronized(car2)
			{
				System.out.println("Car 2 got into Showroom");
				System.out.println("showroom1 found car"+ car2);
				Thread.sleep(3000);
			synchronized(car1)
			{
				System.out.println("showroom1 found car"+ car1);
				Thread.sleep(3000);
				synchronized(car)
				{
					System.out.println("showroom1 found car"+ car);
					Thread.sleep(3000);
			}
			}}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}}

/*In below example car one and car 2 both went into showroom showroom1 showroom acquired
 * carMaruti and carHyundai and showroom 1 already acquired carHonda Showroom required 3 car that is
 * Maruti for further execution but its already locked ot taken by Showroom1 now no showroom complete order due to cyclic dependency*/
public class DeadLockImplementation 
{
	public static void main(String[] args) 
	{
		CarShowroom cr= new CarShowroom();
		
		Thread thread1= new Thread(cr);
		Thread thread2= new Thread(cr);
	
		thread1.setName("Showroom");
		thread2.setName("Showroom1");
		
		thread1.start();
		thread2.start();

	}
}

