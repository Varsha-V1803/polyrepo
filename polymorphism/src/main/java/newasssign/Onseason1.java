package newasssign;

import java.util.Scanner;

public class Onseason1 extends Offseason {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price:");
		double price=sc.nextInt();
		Onseason1 obj=new Onseason1();
		obj.discount(price);
	}
	public void discount(double price)
	{
		super.discount(price);
		double discount=price-0.15*price;
		System.out.println("The discount is "+discount);
	}
}