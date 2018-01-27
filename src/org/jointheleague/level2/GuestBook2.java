package org.jointheleague.level2;

import java.util.ArrayList;

public class GuestBook2 {
	
		
	
	

	int totalScore;

	public int scoreGuess(String guess, String answer) {
		if (guess.equalsIgnoreCase(answer)) {
			return 2;
			
		} else if (guess.contains(answer)) {
			
			return 1;
		}else {
			return 0;
		}
		
	}

	public int scoreAllGuesses(ArrayList<String> listOfGuesses, String answer) {
		for (int i = 0; i < listOfGuesses.size(); i++) {
			int score= scoreGuess(listOfGuesses.get(i), answer);
			totalScore=totalScore+score;
		}
		
		
		return totalScore;
	}

	public static void main(String[] args) {
		GuestBook2 guess = new GuestBook2();
		ArrayList<String> listOfGuesses = new ArrayList<>();
		listOfGuesses.add("Pen");
		listOfGuesses.add("Pencil");
		listOfGuesses.add("Mechanical Pencil");
		listOfGuesses.add("Pen");
		System.out.println("Score for Pencil should be 7, actually is: "+ guess.scoreAllGuesses(listOfGuesses, "Pen"));
		
	}
}
