package aggregation;

public class Aggreg2 {
	int id;
	String name;
	Aggreg1 obj;//aggregating a class(ie inbulit class and its object)
	public static void main(String[] args) {
		Aggreg1 obj1=new Aggreg1("V land","TVM","Kerala",695605);
		Aggreg2 obj2=new Aggreg2(1828,"Varsha",obj1);
		obj2.display();
	}
	public Aggreg2(int id, String name, Aggreg1 obj) {//used to initialise values
		super();
		this.id = id;
		this.name = name;
		this.obj = obj;
	}
	public void display()//used to display the values
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(obj.House_name+","+obj.City+","+obj.State+","+obj.Pin_code);
		
	}

}
