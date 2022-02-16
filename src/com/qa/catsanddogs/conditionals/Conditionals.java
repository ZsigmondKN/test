package com.qa.catsanddogs.conditionals;

public class Conditionals {
	//Conditionals are essentially checks - is something true or false
	
	public static void ageCheck() {
		int age = 10;
		boolean actsYoung = true;
		if (age < 10 || actsYoung) { // in here "actsYoung" means "actsYoung == true"
			System.out.println("You are under 10 years old.");
		} else if(age >= 10  && age <= 30) {
			System.out.println("You are between 10 and 30 years old.");
		} else {
			System.out.println("You are over 30 yeaers old.");
		}
	}
	
	public static void dayOfTheWeek(char letter) {
		//A switch is like an if statement but they are used when things are set standard
		switch(letter) {
		
		case 'm':
			System.out.println("Monday");
			break;
		case 't':
			System.out.println("Tuesday");
			break;
		case 'w':
			System.out.println("Wednesday");
			break;
		default :
			System.out.println("Please give a valid answer.");
			break;
		}
	}
}
