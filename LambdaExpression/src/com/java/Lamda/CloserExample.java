/*   WHY TO USE LAMBDA ?
 * 1.Enable functional Programming.
 * 2.Readable and concise code.
 * 3.Easier to use in APIs and Libraries.
 * 4.Enable support in parallel processing
 * */
package com.java.Lamda;

public class CloserExample {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20; 
		//We can do this with lambda instead of Inner class
		doProcess(a, i -> System.out.println(i+b));
		/* Implementation using Inner class
		 *doProcess(a, new Process(i));
		{
			
			public void process(int i)
			{
				//its similar to final in java 7 we cannot resign value for b again in method 
				//Local variable b defined in an enclosing scope must be final or effectively final
				//b=20;
				System.out.println(i+b);
			}
			
			
		});*/
	}

	private static void doProcess(int a, Process p)
	{
		p.process(a);
	}

}
interface Process
{
void process(int i);	
}