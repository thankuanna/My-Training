package Oops;

import java.util.*;
public class CollectionArraylist {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList(); // ar is obj and here no size is specified, i.e we can insert data as many as we want at a time of any data type

		System.out.println(ar.size()); // TO CHECK THE SIZE;o/p:0 as nothing is inserted
		
		//1.TO INSERT, ADD METHOD IS USED;
		ar.add(1); //here 1 is "Integer 1" not int 1; non primitive data type
		ar.add(2);
		System.out.println(ar.size()); // o/p:2
		System.out.println(ar);  //o/p: [1, 2] 
		//but if we are using set they wont keep this above o/p order
		
		ar.add("Hello"); //string value
		System.out.println(ar);  //o/p:[1, 2, Hello]
		
		ar.add(true); //boolean value wrapper class
		ar.add(3.4f);//float class
		System.out.println(ar); //o/p:[1, 2, Hello, true, 3.4]//since its list keeping order
		
		//for inserting 3 in between 2 and hello
		ar.add(2,3);//index,object, in 2nd object 3 is inserted;
		System.out.println(ar);  //[1, 2, 3, Hello, true, 3.4] , here hello is pushed backwards by 1 positn,no replacement
		
		//2. ADD ALL METHOD->ATTACHING FROM 1 COLLECTION TO ANOTHER COLLECTION objects
		ArrayList a = new ArrayList();
		a.add(4);
		a.add(5);
		System.out.println(ar);
		System.out.println(a);
		/*o/p: [1, 2, 3, Hello, true, 3.4]
               [4, 5] */
		//for ar to a, we use addall method
		ar.addAll(a);
		System.out.println(ar);  //o/p:[1, 2, 3, Hello, true, 3.4, 4, 5] ;values added at the end
		
		//we can add also by saying the position
		ar.addAll(3,a);
		System.out.println(ar); //o/p: [1, 2, 3, 4, 5, Hello, true, 3.4, 4, 5]
		
		//3.Remove; particular element at an index is removed
		ar.remove(5);//5th index position is removed
		System.out.println(ar); //o/p:[1, 2, 3, 4, 5, true, 3.4, 4, 5]
		ar.remove("Hello"); //if object is mentioned also;same will happen as above
		System.out.println(ar);//o/p:[1, 2, 3, 4, 5, true, 3.4, 4, 5]
		
		//As ITS SAID;for remove we can use index/object;by default they will take index ; so if we are giving;
		ar.remove(3);// o/p:[1, 2, 3, 4, 5, true, 3.4, 4, 5]
		//but if we want to remove Integer 3;give_>
		ar.remove((Integer)3);
		System.out.println(ar);//o/p:[1, 2, 5, true, 3.4, 4, 5]
		
		System.out.println(a); //[4, 5]
		
		//4.removeAll
        ar.removeAll(a);
        System.out.println(ar);// o/p:[1, 2, true, 3.4]  ; it will remove common in a and ar ;even if 2 4z are there. it will remove that also
       //5.size
        System.out.println(ar.size()); //o/p: 4; while our pgm progress we can changethe size;increase/decrease
        
        //6.isEmpty()
        System.out.println(ar.isEmpty()); //o/p:false but if check this at the begining;true will come 
        
        //7.contains(object); checking whether that particular object is there/not
        System.out.println(ar.contains(1));//o/p:true
        System.out.println(ar.contains(7)); //o/p:false
        
        //9.Get(int index) and 10.set(index,object obj) ; add and set difference is that set repalce object and add is pushing the obj  backwards
        System.out.println(ar.get(2)); //o/p:true(2nd index position elmnt is showed)
        System.out.println(ar.get(3)); //o/p:3.4
        System.out.println(ar.set(2, false)); //true in 2nd index will be replaced with false
        System.out.println(ar); //[1, 2, false, 3.4]
        System.out.println(ar.set(2, 10));
        System.out.println(ar); //o/p:[1, 2, 10, 3.4]
        
        //11. clear; removes completely: whereas remove() will remove individually
       // ar.clear();
       // System.out.println(ar);// o/p:[]
        
       //to print individually;
        for(int i =0;i<ar.size();i++)
        {
        	System.out.println(ar.get(i));
        }
        /* o/p:
        1
        2
        10
        3.4 */ 
        //8.but here normally we use iterator interface; to print each elmets individually
        //iteratorinterface : a) next object,b)Has Next boolean,c) remove void
        
        //has next> in case if elemnts are there; with "next " mthod its printed
        
        Iterator it =ar.iterator(); //it=object; collection object is placed in it object
        while(it.hasNext())// checking the condition if the elmnt is present; then next;checking from 0th elemnt;
        {
        	System.out.println(it.next());//printing elment
        }
        /*o/p: 
         1
         2
         10
         3.4
         
         */
        //c)remove method;last elmt will be deleted
        /*Iterator it =ar.iterator(); //it=object; collection object is placed in it object
        while(it.hasNext())// checking the condition if the elmnt is present; then next;checking from 0th elemnt;
        {
        	System.out.println(it.next());//printing elment
        }*/
        it.remove();
        System.out.println(ar); //o/p:[1, 2, 10];only 1 elmnt is removed that is the last one
        
        //enhanced for loop:only 1 type of data can be iterated at a time and knows when to iterate and terminate
        int x[] = {1,2,3,4,5}; //create an array
        for(int i:x) {
        	System.out.println(i);
        }
       /* o/p:
        1
        2
        3
        4
        5*/
        //object is the superclass of every class by default;so it can hold any childs objct; so to print ar
        for(Object i:ar)
        {
        	System.out.println(i);
        }
        /*
          1
          2
          10
         */
        
        //generic collection:restricting only a particular type in collection 
       // Arraylist<Integer> ar = new Arraylist<Integer>;
        //so here it takes only integer data type so like wise but in collection it will take any data type
        //in collection and array only non primitive data type can be stored
        //

	}

}
