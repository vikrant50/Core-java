package com.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args)
	{
		Person p=new Person();
		p.setName("Amit");
		p.setAge(20);
		
		//accendiing canVote method
		boolean vote=p.canVote();
		if(vote==true)
		{
			System.out.println("Yes !!!!! you are elegible "+p.getName());
		}
		else
		{
			System.out.println("you are not elegible "+p.getName());
		}

	}

}
