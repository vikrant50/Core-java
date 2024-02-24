package com.encapsulation;
class A
{
   public String getName() 
   {
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

private String name;	
   

}
public class TeluskoDemo1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		A obj=new A();
		//obj.name="amit";error if you declare private 
		obj.setName("Amit");
		
		
	

	}

}
