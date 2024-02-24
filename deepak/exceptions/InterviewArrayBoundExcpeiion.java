package deepak.exceptions;

public class InterviewArrayBoundExcpeiion {

	public static void main(String[] args) 
	{
		int []arr= {1,2,3,4,5};
		
		try {
			int value=arr[5];
			System.out.println(value);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception");
		}

	}

}
