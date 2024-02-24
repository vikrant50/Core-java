package deepak.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		try 
		{
		   FileInputStream fis=new FileInputStream("d:/abc.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found ");
		}
	}

}
