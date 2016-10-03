package cse.buffalo.edu.cse562;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valManoj = 587;
		String regexx = "^4[0-9]";
		System.out.println("Hello world2");
		System.out.print("Testing on 09/24/2016 for knowing the working of intelliJ studio");
		Person person = new Person();
		if (person != null) {
			System.out.print("person is not null");
		}

		if (regexx != null) {
            System.out.println("Demo.main");
			System.out.println("Hello" +
					"Qorld");
        }
}
}

class Person {
	public Person() {
        System.out.print("Inside Person Constructor.");
	}
}
