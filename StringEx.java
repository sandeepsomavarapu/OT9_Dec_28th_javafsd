package com.ot9.strings;

public class StringEx {

	public static void main(String[] args) {
		String name1 = new String("qwerwtwy hyderabad");
		String name3 = new String("qwerty");
		
		
		System.out.println(name1.charAt(2));
		
		System.out.println(name1.indexOf('w'));
		System.out.println(name1.lastIndexOf('w'));
		System.out.println(name1.indexOf('w',2 ));
		
		System.out.println(name1.endsWith("banglore"));
		System.out.println(name1.startsWith("qwerty"));

		String name = "onlinetraining9";// immutable literal
		System.out.println(name.concat(" india"));// GC
		System.out.println(name);

		String name2 = "  Online training9  ";
		System.out.println(name2.trim().length());
		System.out.println("ignore case:"+name.equalsIgnoreCase(name2));// true
		
		
		System.out.println(name.compareTo(name2));// 0
		System.out.println(name == name2);// true

		System.out.println(name1.equals(name3));// true
		System.out.println(name1.compareTo(name3));// 0
		System.out.println(name1 == name3);// false

		System.out.println("a".compareTo("b"));
		
		System.out.println("xgastya".compareTo("agastya"));
		
		//returns -ve if obj1 has to come before obj2
		//returns +ve if obj1 has to come after obj2
		//returns  0 if both objects are same
		
		
		
		

		StringBuffer sb = new StringBuffer("welcome");
		StringBuilder sb1 = new StringBuilder("welcome");//mutable

		sb.append(" to INDIA");
		sb1.append(" to INDIA");

		System.out.println(sb);
		System.out.println(sb1);
		
	}

}
