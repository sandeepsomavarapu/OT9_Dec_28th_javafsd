package pack1;

public class Sample {
	public void displayMsg() {
		System.out.println("welcome to Sample class");
	}

	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.displayMsg();// same class
	}
}

class Client extends Sample {
	public void m1() {
		displayMsg();// same package sub class
	}
}

class Hello {
	public void m2() {
		Sample sample = new Sample();
		sample.displayMsg();// same package non-sub class
	}
}
