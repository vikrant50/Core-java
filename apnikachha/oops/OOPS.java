package com.apnikachha.oops;

//class
class Pen
{

	String color;
	String type;
	
	public void write()
	{
		System.out.println("writing something ");
	}
	public  void printColor()
	{
		System.out.println(this.color);
	}
}
class Student
{
	String name;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
public class OOPS
{
	//object
	public static void main(String[] args)
	{
//		Pen pen1 =new Pen();
//		pen1.color="blue";
//		pen1.type="get";
//	
//		
//		Pen pen2=new Pen();
//		pen2.color="Red";
//		pen2.type="ballpen";
//		
//		pen1.write();
//		pen2.write();
		
		Student s1=new Student("amit",24);
	    s1.printInfo();
		
		
		
		
	}

}
