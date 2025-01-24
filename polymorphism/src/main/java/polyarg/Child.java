package polyarg;

public class Child extends Parent{
	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.method(2,3);
	}
	public void method(int a,int b)
	{
		super.method(5, 3);
		System.out.println(a+b);
	}
}
