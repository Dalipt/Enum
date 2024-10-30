package com.java.Streams;
//A Sequenence of elements supporting sequential and parallel aggregate operations
//Every collection from Java 8 have specific Stream method 
//On a stream we can modify the elements of stream
//A stream consist of 3 elements 1.Source basically collection 2.All the operation perform on stream 3. Terminal(end)operation
import java.util.Arrays;
import java.util.List;

public class Stream
{
	public static void main(String[] args) 
	{
		List<Person> people= Arrays.asList(new Person("Aman","Kumar",66),
				new Person("Raman","Sehgal",33),
				new Person("Arman","Kuar",56),
				new Person("Amaan","Kumar",06)
				);
		people.stream().filter(p->p.getLastName().startsWith("Ku")).forEach(p -> System.out.println(p.getLastName()));
		long count=people.stream().filter(p->p.getLastName().startsWith("K")).count();
		System.out.println(count);
		
		//Functional programming allowed by stream
		people.parallelStream().isParallel();
	}
}
