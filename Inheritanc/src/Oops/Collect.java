package Oops;
import java.util.*;
public class Collect {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList();
		ar.add("pink");
		ar.add("red");
		ar.add("yellow");
		ar.add("blue");
		System.out.println(ar); //o/p:[pink, red, yellow, blue]

		ar.set(2,"violet");
		System.out.println(ar);  //o/p:[pink, red, violet, blue]; replacing or retreiving
		
		Iterator it = ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		/*
		 * pink
           red
           violet
           blue
		 */
		ar.remove(2);
		System.out.println(ar);  //o/p:[pink, red, blue]
		
		System.out.println(ar.contains("red"));  //o/p:true

	}

}
