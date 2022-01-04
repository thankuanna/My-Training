package Oops;

public class StatcuNderstanding {
int a;
static int b;
	public static void main(String[] args) {
		
	B();

	}

	void A()
	{
		a = 10;
		b = 20; //no error as it can call both inst &static var
		
		B(); // no error as it can call both inst &static methods
		
	}
	
	static void B()
	{
		StatcuNderstanding obj = new StatcuNderstanding();
		//a = 10; // error as static method cant call inst variable
		obj.a = 10;
		b = 20;
		//A(); // error as static method cant call inst  method
		// so to avoid error, we should create object so that we can access insta metho and varibles 
	C(obj);	
	}
	
	static void C(StatcuNderstanding o)
	{
	
		System.out.println(o.a);//wont print value of value 10 of a as its a new object so assign value 1st as obj.a=10
		
	}
	
	
	
}
