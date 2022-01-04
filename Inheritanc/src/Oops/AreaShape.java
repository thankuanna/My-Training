package Oops;
import java.util.*;
public class AreaShape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Area Calculation");
		System.out.println();
		
		while(true)
		{
			System.out.println("enter A to find the area of circle");
			System.out.println("enter B to find the area of rectangle");
			System.out.println("enter C to find the area ofsquare");
			System.out.println("enter 0 to exit");
			
			System.out.println("enter your choice");
			char choice = sc.next().charAt(0);
			switch(choice)
			{
			case 'A': System.out.println("circle area");
			          System.out.println("enter the radius");
			          int radius = sc.nextInt();
			          double area_circ = 3.14*radius*radius;
			          System.out.println("area of circle="+area_circ);
			          break;
			case 'B': System.out.println("rectangle area"); 
			          System.out.println("enter length");
			          int length = sc.nextInt();
			          System.out.println("enter breath");
			          int breadth = sc.nextInt();
			          int area_rec = length *breadth;
			          System.out.println("area of rectangle="+area_rec);
			          break;
			case 'C': System.out.println("square area");
			        System.out.println("enter side");
			        int side = sc.nextInt();
			        int area_sq = side*side;
			        System.out.println("area of square="+area_sq);
			        break;
			case '0':System.out.println("you have existed");
			         System.exit(0);
			         break;
			default:System.out.println("invalid choice");
			        break;
			    
			}
		
		}

	}

}
