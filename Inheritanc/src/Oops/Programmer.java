package Oops;

public class Programmer extends Employee{
	int bonus = 10000;

	public static void main(String[] args) {
		Programmer obj = new Programmer();
		System.out.println("programmer salary ="+obj.salary);
		System.out.println("programmer bonus="+obj.bonus);
		
		

	}

}
