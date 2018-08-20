package oopsConcepts;

class A2{
	String s = "Class A";
	static {
		System.out.println("First");
	}
}

class B2 extends A2{
	String s = "Class B";
	{
		System.out.println(super.s);
	}
	static {
		System.out.println("Second");
	}
}

class C2 extends B2{
	String s = "Class C";
	{
		System.out.println(super.s);
	}
	static {
		System.out.println("Third");
	}
}

public class SecondTest {

	public static void main(String[] args) {
		C2 c = new C2();
		System.out.println(c.s);
		
	}
}
