package abstraction;

public class Class2 extends Class1 {//normal  class

	public static void main(String[] args) {
		//Class2 obj=new Class2(); here both class1 and class2 properties will get
		//obj.method1();
		//obj.method2();
		//obj.method3();
		Class1 obj1=new Class2();//giving reference 
		obj1.method1();//both method1 and 2 will get called due to the reference ,and the parent class data only can be accessed.
		obj1.method2();
		obj1.method3();//child class data cant be accessed due to reference
		
		

	}

	@Override
	public void method1() {//instance method called via creating objects
		System.out.println("hello");
		
	}
public void method3()
{
	System.out.println("hihellooo");
}
}
