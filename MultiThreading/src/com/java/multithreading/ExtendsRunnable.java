package com.java.multithreading;

import java.util.Scanner;

class Alpha2 implements Runnable
{
	public void run()
	{
		Banking();
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
}}
class Beta2 implements Runnable
{
	public void run()
	{
		try {
			StarPrinting();
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void StarPrinting() throws InterruptedException
	{	
	System.out.println("Star Printing activity started... ");
	for(int a=0;a<=4;a++)
	{
		System.out.println("*******");
		Thread.sleep(2000);
	}
	System.out.println("Star Printing activity ended... ");
}}
class Gamma2 implements Runnable
{
	public void run()
	{
		try {
			Printing();
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public void Printing() throws InterruptedException
	{
	System.out.println("Printing activity started... ");
	for(int a=0;a<=4;a++)
	{
		System.out.println("Bank Copy Printing started");
		Thread.sleep(2000);
	}
	System.out.println("Bank Copy Printing activity ended... ");
}
}

public class ExtendsRunnable {

	public static void main(String[] args) throws InterruptedException
	{
		{
			System.out.println("Program Excution started....");
			//created class references
			Alpha2 al= new Alpha2();
			Beta2 b2= new Beta2();
			Gamma2 gm2=new Gamma2();
			//passes thread reference to Thread class
			Thread td= new Thread(al);
			Thread td1= new Thread(b2);
			Thread td2= new Thread(gm2);
			//Need to give life to then USing Start()
			System.out.println(td.isAlive());//give false
			//Join method tell main thread please wait once one thread complete then 
			td.start();
			System.out.println(td.isAlive());//give true
			td.join();
			td1.start();
			td1.join();
			td2.start();
			td2.join();
			
			System.out.println("Program Excution ended....");
		}

	}

}
