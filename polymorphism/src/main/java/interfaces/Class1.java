package interfaces;

public class Class1 implements Interface1{

	public static void main(String[] args) {
		Interface1 obj=new Class1();
		obj.method();
		//obj.method2();//we  cant give this because in interfaces only we have abstract methods but here method 2 is instance method

	}

	@Override
	public void method() {
		System.out.println("Hai");
		
	}
	public void method2()
	{
		System.out.println("Helloo");
	}

}
