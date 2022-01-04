package Oops;

public class OverridingRectangle extends OverridingShape{

	public static void main(String[] args)
	{
		OverridingRectangle obj = new OverridingRectangle();
		obj.area();
	}
		void area()
		{
			int length = 2,breadth = 3;
			int area = length*breadth;
			System.out.println("area of rectangle="+area);
		}

}
