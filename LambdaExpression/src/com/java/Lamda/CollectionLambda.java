/*   WHY TO USE LAMBDA ?
 * 1.Enable functional Programming.
 * 2.Readable and concise code.
 * 3.Easier to use in APIs and Libraries.
 * 4.Enable support in parallel processing
 * */
package com.java.Lamda;

import java.util.Arrays;
import java.util.List;

public class CollectionLambda {

	public static void main(String[] args) 
	{
		List<Person> people= Arrays.asList(new Person("Aman","Kumar",66),
				new Person("Raman","Sehgal",33),
				new Person("Arman","Kuar",56),
				new Person("Amaan","Kumar",06)
				);
		System.out.println("Printing collection with for loop");
		for(int i=0 ; i<people.size();i++)
		{
			System.out.println(people.get(i));
		}
		
		System.out.println("Printing collection with in loop");
		for(Person p: people)
		{
			System.out.println(p);
		}
		//Above run sequencally we telling start end and iteration order
		//Above we call internal iterator

		//Below we call internal iterator

		//Why its comes in Java 8 IN case of multithreading and parallesim We telling cpu our parameters
		//Its all cpu 
		System.out.println("Printing collection lambda");
		//people.forEach(p ->System.out.println(p));
		//New for each comes in java 8 makes easy process to run multiple thread
		people.forEach(System.out::println);
	}

}
