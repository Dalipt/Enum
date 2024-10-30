/*   WHY TO USE LAMBDA ?
 * 1.Enable functional Programming.
 * 2.Readable and concise code.
 * 3.Easier to use in APIs and Libraries.
 * 4.Enable support in parallel processing
 * */
package com.java.Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseImplementusingJava8 {

	public static void main(String[] args) 
	{
		List<Person> people= Arrays.asList(new Person("Aman","Kumar",66),
				new Person("Raman","Sehgal",33),
				new Person("Arman","Kuar",56),
				new Person("Amaan","Kumar",06)
				);
		//Rule 1.sort list of last name using lamda
		Collections.sort(people,(o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
		/*{ THIS IS CODE WITHOUDT LAMBDA
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
		}*/
		//Rule 2.Create method that print all items of list
		System.out.println("Printing list of elements");
		printAll(people);
		
		//here if we have requirement to filter name of other last word we need to create new method
		//System.out.println("Printing list of items based on last name start with specific word KU");
		System.out.println("Printing list of items based on last name start with specific word KU");
		printLastNameStartwithC(people);//We written this method to sort name start with last name Ku

		//So we create this Condition1 using interface so we if we need another Condition1 we simply change implementation not whole method
		
		//Using Lambda
		printCondition1ally(people, p-> p.getLastName().startsWith("KU"));
		//Implementation without Lamda
		/*printCondition1ally(people, new Condition1()
				{
					public boolean test(Person p) 
					{
						return p.getLastName().startsWith("KU");
					} 
			
				});*/
		System.out.println("Printing list of items based on First name start with specific word Am");
		//Using Lambda
		printCondition1ally(people, p-> p.getFirstName().startsWith("Am"));
		//Implementation without Lamda
		/*printCondition1ally(people, new Condition1()
		{
			public boolean test(Person p) 
			{
				return p.getFirstName().startsWith("Am");
			} 
	
		});*/
	}
	//Rule 3.create method that print names with whose last name start is Ku
	
	private static void printLastNameStartwithC(List<Person> people)
	{
		for(Person p:people)
		{
			if(p.getLastName().startsWith("Ku"))
			{
			System.out.println(p);
			}
		}
	}
	
	private static void printCondition1ally(List<Person> people,Condition1 Condition1)
	{
		for(Person p:people)
		{
			if(Condition1.test(p))
			{
			System.out.println(p);
			}
		}
	}
	
	private static void printAll(List<Person> people)
	{
		for(Person p:people)
		{
			System.out.println(p);
		}
	}
}

interface Condition1
{
	boolean test(Person p);
}
