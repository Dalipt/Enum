package com.java.Lamda;
//Its mandatory to write exactly matching lamda implementation 
//A lamda is actually a function interface
//If any other person add any new abstract method to an single abstract method interface it will fail
//So Java use special annotation @FunctionalInterface to tell implementer no scope here its functional interface  
@FunctionalInterface
public interface Greet
{
	public void greet();
}
