package access_specifiers;

public class Class2 {

	public static void main(String[] args) {
		Class1 obj=new Class1();
		obj.pub();
		//obj.pri();//this cant be accessed because it can only accessed inside a class(class1) only
		obj.protect();
		obj.def();

	}

}
