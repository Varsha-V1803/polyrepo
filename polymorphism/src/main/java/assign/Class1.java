package assign;
import java.util.Scanner;
public class Class1 {
	double basic_pay;
	double Deduction;
	double bonus;
	public void dispay() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the basic pay:");
	basic_pay=s.nextDouble();
	System.out.println("Enter the deduction:");
	Deduction=s.nextDouble();
	System.out.println("Enter the bonus:");
	bonus=s.nextDouble();
	}
}
