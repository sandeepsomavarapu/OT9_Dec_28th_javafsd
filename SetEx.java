package com.ot9.collections;

import java.util.Comparator;
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
		TreeSet<String> values = new TreeSet<String>(new MyComparator());//10-->(cc*3/2)+1 Comparable-->compareTo-->NSO
		values.add("suresh");
		values.add("naresh");//CSO-->Comparator -->java.util--->compare
		values.add("rajesh");
		values.add("bhupesh");
		values.add("somesh");
		values.add("arun");
		values.add("suresh");
		values.add("sandeep");
		values.add("karthik");
		values.add("shiva");
		
		System.out.println(values);
		
	}

}
class MyComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
	}
	
}