package StartJava;

public class FirstProgram {
	
	// Class contain the attributes and methods
	// Attributes- variable, field & constants 
	// Methods - Local variable and statements 
	
// variable has 3 type : 
	
	
	
// These are the variable 
	int a = 10; // This is instance variable and have access Modifier and default value
	static int b = 20; // This is static variable or field memory can be assign once in lifetime in RAM
	String s = "Test"; //This is instance variable and have access Modifier and default value
	
	public void add() {
		
		// Sum is local variable and not have access modifier and first you have to assign value it doesn't have default value only final is allow 
		 int sum  = a+b;
		//Statements
		System.out.println(sum);
		
	}
	
	// JVM starts read Program from here 
	public static void  main(String[]args) {
		
		FirstProgram test = new FirstProgram();
		System.out.println(test.a);
		System.out.println(b);
		System.out.println("Hello Java");
		System.out.println(test.s);
		test.add();
		//data types are two type permeative and non permeative 

	}
}
