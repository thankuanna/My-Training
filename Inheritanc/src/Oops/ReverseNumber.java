package Oops;
import java.util.*;
public class ReverseNumber {

		int num;
		
		ReverseNumber()
		{
			System.out.println("finding reverse");
		}
		
		ReverseNumber(int num)
		{
			this();
			int rem,rev= 0;
			for(;num!=0;num=num/10)
			{
				rem = num%10;
				rev= rev *10+rem;
			}
			System.out.println("reversed number="+rev);
		}
			
			public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("enter the number to be reversed");
				int num = sc.nextInt();
				ReverseNumber obj = new ReverseNumber(num);
				
				
				
			}
		
		}

