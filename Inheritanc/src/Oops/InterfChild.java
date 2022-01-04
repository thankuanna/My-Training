package Oops;

public class InterfChild implements InterfaParent {
	
	@Override
	public void display() {
		System.out.println("abstract method");
		
	}
	

	public static void main(String[] args) {
		InterfChild obj = new InterfChild();
		obj.display();
		
		System.out.println(InterfaParent.a); //even if we cant create object in interf, object can be called by interfacename.obj

	}

	

}
