package com.upskill.java_3;

public class Constructor {

	/* Constructor is instance of class, method same as class name, java will execute Constructor first 
	- it can't be static or override nor void or return type 
	- Default Constructor: no Vis initialized 
	- Parameterized Constructor: add different signature 
	-Constructor overloading: Different signature 
	
	*/ 
	
	
	String admin;
	int adAge;

	
	public Constructor(String name, int age){
		admin = name;
		adAge = age;
		
	}
		
	public static void main(String[] args) {
		Constructor obj = new Constructor ("fahim", 30);
 System.out.println(obj.adAge);
 System.out.println(obj.admin);
	}

}
