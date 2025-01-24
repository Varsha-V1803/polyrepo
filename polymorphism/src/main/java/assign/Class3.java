package assign;

public class Class3 extends Class2 {
double totalsalary_pay;
	public static void main(String[] args) {
		Class3 obj3=new Class3();
		obj3.dispay();
		obj3.hra();
		obj3.pf();
		obj3.totalsalarypay();
		obj3.print();
	}
		public void totalsalarypay()
		{
			totalsalary_pay=basic_pay+hra-pf-Deduction+bonus;
		}
     public void print()
     {
    	 System.out.println("The basicpay is:"+basic_pay);
    	 System.out.println("The deduction is:"+Deduction);
    	 System.out.println("The hra is:"+hra);
    	 System.out.println("The pf is:"+pf);
    	 System.out.println("The bonus is:"+bonus);
    	 System.out.println("The totalsalary is:"+totalsalary_pay);
     }
	}


