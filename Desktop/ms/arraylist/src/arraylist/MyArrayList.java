package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List <String> fruits = new LinkedList();
		List <String> vegetables = new ArrayList();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("lemon");
		vegetables.add("potato");
		vegetables.add("carror");
	fruits.addAll(vegetables);
	System.out.println(fruits);
	
	
		
		
		
	}

}
