/*   WHY TO USE LAMBDA ?
 * 1.Enable functional Programming.
 * 2.Readable and concise code.
 * 3.Easier to use in APIs and Libraries.
 * 4.Enable support in parallel processing
 * */
package com.java.Lamda;
//Writing lambda using interface make it more backward compatible
//If an interface having on abstract method ===best candidate to use as lambda
//So one interface where there is only one abstract method is known as Functional Interface
//From java 8 
//If any other person add any new abstract method to an single abstract method interface it will fail
//So Java use special annotation @FunctionalInterface to tell implementer no scope here its functional interface 
public class RunnableExample {

	public static void main(String[] args)
	{
		//So one interface where there is only one abstract method is known as Functional Interface
		Thread myThread= new Thread(new Runnable()
		{

			public void run() 
			{
				
			}	
		});
		myThread.run();
		//So runnable is only having run() method we can write it using lambda
		Thread mylambda= new Thread(()->System.out.println("Printing inside Runnable"));
		mylambda.run();
	}

}
