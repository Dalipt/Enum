package com.java.multithreading;

import java.util.Scanner;

class Alpha3 implements Runnable
{
	public void run()
	{
		String thread=Thread.currentThread().getName();
		if(thread.equals("Banking"))
		{
			Banking();
		}
		else if(thread.equals("Printing"))
		{
			StarPrinting(); 
		}
		else 
		{	
			Printing();
		}
	}
	public void Banking()
	{
	System.out.println("Banking activity Started.");
	Scanner sc= new Scanner(System.in);
	System.out.println("Please Enter your username:");
	int username=sc.nextInt();
	System.out.println("Please Enter your password:");
	int password=sc.nextInt();
	System.out.println("Banking activity Ended.");
}
	public void StarPrinting() 
	{	
	System.out.println("Star Printing activity started... ");
	for(int a=0;a<=4;a++)
	{
		System.out.println("*******");
		try {
			Thread.sleep(2000);
		} 
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	System.out.println("Star Printing activity ended... ");
}
	public void Printing() 
	{
	System.out.println("Printing activity started... ");
	for(int a=0;a<=4;a++)
	{
		System.out.println("Bank Copy Printing started");
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	System.out.println("Bank Copy Printing activity ended... ");
}
}
public class SingleRunMethod {

	public static void main(String[] args) throws InterruptedException
	{
		{
			System.out.println("Program Excution started....");
			//created class references
			Alpha3 al= new Alpha3();
			//passes thread reference to Thread class
			Thread td= new Thread(al);
			Thread td1= new Thread(al);
			Thread td2= new Thread(al);
			td.setName("Banking");
			td1.setName("Printing");
			td2.setName("BankcopyPrinting");
			td.start();
			td1.start();
			td2.start();
			System.out.println("Program Excution ended....");
		}

	}

}
