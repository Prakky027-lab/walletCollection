package cg;

import java.util.*;

public class Demo1 {
	public static void main(String args[]){
		//non generic collection
		Set col=new HashSet();
		col.add("Ram");
		col.add("Shyam");
		col.add("Abdul");
		col.add(55);//Autoboxing
		col.add(null);
		col.add("Ganesh");
		col.add("Ram");
		System.out.println(col);
		System.out.println(col.size());
	}

}
