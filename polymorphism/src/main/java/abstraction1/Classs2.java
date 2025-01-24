package abstraction1;

public class Classs2 extends Class1{

	public static void main(String[] args) {
		//Classs2 obj=new Classs2();
		//obj.method1();
		//obj.method2();\
		Class1 obj1=new Classs2();
		obj1.method1();
		obj1.method2();

	}

	@Override
	public void method1() {
		System.out.println("Hi");
		
	}

	@Override
	public void method2() {
		
		System.out.println("Hello");
	}

}
