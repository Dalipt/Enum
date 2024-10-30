package com.java.Lamda;

import java.util.Arrays;
import java.util.*;

class Person
{
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
}

public class Exercise {

	public static void main(String[] args)
	{
		List<Person> people= Arrays.asList(new Person("Aman","Kumar",66),
				new Person("an","ar",33),
				new Person("Arman","Kur",56),
				new Person("Amaan","Kumar",06)
				);
		//Rule 1.sort list of last name
		//Rule 2.Create method that print all items of list
		//Rule 3.create method that print names with whose last name start is Ku
		
		
	}

}
