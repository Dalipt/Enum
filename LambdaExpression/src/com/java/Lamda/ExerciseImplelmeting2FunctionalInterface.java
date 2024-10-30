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
import java.util.function.Consumer;
import java.util.function.Predicate;
//In this example we using on Interface and using that but from Java 8 We have a Interface Known as PREDICATE<T> return boolean
//IN our example we have interface which is returning a Boolean so we can use Predicate
public class ExerciseImplelmeting2FunctionalInterface {

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
		//First Figure out what lambda expression will do then create INterface and Abstract Method
		//Here we passing system out print which print object as lambda
		//Now we need to pass third argument for printing in method if want to implement below lambda
		//Great I found one Lambda name as consume who parameter is OBject and Return nothing perfect for my SYSTEM.OUT.PRINTLN()
		performConditionally(people, p-> true,p ->System.out.println(p));	
		//Using Lambda
		performConditionally(people, p-> p.getLastName().startsWith("KU"),p ->System.out.println(p));
		
		System.out.println("Printing list of items based on First name start with specific word Am");
		//Using Lambda
		performConditionally(people, p-> p.getFirstName().startsWith("Am"),p ->System.out.println(p.getFirstName()));
	}
	//Rule 3.create method that print names with whose last name start is KU
	//In Below I FOUND TWO BEAUTIFUL LAMBDA Predicate and Consumer from FUNCTIONAL INTERFACE PACKAGE
	//Represents a predicate (boolean-valued function) of one argument which giving me boolean return for PERSON. 
	//Represents an operation that accepts a single input argument and returns noresult which here giving me SYSTEM>OUT>PRINTLN().
	private static void performConditionally(List<Person> people,Predicate<Person> predicate,Consumer<Person> consumer)
	{
		for(Person p:people)
		{
			if(predicate.test(p))//FUnctionalINTERFACE 1
			{
			consumer.accept(p);	//FUnctionalINTERFACE 2
			//System.out.println(p);
			}
		}
	}}
	
