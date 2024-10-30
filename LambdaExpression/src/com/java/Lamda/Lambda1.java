/*   WHY TO USE LAMBDA ?
 * 1.Enable functional Programming.
 * 2.Readable and concise code.
 * 3.Easier to use in APIs and Libraries.
 * 4.Enable support in parallel processing
 * */
package com.java.Lamda;

class Greeting
{
	public void greeting(Greet greeting)
	{
		greeting.greet();
	}
	
}
public class Lambda1 
{

	public static void main(String[] args) 
	{
		Greeting gp= new Greeting();
		//gp.greeting();
		Greet hpd= new HappyDiwali();//We implemented a class for Interface method using class reference
		gp.greeting(hpd);
		
		//Anonymous inner class
		Greet innerclass= new Greet()
		{
			public void greet()
			{
				System.out.println("Happy Diwali");
			}};
			//We can pass either class reference or innerclass reference
			gp.greeting(innerclass);
			gp.greeting(hpd);
		
		//Use Of Lamda expression 
		Greet gpk=()->System.out.println("Happy New Year");//Here we are not creating class we creating lambda for interface
		
		gpk.greet();
	}

}
