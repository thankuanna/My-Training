package Oops;

public class OverridingCircle extends OverridingShape {

	public static void main(String[] args) {
		OverridingCircle obj = new OverridingCircle();
		obj.area();
	}
	void area()
	{
int radius = 5;
double area = 3.14*radius*radius;
System.out.println("area of circle="+area);
	}

}
