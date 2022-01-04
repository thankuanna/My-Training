package Oops;

public class HraCalculation extends EmployeeSalarydetails {
	
	double basic;
	double deduction;
	double bonus;
	double hraamt;
	double pfamt;
	
	HraCalculation(double basic, double deduction,double bonus)
	{
		this.basic = basic;
		this.deduction = deduction;
		this.bonus = bonus;
	}
	
	void HraCalculation()
	{
		hraamt = (basic*(0.05));
		pfamt = (basic*(0.20));
		System.out.println("hra amount ="+hraamt);
		System.out.println(("pf amount ="+pfamt));
	}
	

}
