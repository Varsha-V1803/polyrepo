package multipleinheritance_interfaces;

public class Child implements Interfaceparent,Interfaceparent1 {

	public static void main(String[] args) {
		//Child obj=new Child();//child object is created and accessed the parent methods
		//obj.method1();
		//obj.method2();
		//obj.method3();//the child method alse accessed using the child object
        Interfaceparent obj1=new Child();
        obj1.method1();
       // obj1.method2();//error will come because using ob1 referenve we can only access the properties of interfaceparent
        Interfaceparent1 obj2=new Child();
        obj2.method2();
        //obj2.method1();//error will come because using ob1 referenve we can only access the properties of interfaceparent1
	}

	@Override
	public void method1() {
		System.out.println("Hi");
		
	}

	@Override
	public void method2() {
		System.out.println("Helloo");
		
	}
	public void method3() {
		System.out.println("Helloohi");
		
	}



}
