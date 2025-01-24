package encapsulation1;

public class Encap2 {

	public static void main(String[] args) {
		Encap1 obj=new Encap1();
		obj.setPin_id(1828);
		System.out.println(obj.getPin_id());
		obj.setBankName("SBI");
		System.out.println(obj.getBankName());

	}

}
