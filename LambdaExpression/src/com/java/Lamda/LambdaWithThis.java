/*   WHY TO USE LAMBDA ?
 * 1.Enable functional Programming.
 * 2.Readable and concise code.
 * 3.Easier to use in APIs and Libraries.
 * 4.Enable support in parallel processing
 * */
package com.java.Lamda;

public class LambdaWithThis 
{
	public void doProcess(int i, Process p)
	{
		p.process(i);
	}
	public void execute()
	{
		doProcess(20, i ->
		{
			System.out.println("Value of i is"+ i);
			System.out.println(this);//This is not in static context so we can use it
		});
	}

	public static void main(String[] args)
	{
		LambdaWithThis td= new LambdaWithThis();
		td.execute();
		//using lambda 
		td.doProcess(10, i ->
		{
			//System.out.println("Value of i is"+ i);
			//System.out.prinln(this);
			//This reference won't work in case of lambda expression
			//Instance of lambda won't check this reference its won't override this reference
		});
	}}
		//Using anonyms inner class
		/*td.doProcess(10,new Process()
		{
			public void process(int i) 
			{
				System.out.println("Value of i is"+ i);
				System.out.println(this);
			}
			public String toString() 
			{
				return "This is annonyms inner class";
			}
			
		});
	}

}*/
