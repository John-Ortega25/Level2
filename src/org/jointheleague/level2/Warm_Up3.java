package org.jointheleague.level2;

import java.util.ArrayList;

public class Warm_Up3 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		printList(names);
		names.set(0, "David");
		printList(names);
		names.add("Isis");
		printList(names);
		names.add("Esme");
		names.remove(1);
		printList(names);

	}

	private static void printList(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if(i != list.size()-1) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");
	}
}
