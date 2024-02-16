package com.ot9.collections;

import java.util.TreeSet;

//1)collections will allow both homogeneous data/similar data and haterogeneous data 
//2)collections size is not fixed/ growable in nature 
//3)lots utility methods		
//
//Set:
//1)duplicates are not allowed 
//2)insertion order not preserved 
	//al,ll,v,s
public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> values = new TreeSet<String>();//10-->(cc*3/2)+1
		values.add("suresh");
		values.add("naresh");
		values.add("rajesh");
		values.add("somesh");
		values.add("suresh");
		values.add("sandeep");
		values.add("karthik");
		values.add("shiva");
		
		System.out.println(values);
		
	}

}