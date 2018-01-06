package org.jointheleague.level2;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		ArrayList<String> monthsOfTheYear = new ArrayList<>();
		monthsOfTheYear.add("January");
		monthsOfTheYear.add("February");
		monthsOfTheYear.add("March");
		monthsOfTheYear.add("April");
		monthsOfTheYear.add("May");
		monthsOfTheYear.add("June");
		monthsOfTheYear.add("July");
		monthsOfTheYear.add("August");
		monthsOfTheYear.add("September");
		monthsOfTheYear.add("Ocotober");
		monthsOfTheYear.add("November");
		monthsOfTheYear.add("December");

		for (int i = 0; i < monthsOfTheYear.size(); i++) {
			int humanMonthNum = i + 1;
			System.out.println(
					"The month of " + monthsOfTheYear.get(i) + " is the " + humanMonthNum + " month of the year");
		}
		System.out.println("");
		for (int i = 0; i < monthsOfTheYear.size(); i++) {
			int humanMonthNum = i + 1;
			if (humanMonthNum % 2 == 0) {
				System.out.println(
						"The month of " + monthsOfTheYear.get(i) + " is the " + humanMonthNum + " month of the year");
			}

		}
		System.out.println("");
		for (int i = monthsOfTheYear.size() - 1; i >= 0; i--) {
			int humanMonthNum = i + 1;
			System.out.println(
					"The month of " + monthsOfTheYear.get(i) + " is the " + humanMonthNum + " month of the year");
		}
		System.out.println("");
		for (int i = 0; i < monthsOfTheYear.size(); i++) {
			if (monthsOfTheYear.get(i).contains("e")) {
				System.out.println("The month of " + monthsOfTheYear.get(i) + " contains the letter e");
			}

		}
		for (String monthOfYear : monthsOfTheYear) {
			System.out.println(monthOfYear);
		}
	}
}
