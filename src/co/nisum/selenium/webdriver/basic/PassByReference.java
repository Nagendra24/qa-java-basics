package co.nisum.selenium.webdriver.basic;

//Pass by reference and value

import java.io.*;
class Cat {
	boolean canSmell=true;
	String animalType = "cat";
	int age  = 20;

	int display(Cat C, Cat D)
	{
		// Updating value using argument
		C.age = 10;

		System.out.println("age = " + age);

		System.out.println("animalType = " + animalType);

		return 0;
	}
}
class PassByReference {
	public static void main(String[] args)
	{
		Cat cat = new Cat();

		Cat tiger = new Cat();

		// updating value using primary reference
		// variable
		tiger.animalType = "Tiger";

		cat.display(cat, tiger); // POINT 1

		tiger.display(cat, tiger); // POINT 2
	}
}
