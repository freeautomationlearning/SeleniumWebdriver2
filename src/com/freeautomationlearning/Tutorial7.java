package com.freeautomationlearning;

public class Tutorial7 {

	// IF ELSE
	public static void testIFElse()
	{
		// IFCondition
		String s = "Singh";
		/*if(s.equalsIgnoreCase("ChiragSingh"))
		{
			System.out.println("Passed");
		}else
		{
			System.out.println("Failed");
		}*/

		// ESLE IF Condition

		if(s.equalsIgnoreCase("ChiragSingh"))
		{
			System.out.println("Passed");
		}else if(s.equalsIgnoreCase("Singh"))
		{
			System.out.println("Failed");
		}else
		{
			System.out.println("No text Found");
		}
	}

	public static void testSwitch()
	{
		String s = "Singh";
		switch (s) {
		case "Chirag":
			System.out.println("Passed");
			break;
		case "Singh":
			System.out.println("Failed");
			break;
		default:
			System.out.println("No text Found");
			break;
		}
	}
	public static void main(String[] args) {
		//testIFElse();
		testSwitch();
	}
}
