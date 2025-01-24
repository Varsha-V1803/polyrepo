package encapsulation;

public class Encap2 {

	public static void main(String[] args) {
		Encap1 obj=new Encap1();//to access the properties of Encap1 in Encap2
		obj.setId(1828);
		System.out.println("The id is "+obj.getId());
		obj.setName("Varsha");
		System.out.println("The name is "+obj.getName());
	}

}
