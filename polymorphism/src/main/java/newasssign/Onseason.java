package newasssign;
public class Onseason extends Offseason {

	public static void main(String[] args) {
		Onseason obj=new Onseason();
		obj.discount(1200);
	}
	public void discount(double price)
	{
		super.discount(1500);
		double discount=price-0.15*price;
		System.out.println("The discount is "+discount);
	}
}
