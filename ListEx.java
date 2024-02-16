package com.ot9.collections;

import java.util.LinkedList;

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
		LinkedList<String> values = new LinkedList<String>();//10-->(cc*3/2)+1
		values.add("suresh");
		values.add("naresh");
		values.add("rajesh");
		values.add("somesh");
		values.add("suresh");
		values.add("sandeep");
		values.add("karthik");
		values.add("shiva");
		
		System.out.println(values);
		LinkedList values1 = new LinkedList();//10-->(cc*3/2)+1
		values1.add("suresh");
		values1.add("naresh");
		values1.add(123);
		values1.add(true);
		values1.add("suresh");
		values1.add('a');
		values1.add("karthik");
		values1.add(23.45);
		System.out.println(values1);
	}

}
