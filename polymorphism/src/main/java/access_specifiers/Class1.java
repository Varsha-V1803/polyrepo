package access_specifiers;

public class Class1 {

	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.pub();
		obj.pri();
		obj.protect();
		obj.def();

	}
	public void pub()
	{
		System.out.println("I am a public method");
	}
	private void pri()
	{
		System.out.println("I am a private method");
	}
	protected void protect()
	{
		System.out.println("I am a protected method");
	}
	void def()
	{
		System.out.println("I am a default method");
	}
}
