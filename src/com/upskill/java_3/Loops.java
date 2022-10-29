package com.upskill.java_3;

public class Loops {
	
	
	/* 
	 Types of Loops
	 1. For Loops
	 2. while loop
	 3. do while loop
	4. infinite loop 
	
	*/
	
	
	
	
	

	public static void main(String[] args) {         // for loop - do again and again upto upper limit 
		practriceForLoop();                          // initialize the variable
		practicewhileloop();
		practiceforDoWhileLoop();
		practiceNestedForLoop();												// setting lower limit upper limit, increment or decrement 
	}						
	//statement 
	public static void practriceForLoop(){
		int i;
		for (i =1; i<=100; i++){
		System.out.println("For Loops number =" + i);	

}
}
	public static void practicewhileloop(){                     // while loop: do again and again until condition is met
		int i =1;									               // initialize the variable 
		while (i<=100){								              // setting condition 
			System.out.println("while Loops number =" + i);                  // statement 
			i++;									             // increment or decrement 
		
	}
}
	public static void practiceforDoWhileLoop(){                   // do while loop: do action then match condition 
		int i = 1;													// initialize value
		do {	
			System.out.println(" do while Loops number =" + i);      // statement 
			i++;													// increment or decrement 
	} while (i<=100);												// checking condition
			
	}
	
	public static void practiceInfiniteLoop(){                        // never ending loop 
	int i = 1;															// initialize the variable 
	for (i =1;      ;i++){													// setting lower limit, no upper limit, increment or decrement 
		System.out.println(" infinite Loops number =" + i);					// statement 
}	
	}
	
	public static void practiceNestedForLoop(){     			//Nested loop: loop inside another loop 
	
		int i;													// initializing variable i 
		int j;													// initializing variable j 
		for (i =1; i<=10; i++){        								 // first loop for i 
		for(j =1;j<=10;  i++){												// second loop for j 
				int multipicationTable = i * j;   						 // statement for second loop 
				System.out.println (multipicationTable + " ");				
			}
		}
		System.out.println("");											// statement for first loop 

	
	}
	
}


