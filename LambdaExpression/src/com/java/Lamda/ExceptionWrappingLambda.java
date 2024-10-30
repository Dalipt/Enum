/*   WHY TO USE LAMBDA ?
 * 1.Enable functional Programming.
 * 2.Readable and concise code.
 * 3.Easier to use in APIs and Libraries.
 * 4.Enable support in parallel processing
 * */
package com.java.Lamda;
import java.util.*;
import java.util.function.BiConsumer;
public class ExceptionWrappingLambda {

	public static void main(String[] args)
	{
		int [] showNumber= {1,2,3,4};
		Scanner sc=new Scanner(System.in);
		System.out.print("Please input Value:");
		int key=sc.nextInt();
		//This below missing( wated my 1 hour
		//process(showNumber,key, wrapperLambda(v, k) -> System.out.println(v / k)));
		process(showNumber, key, wrapperLambda((v, k) -> System.out.println(v % k)));
	}

	private static void process(int[] showNumber, int key,BiConsumer<Integer,Integer> consumer )
	{
		for(int i:showNumber)
		{
			consumer.accept(i,key);
		}
		
	}
	private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer)
	{
		return(v,k)->{
			try {
				consumer.accept(v,k);
			} 
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		};
	}
}
