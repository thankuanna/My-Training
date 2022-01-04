package Oops;
//import java.util.Scanner;
public class EmployeeInstMethod {

	public static void main(String[] args) {
		
		EmployeeSalarydetails obj1 = new EmployeeSalarydetails();
		obj1.get();
		HraCalculation obj2 = new HraCalculation(obj1.basic,obj1.deduction,obj1.bonus);
		obj2.HraCalculation();
		double totSalaryHand =obj1.basic+obj2.hraamt-obj2.pfamt-obj1.deduction+obj1.bonus;
		System.out.println("salary slip");
		System.out.println("basic pay ="+obj1.basic);
		System.out.println("deduction amt ="+obj1.deduction);
		System.out.println("hra amt="+obj2.hraamt);
		System.out.println("pf amt="+obj2.pfamt);
		System.out.println("bonus amt ="+obj1.bonus);
		System.out.println("total salary by hand="+totSalaryHand);
		
		
		

	}

}
