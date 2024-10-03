package com.java.Annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

/*Cricket class telling about cricket innings
*After compilation this comment having no power to anyone 
*I have to give this code info to jvm
*
*/
//@specified compiler which tell annotation is created
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.MODULE,ElementType.METHOD})//Meta annotation telling which component annotation written
@Retention(RetentionPolicy.RUNTIME) //Its simply specifying what time its scope
@interface Player
{
	String country() default "India";//If default values is there no need to specify in class if no default we must need to provide
	int age() default 34;
	//int strikerat
}
@Player
class Cricketer
{	
	@Player
	private int innings;
	
	@Player
	public int getInnings() {
		return innings;
	}
	@Player
	public void setInnings(int innings) {
		this.innings = innings;
	}

	public Cricketer(int innings) {
		super();
		this.innings = innings;
	}	
}


public class MyOwnAnnotation {

	public static void main(String[] args) 
	{
		Cricketer cr= new Cricketer(200);
		//cr.setInnings(23);
		System.out.println(cr.getInnings());
		
		System.out.println("**********");
		//using refelection api we get specified information of annotated class
		/*Reflection in Java is a powerful feature that allows you to inspect and manipulate
		classes, methods, fields, and 
		other elements at runtime. Here are some key aspects of reflection:

		Inspecting Classes and Methods: You can use reflection to get information
		about the class structure, including its methods, fields, and constructors.*/
		Class <? extends Cricketer> cp=cr.getClass();
		/*Using Refelection API retreveing number of method in class
		 * Method[] md= cp.getDeclaredMethods(); 
		 * for(Method method:md)
		 *  {
		 * System.out.println(" "+method.getName());
		 *  }
		 */
		Player an=cp.getAnnotation(Player.class);
		Player pp= (Player)an;
		int a=pp.age();
		String sp=pp.country();
		System.out.println("Informaton of annoation values:"+ a+ " "+sp);
		
		//Getting Reflection used to analyze annotations at runtime,
		Player playerAnnotation = cp.getAnnotation(Player.class);
		System.out.println(playerAnnotation);
		
		
	}

}
