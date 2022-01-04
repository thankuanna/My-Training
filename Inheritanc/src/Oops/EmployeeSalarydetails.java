package Oops;
import java.util.*;
public class EmployeeSalarydetails {
	
public	double basic;
public	double deduction;
public	double bonus;

	void get()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the basic pay");
		basic = sc.nextDouble();
		System.out.println("enter the deduction amount");
		deduction = sc.nextDouble();
		System.out.println("enter the bonus");
		bonus = sc.nextDouble();
		
	}
}
