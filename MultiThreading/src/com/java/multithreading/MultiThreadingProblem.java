package com.java.multithreading;
/*Using single threaded application if control is in specifice place and nothing happens
 * all application execution halted there is no specific way we can execute tasks simultaously
 * even if we implements its in diffrents classes  
 * */
import java.util.Scanner;

class Alpha
{
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
class Beta
{
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
class Gamma
{
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
public class MultiThreadingProblem {

	public static void main(String[] args) throws InterruptedException 
	{
		
		Alpha al= new Alpha();
		al.Banking();
		Beta bl= new Beta();
		bl.StarPrinting();
		Gamma gm= new Gamma();
		gm.Printing();
		
		/*  				Activity 1
		 * System.out.println("Program Excution started....");
		 * System.out.println("Banking activity Started."); 
		 * Scanner sc= new Scanner(System.in); 
		 * System.out.println("Please Enter your username:"); 
		 * int username=sc.nextInt();
		 * System.out.println("Please Enter your password:"); 
		 * int password=sc.nextInt(); System.out.println("Banking activity Ended.");
		 * Thread.sleep(5000);
							Activity 2
		System.out.println("Star Printing activity started... ");
		for(int a=0;a<=4;a++)
		{
			Thread.sleep(5000);
			System.out.println("*******");
		}
		System.out.println("Star Printing activity ended... ");
		 
							Activity3
		System.out.println("Printing activity started... ");
		for(int a=0;a<=4;a++)
		{
			Thread.sleep(5000);
			System.out.println("Bank Copy Printing started");
		}
		System.out.println("Bank Copy Printing activity ended... ");
		*/
		System.out.println("Program Excution Ended....");
	}

}
