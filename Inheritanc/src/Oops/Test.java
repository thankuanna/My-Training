package Oops;

public class Test {

	public static void main(String[] args) {
		
		
		
		Test.reverse();

	}
	static int reverse(int num)
	{
		int rem, rev= 0;
		for(;num!=0;num=num/10)
		{
			rem = num%10;
			rev = rev *10+rem;
		}
		return rev;
	}
	static void reverse()
	{
	
		int result = reverse(123);
		System.out.println("reversed num ="+result);
		
	}
}
