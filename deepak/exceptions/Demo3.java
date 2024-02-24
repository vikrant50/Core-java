package deepak.exceptions;
/*
  checked exception are those exception , which handled at compile time ...complier will telll you need to handle exception 
 */
public class Demo3 {

	public static void main(String[] args)
	{
		
		//checked exception Class.forName("com.mysql.cj.jbdc.Driver");
//		try {
//		Class.forName("com.mysql.cj.jbdc.Driver");
//
//		}
//		catch(ClassNotFoundException e)
//		{
//			System.out.println("class not found ");
//		}//note 1:- here when you write class.forName("--") outside of try block then it will show error and compiler will tell to you to handle in at complile time this is called checked exception
		
		
		//unchecked exception
		int a=100,b=0,c;
		c=a/b;
		System.out.println(c);//note 2:-here we can see this is Runtime exception/unchecked exception here complier will not tell to you handle this exception ....it is arithmetic exception 
	
		
	}

}
