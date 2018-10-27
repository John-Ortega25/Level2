package org.jointheleague.level2;

import java.util.ArrayList;

public class Warm_Up6 {
	
	ArrayList<Integer> list = new ArrayList<>(10);
		
	public Warm_Up6(){
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(3);
		list.add(40);
		list.add(5);
	}

	public void emptyList(){
		System.out.println("Clear method being used:");
		System.out.println("Original Size = " + list.size());
		list.clear();
		System.out.println("Cleared Size = " + list.size());
		
	}
	
	
	public void eliminateIndex(){
		System.out.println("Set index method being used:");
		System.out.println("Original Index 3 = " + list.get(3));
		list.remove(3);
		list.set(3, 100000);
		System.out.println("New Index 3 = " + list.get(3));
	}
	
	public void addCertainIndex(){
		list.remove(4);
	}
	
	public static void main(String[] args) {
		Warm_Up6 test = new Warm_Up6();
		test.eliminateIndex();
		test.emptyList();
		test.addCertainIndex();
	}
}
