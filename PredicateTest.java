package com.ot9.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> predicate=i->i%2==0;
			System.out.println(predicate.test(12));
			System.out.println(predicate.test(11));
			
			Function<Integer, Integer> f=i->i*i;
			System.out.println(f.apply(20));
			String s="sandeep";
			Function<String, Integer> f1=i->i.length();
			System.out.println(f1.apply(s));
			String s1="welcome";
			Function<String, String> f2=i->i.toUpperCase();
			System.out.println(f2.apply(s));
			
			Consumer<String> f3=i->System.out.println(i.length());
			f3.accept("onlinetraining9");
			
			Supplier<String> otps = () -> {
			     String otp = "";
			     for (int i = 1; i <= 4; i++) {
			        otp = otp + (int) (Math.random() * 10);
			     }
			   return otp;
			};
			System.out.println(otps.get());
			System.out.println(otps.get());
			System.out.println(otps.get());

	}

}
