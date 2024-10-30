package com.java.multithreading;
/*First way to achieve multithreading is to extends Thread class
 * Whenever we need to create a new Thread we need to create object of thread class 
 * Once we created a new thread we must implement a Run() method and define what task this thread will do
 * using Run() method */

import java.util.Scanner;

class Alpha1 extends Thread
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
class Beta1 extends Thread
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
class Gamma1 extends Thread
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
public class ExtendsRun {

	public static void main(String[] args) throws InterruptedException
	{
		//Whenever we create a thread object created and start execution
		//Apart from defining activity on run() method we must give life or register to JVM by thread scheduler
		//Below code is single threaded no Start() method given
		Alpha1 al= new Alpha1();
		//al.run();
		//Here thread schedule start execution but can't have control for execution
		//If default scheduled not allow thread to waste cpu cycle.
		al.start();
		Beta1 bl= new Beta1();
		//b1.run();
		bl.start();
		Gamma1 gm= new Gamma1();
		//gm.run();
		gm.start();
		//Here thread schedule start execution but can't have control for execution
		//We need to control this execution
	}

}
