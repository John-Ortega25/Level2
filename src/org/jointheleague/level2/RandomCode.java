package org.jointheleague.level2;

import java.util.ArrayList;

public class RandomCode {
	
	
		
	public int score (String answer, ArrayList<String> listOfGuesses) {
		int score=0;
		for (int i = 0; i < listOfGuesses.size(); i++) {
			if (listOfGuesses.get(i).equals(answer)) {
				score=score +1;
			}
		}
		System.out.println(score);
		return score;
		
	}
	public static void main(String[] args) {
		ArrayList<String> listOfGuesses= new ArrayList<>();
		listOfGuesses.add("hmtl");
		listOfGuesses.add("python");
		listOfGuesses.add("C++");
		listOfGuesses.add("Java");
		listOfGuesses.add("Java");
		RandomCode test= new RandomCode();
		
		
		
		
		System.out.println("Score for Java should be 2, actually is:" + test.score("Java", listOfGuesses));
		
		System.out.println("Score for C++ should be 1, actually is:" + test.score("C++", listOfGuesses));
		
	}
}
