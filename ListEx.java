package com.ot9.collections;

import java.util.ArrayList;
import java.util.Iterator;

//Advantages with collections
//
//1)collections will allow both homogeneous data/similar data and haterogeneous data 
//2)collections size is not fixed/ growable in nature 
//3)lots utility methods		
//
//List:
//1)duplicates are allowed 
//2)insertion order preserved 
//al,ll,v,s
public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> values = new ArrayList<String>();// 10-->(cc*3/2)+1
		values.add("suresh");
		values.add("naresh");
		values.add("rajesh");
		values.add("somesh");
		values.add("suresh");
		values.add("sandeep");
		values.add("karthik");
		values.add("shiva");
		values.add(1,"hello");

		System.out.println(values);

		Iterator<String> itr = values.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

//		System.out.println(values.contains("hello"));
//		System.out.println(values);
//		System.out.println(values.size());
//		values.remove("suresh");
//		System.out.println(values);
//		ArrayList values1 = new ArrayList();//10-->(cc*3/2)+1
//		values1.add(123);
//		values1.add(true);
//		values1.add("karthik");
//		values1.add(23.45);
//		System.out.println(values1);
//		values1.addAll(values);
//		System.out.println(values1);
//		//values1.removeAll(values);
//		//values1.clear();
//		
//		//values1.retainAll(values);
//		System.out.println(values1.containsAll(values));
//		System.out.println(values1.isEmpty());

	}

}
