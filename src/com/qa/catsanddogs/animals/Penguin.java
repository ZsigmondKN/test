package com.qa.catsanddogs.animals;

public class Penguin {
	
	//Methods & Instance variables
	
	//Penguins have feet, wigs, beak(The variable - The blueprint for the object that we can create instances of the object)
	String name;
	int age;
	int maxRunningSpeed;
	boolean isBalanced;
	String beakColour;
	
	//Penguin does swimming and sliding(The Method)
	public void slide() {
		System.out.println("sliding...weee");
	}
	public void swim() {
		System.out.println("I'm swimminig");
	}
	//Constructors take the same name as the class and do not have a return type
	//If I don't add public, the accessibility by default is default
	//private accessibility only allows access in the class if not referenced elsewhere
	//protected is like default, but super classes would also be able to access the method
	public Penguin(
		String name,
		int age,
		int maxRunningSpeed,
		boolean isBalanced,
		String beakColour) {
		//self
		this.name = name;
		this.age = age;
		this.maxRunningSpeed = maxRunningSpeed;
		this.isBalanced = isBalanced;
		this.beakColour = beakColour;
	}
	public Penguin(String name) {
		this.name = name;
		this.age = 19;
		this.maxRunningSpeed = 100;
	}
	public Penguin() {
	}
	@Override
	public String toString() {
		return "Penguin [name=" + name + ", age=" + age + ", maxRunningSpeed=" + maxRunningSpeed + ", isBalanced="
				+ isBalanced + ", beakColour=" + beakColour + "]";
	}
}
