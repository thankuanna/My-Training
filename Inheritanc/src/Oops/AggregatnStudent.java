package Oops;

public class AggregatnStudent {
	int id;
	String name;
	AggreAddress address;
	
	AggregatnStudent(int id,String name,AggreAddress address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	public static void main(String[] args) {
		
		AggreAddress add1 = new AggreAddress("changanacherry","kerala","India");
		AggreAddress add2 = new AggreAddress("ernakulam","kerala","India");
		
		AggregatnStudent obj1 = new AggregatnStudent(36,"thanku",add1);
		AggregatnStudent obj2 = new AggregatnStudent(23,"nisha",add2);
		
		obj1.display();
		obj2.display();

	}

}
