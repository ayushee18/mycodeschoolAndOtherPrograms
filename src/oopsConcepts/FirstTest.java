package oopsConcepts;

class A1{
	
	int i = 10;
	{
		System.out.println("Hi A");
	}
	public void name() {
		System.out.println("This is Class A");
	}
}

class B1 extends A1{
	
	int i = 20;
	{
		System.out.println("Hi B");
	}
	@Override
	public void name() {
		System.out.println("This is Class B :( :(");
	}
	
}

public class FirstTest {

	public static void main(String[] args) {
		A1 aa = new B1();
		
		System.out.println("After all this "+aa.i);
		aa.name();
	}
}
