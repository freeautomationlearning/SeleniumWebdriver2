/**
 * 
 */
package com.freeautomationlearning;

/**
 * @author CHIRAG
 *
 */
public class Tutorial9 {

	// Variable
	
	// static variable : Variable which is declared outside a method but inside the class
	// It has static keyword.
			static String s1 ; // s1 is static var
	
	
	// Instance Var: The Variable which is declared outside a method but inside the class
	// It dose not have static keyword.
	
	int i =10; // Here i is instance variable and int is Data Type
	
	boolean flag = true; // boolean is data type
	
	
	
	// Local Var
	public void testLocalVariable()
	{
		String s= "Chirag"; // s is Local Variable bcoz it is present inside the method.
		System.out.println(s);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// For Instance Var : we need to create a new object or instance
		Tutorial9 obj = new Tutorial9(); // obj is Object reference
		
		System.out.println(obj.i);
		
		// Static Var : we do not need to create a new oject/instance to call a static 
		// variable or method.
		
		// Static Var can be called with ClassName
		 System.out.println(s1);
		 System.out.println(Tutorial9.s1);

	}

}
