package methodOverrLoding;

class A
{
  
	public void m1(String s)
	{
		System.out.println("String class ");
	}
	public void m1(Object o)
	{
		System.out.println("Object class ");
	}
}
public class Dem01 
{

	public static void main(String[] args) 
	{
		//Why String class being called because it null will 
		A a=new A();
		a.m1(null);//String class 

	}

}
