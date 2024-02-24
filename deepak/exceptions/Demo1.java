package deepak.exceptions;

public class Demo1 {

	public static void main(String[] args)
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try {
			System.out.println(6);
			System.out.println(5/0);
			System.out.println(7);
			System.out.println(8);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
			
		}
	}

}
