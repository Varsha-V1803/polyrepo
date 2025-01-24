package assign;

public class Class2 extends Class1 {
double hra;
double pf;
public static void main(String[] args) {
	Class2 obj2=new Class2();
	obj2.dispay();
	obj2.hra();
	obj2.pf();
}
	public void hra() {
		hra=0.05*basic_pay;
		//System.out.println("The hra is "+hra);
	}
	public void pf() {
		pf=0.2*basic_pay;
		//System.out.println("The hra is "+pf);
	}

}
