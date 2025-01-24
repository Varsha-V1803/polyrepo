package aggregation1;

public class Aggreg2 {
	int id;
	String name;
	Aggreg1 obj;
	public static void main(String[] args) {
		Aggreg1 obj1=new Aggreg1("This is a 5 star rated product");
		Aggreg2 obj2=new Aggreg2(123,"Varsha",obj1);
		obj2.display();  
	}
	public Aggreg2(int id, String name, Aggreg1 obj) {
		super();
		this.id = id;
		this.name = name;
		this.obj = obj;
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(obj.product_desc);
	}
}
