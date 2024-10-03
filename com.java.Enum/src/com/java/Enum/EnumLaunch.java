package com.java.Enum;
//Group of name constants
enum Week
{
	Mon,Tue,Wed,Thu,Fri,Sat,Sun;
}


public class EnumLaunch {

	public static void main(String[] args) 
	{
		Week wr= Week.Fri;
		System.out.println(wr);
		int a=Week.Thu.ordinal();//it will search based on index
		System.out.println(a);
		Week[] wk= Week.values();
		//Ordinal method showing all our enum data like array
		for(Week v:wk)
		{
			System.out.println(v.ordinal()+" "+ v);
		}
	}

}
