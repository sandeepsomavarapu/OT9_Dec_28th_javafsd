package com.virtual.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesEx {

	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		System.out.println(predicate.test(12));
		Predicate<String> predicate1 = i -> i.length() > 6;
		System.out.println(predicate1.test("sandeep"));

		Function<String, Integer> function = name -> name.length();
		System.out.println(function.apply("sandeep"));

		Function<Integer, Integer> f = i -> {
			System.out.println("checking");
			int a = 123;
			int b = 23;
			int result = a + b;
			System.out.println(result);
			return i * i;

		};
		System.out.println(f.apply(20));
		String s = "welcome";
		Function<String, String> f1 = i -> i.toUpperCase();
		System.out.println(f1.apply(s));

		Consumer<String[]> consumer = names -> {
			for (int j = 0; j < names.length; j++) {
				if (names[j].endsWith("esh")) {
					System.out.println(names[j]);
				}
			}
		};
		String names[] = { "suresh", "narendra", "naresh", "mahesh", "sandeep", "kumar" };
		consumer.accept(names);

		
		Supplier<String> otps = () -> {
		     String otp = "";
		     for (int i = 1; i <= 6; i++) {
		        otp = otp + (int) (Math.random() * 10);
		     }
		   return otp;
		};
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());
		
	}

}
