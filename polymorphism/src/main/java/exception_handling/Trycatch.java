package exception_handling;

public class Trycatch {

	public static void main(String[] args) {
		int a=10;
		try
		{
		int b=a/0;
		System.out.println(b);
		
		}
      catch(ArithmeticException ae)
		{
    	  int b=a/2;
    	  System.out.println(b);
    	  System.out.println(ae);//used to show the type of exception or ecxception details.		}
	}

}
