/*   WHY TO USE LAMBDA ?
 * 1.Enable functional Programming.
 * 2.Readable and concise code.
 * 3.Easier to use in APIs and Libraries.
 * 4.Enable support in parallel processing
 * */
package com.java.Lamda;
//So basically Lambda expression Don't care about Interface who only need matching abstract method of Lambda EXPRESSION
//IF YOU FOUND AN INTERFACE ON JAVA.UTIL.FUNCTION MATCHING YOUR REQUIREMENT USE IT instead implement it 
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
//In this example we using on Interface and using that but from Java 8 We have a Interface Known as PREDICATE<T> return boolean
//IN our example we have interface which is returning a Boolean so we can use Predicate
public class ExerciseImplementusingJava8i {

	public static void main(String[] args) 
	{
		List<Person> people= Arrays.asList(new Person("Aman","Kumar",66),
				new Person("Raman","Sehgal",33),
				new Person("Arman","Kuar",56),
				new Person("Amaan","Kumar",06)
				);
		//Rule 1.sort list of last name using lamda
		Collections.sort(people,(o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
		
		//Rule 2.Create method that print all items of list
		System.out.println("Printing list of elements");
		printCondition2ally(people, p-> true);
		
		//here if we have requirement to filter name of other last word we need to create new method
		
		System.out.println("Printing list of items based on last name start with specific word KU");
		printLastNameStartwithC(people);//We written this method to sort name start with last name Ku

		//So we create this Condition2 using interface so we if we need another Condition2 we simply change implementation not whole method
		
		//Using Lambda
		printCondition2ally(people, p-> p.getLastName().startsWith("KU"));
		
		System.out.println("Printing list of items based on First name start with specific word Am");
		//Using Lambda
		printCondition2ally(people, p-> p.getFirstName().startsWith("Am"));
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
	
	private static void printCondition2ally(List<Person> people,Predicate<Person> predicate)
	{
		for(Person p:people)
		{
			if(predicate.test(p))
			{
			System.out.println(p);
			}
		}
	}
	
	/*private static void printAll(List<Person> people)
	{
		for(Person p:people)
		{
			System.out.println(p);
		}
	}*/
}//We used Predicate Functional Interface now we don't required this interface because its method returning Boolean
/*interface Condition2
{
	boolean test(Person p);
}*/