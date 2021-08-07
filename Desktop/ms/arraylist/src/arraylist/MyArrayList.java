package arraylist;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List <String> fruits = new LinkedList();
		
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("lemon");
		String temp [] = new String [fruits.size()];
		fruits.toArray(temp);
		for (String e : temp) {
			System.out.println(e);
		}
		
	
		
		
		
	}

}
