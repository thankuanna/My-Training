package Oops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		int num = sc.nextInt();
		result(num);
	}

	static int facto(int num)
	{
		int i,fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	static void result(int num)
	{
		int fact =facto(num);
		System.out.println("factorial of the number="+fact);
	}
	
	/*static int recurs(int n)
	{
		if(n==1)
			return 1;
		else
			return(n*recurs(n-1));
	}*/
}
