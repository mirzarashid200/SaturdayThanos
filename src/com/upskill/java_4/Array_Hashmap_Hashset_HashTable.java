package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {
	

	public static void main(String[] args) {
		
		
		int age =30;											//VARIABLE
		int[] ageThanos = new int [] {30, 35, 27,22,40,21};			// ARRAY ( STORGES ALL THE VALUES)
		
		System.out.println("student age" + ageThanos[3]); 
		System.out.println("total student" + ageThanos.length); 														//ARRAY INDEX[0][1][2][3] ARRAY INDEX STARTS FROM ZERO
		
		
		
		
		
		
		
		//Multi Dimentional Array 
		int [][] ageThanos2D = {{30, 35, 27, 22, 40, 32},       		 // [0][0]  [0][1] [0][2] [0][3] [0][4]
				{37, 26, 24, 35}};										//   [1][0]  [1][1] [1][2] [1][3] 
	
		System.out.println("Student Age 2D : " + ageThanos2D[0][4]);
		
		// HASHMAP stores multiple data using key value pair, Implemenation of map interface 
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		Student.put("Ava", 23);
		Student.put("Fahim", 25);
		Student.put("Mirza", 24);
		System.out.println(" Hashmap Student Age 2D : " + Student.get("Fahim"));
		
		
		HashMap<String, Integer> Capital = new HashMap<String, Integer>();
		
       //HASHSET STORES UNORDERED COLECTION CONTAINING UNIQUE VALUE, IMPLEMENTATION OS SET OF INTERFACE 
        HashSet<String> car = new HashSet<String>();
        car.add("bmw");
        car.add("ford");
        car.add("audi");
        System.out.println("car :" + car);
        
     // HASHtable stores multiple data using key value pair,but is synchronized ( only one thread can be modified)
        Hashtable<String, String> Region = new  Hashtable<String, String>();
        
        
        
        
		}

}
	
