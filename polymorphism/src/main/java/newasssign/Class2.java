package newasssign;

public class Class2 extends Class1 {

	public static void main(String[] args) {
		Class2 obj=new Class2();
		obj.method();
	}
	public void method()
	{
		int result=super.add(20,10);
		if(result%10==0)
		{
			System.out.println(result+" is divissible by 10");
		}
		else
		{
			System.out.println(result+" is not divissible by 10");

		}
	}
}