package encapsulation;

public class Encap1 {
private int id;//instance variable,the private variable can only accessed in this class only.
private String name;//instance  variable,private for datahiding
public int getId() {//getter method for displaying the data in the Encap2 class or next class
	return id;
}
public void setId(int id) {//setter method for data modificatiion
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
