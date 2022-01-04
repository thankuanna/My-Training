package Oops;

public class SuprParent {
	
	public int a;
	
	
	SuprParent()
	{
		a = 100;
		System.out.println("def constructor of A");
		
	}

	SuprParent(int a)
	{
		System.out.println("para constructor of A");
	}
	
	public void display()
	{
		System.out.println("parent display");
	}
}
