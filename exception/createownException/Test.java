package exception.createownException;

public class Test

{
	public void getOrder(int orderId) throws OrderNotFoundException
	{
		if(orderId==0)
		{
			throw new OrderNotFoundException("order not found with id "+orderId);
		}
		else
		{
			
		}
	}
	public static void main(String[] args) throws OrderNotFoundException 
	{
		Test test=new Test();
		test.getOrder(89);
		
	}
}


