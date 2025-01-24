package exception_handling;

public class Except {
	public static void main(String[] args) {
		System.out.println("Begibibg");
		try
		{
			int a=2/0;
		}
		catch(ArithmeticException e)
		{
			int a=2/2;
			System.out.println(a);
		}
		finally
		{
		System.out.println("ending");
		}
	}

}
