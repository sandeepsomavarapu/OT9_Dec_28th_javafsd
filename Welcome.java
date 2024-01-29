package com.ot9.oops;

class Welcome // PascalCase
{
	public static void main(String args[])// java classname 222 333
	{
		System.out.println(args[0] + args[1]);// "222"

		int a1 = Integer.parseInt(args[0]);// 222
		int b1 = Integer.parseInt(args[1]);// 333
		float salary = Float.parseFloat(args[2]);// 23.45
		boolean value = Boolean.parseBoolean(args[3]);
		System.out.println(a1 + b1);
		System.out.println(salary);
		System.out.println(value);

	}

}