package com.java.Annotations;
/*==We have done a small mistake while calling information about to code required.
 * A new way to maintaining code(meta)of code to JVM, Developer,everyone using Annotation. 
 * This feature come from java 1.5v
 * Every annotation can't use any location there is specified annotation with respect to class
 * method variables
 * 
 * */
class Animal
{
	public void AnimalHuntsAndEat()
	{
		System.out.println("Animal is eating");
	}
}
class Tiger extends Animal
{
	@Override
	public void AnimalHuntsAndEat()
	{
		//overriding Parent 
		System.out.println("Tiger hunts and eat");
	}
	
}
public class Annotation {

	public static void main(String[] args) 
	{
		Tiger tg= new Tiger();
		tg.AnimalHuntsAndEat();
	}

}
