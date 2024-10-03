package com.java.Enum;
enum Student
{
	Pass, Fail,AGrade,Name;
	//Public static final Student Pass= new Student(); internally this happens in enum
	//Public static final Student Fail= new Student();
	//Public static final Student AGrade= new Student(); internally this happens in enum
	//Public static final Student Name= new Student();
	int marks;
	String name;
	Student()
	{
		System.out.println("Consutructor in enum");
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
}
public class EnumLaunch2 {

	public static void main(String[] args) 
	{
		/*
		 * Student st=Student.Fail; 
		 * st.setMarks(22);
		 *  System.out.println(st.getMarks());
		 */
		 Student.Pass.setMarks(80);
		 int result=Student.Pass.getMarks();
		 System.out.println(result);
		 
		 Student.AGrade.setMarks(99);
		 int res=Student.AGrade.getMarks();
		 System.out.println(res);
		 //Not set any value to type of local variable its show default value
		 int as=Student.Fail.marks;
		 System.out.println(as);//0
		 //Default value of string
		 String ass=Student.Name.name;
		 System.out.println(ass);//0
		 //Setting String Enum
		 Student.Name.setname("Rahul Dua");
		 String st=Student.Name.getname();
		 System.out.println(st);
		 }

}
