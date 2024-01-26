package pack2;

import pack1.Sample;

public class Test extends Sample {
	public static void main(String[] args) {
		Test test = new Test();
		test.displayMsg();// different package sub-class
	}
}

class Calci {

	public void m3() {
		Sample sample = new Sample();
		sample.displayMsg();//different package non-sub class
	}
}
