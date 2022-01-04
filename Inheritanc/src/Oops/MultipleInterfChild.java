package Oops;

public class MultipleInterfChild implements MultipleInterfacePrintable, MultipleInterfaceShowable//more than one interfaces should write within comma
{
	
	@Override
	public void show() {
		System.out.println("showing");
		
	}

	@Override
	public void print() {
		System.out.println("printing");
		
	}

	@Override
	public void display() {  //only 1 display method came because both interfaces has display so its given as common here
		System.out.println("displaying");
		
	}

	public static void main(String[] args) {
		
		MultipleInterfChild obj = new MultipleInterfChild();
		
		obj.print();
		obj.show();
		obj.display();

	}

	

}
