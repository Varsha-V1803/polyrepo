package ArrayList1;

import java.util.ArrayList;//its a class in another package so we need to import it

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//here list is the variable
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("kiwi");
		System.out.println(list);
		list.add(1,"banana");//to add a new item in 1 index position.
		System.out.println(list);
		list.set(2,"watermelon");//used to replace the element at 2nd position by a new element,here it is watermelon.
		System.out.println(list);
		//list.get(3);//output will not get because we needs to print that using sysout.
		System.out.println(list.get(3));
		list.remove(2);
		System.out.println(list);
		if(list.contains("dragonfruit"))//used to check whether a particular element is present in the list or not
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
		if(list.isEmpty())//used to check whether the List is empty or not.
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("not Empty");
		}
		
		ArrayList<String> list1=new ArrayList<String>();//a new ArrayList
		if(list1.isEmpty())//used to check whether the List is empty or not.
		{
			System.out.println("Empty");
		}
		else
		{
			System.out.println("not Empty");
		}
		
	}

}
