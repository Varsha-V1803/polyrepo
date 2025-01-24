package exception_handling;

public class Finallyeg {
public static void main(String[] args) {
	int ar[]= {1,2,3};
	try
	{
	for(int i=0;i<=3;i++)
	{
		System.out.println(ar[i]);
	}
	}
	finally
	{
		System.out.println("Hello");
	}
}
}
