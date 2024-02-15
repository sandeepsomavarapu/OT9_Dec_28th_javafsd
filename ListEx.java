package com.ot9.collections;

import java.util.ArrayList;

//Advantages with collections
//
//1)collections will allow both homogeneous data/similar data and haterogeneous data 
//2)collections size is not fixed/ growable in nature 
//3)lots utility methods		
//
//List:
//1)duplicates are allowed 
//2)insertion order preserved 

public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> values = new ArrayList<String>();//10-->(cc*3/2)+1
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
