package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List <String> fruits = new LinkedList();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Lemon");
		fruits.set(1, "Banana");
		fruits.add("Mango");
		
		
		
			System.out.println(fruits.get(2));
			System.out.println(fruits.size());
			System.out.println(fruits.contains("Guava"));
			String temp[] = new String [fruits.size()];
			fruits.toArray(temp);
			for (String e: temp) {
				System.out.println(e);
			}
			List <String> toRemove = new ArrayList();
			toRemove.add("Apple");
			toRemove.add("Banana");
			toRemove.add("Mango");
			fruits.removeAll(toRemove);
			System.out.println(fruits);
			
			
			
		}
		
		

	}


