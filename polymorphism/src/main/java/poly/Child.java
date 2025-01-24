package poly;

public class Child extends Parent{

	public static void main(String[] args) {
	Child obj=new Child();
	obj.method1();
	}
	public void method1()
	{
		super.method1();//here if we didnt give super first the output will be shoen for parent and then the child will override the parent output so the child output only gets,but we give super we will get the outputbof parent and then child.
		System.out.println("Method of child class");
	}
}
