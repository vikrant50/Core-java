package deepak.exceptions;

public class NulllPointerExceptionsDemo {

	public static void main(String[] args)
	{
		try 
		{
		   String str=null;
		   int str2=str.length();
		   System.out.println(str2);
		}
		catch(NullPointerException e)
		{
		
			System.out.println("Null pointer exception");
		}
		finally {
			System.out.println("Finally always excecuted ");
		}

	}

}
