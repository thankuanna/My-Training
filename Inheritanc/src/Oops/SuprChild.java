package Oops;

public class SuprChild extends SuprParent {
	
	int a;
	
	SuprChild()
	{
		super(20); // calling param const from parent
		a = 10;
		System.out.println("SuprChild const");
	}
	
	
	public static void main(String args[])
	{
		
		SuprChild obj = new SuprChild();
		obj.display();
		
	}

	public void display()
	{
		int a = 1;  //local var
		
		super.display(); // calling insta method of parent class
		System.out.println("local a:"+a);
		System.out.println("instance a:"+this.a);
		System.out.println("parent class a:"+super.a);
	}
}






