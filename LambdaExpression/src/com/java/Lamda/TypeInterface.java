/*   WHY TO USE LAMBDA ?
 * 1.Enable functional Programming.
 * 2.Readable and concise code.
 * 3.Easier to use in APIs and Libraries.
 * 4.Enable support in parallel processing
 * */
package com.java.Lamda;

public class TypeInterface 
{

	public static void main(String[] args) 
	{
		//(1).StringLengthLambda lambda= (String str) ->str.length();
		//In case of lambda compiler already know about what is type so we remove String argument here
		//StringLengthLambda lambda= (str) ->str.length();
		//(2)If we have only one input argument on our lambda we can remove parenthesis
		StringLengthLambda lambda= str ->str.length();//Lambda function take input from interface
		System.out.println(lambda.getLength("Hello Lambda"));	
		
		printlambda(str->str.length());
	}	

public static void printlambda(StringLengthLambda l)
{
	System.out.println(l.getLength("Hello Lambda"));
}

interface StringLengthLambda
	{
		int getLength(String str);
	}
		
}


