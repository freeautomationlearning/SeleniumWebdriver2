/**
 * 
 */
package com.freeautomationlearning;

/**
 * @author CHIRAG
 *
 */
public class Tutorial8 {

	// Simple For Loop
	public static void testSimpleForloop()
	{
		//syntax
		for(int i=1;i<=50;i++)
		{
			System.out.println("i value : "+i);
		}
	}

	// For each Loop
	// For each loop mainly used in collection such as array, arraylist etc
	public static void testForEachLoop()
	{
		int i[] = {1,2,3,4,5,6,7,8,9,10};
		// For each loop
		for(int j : i)
		{
			System.out.println("value of j : "+j);
		}
		System.out.println("**************************************");
		for(int l=0;l<=i.length-1;l++)
		{
			System.out.println("value of l : "+i[l]);
		}
	}

	// Label Loop : 
	public static void testLabelLoop()
	{
		first:
			for(int i=0;i<=5;i++)
			{
				second:
					for(int j=0;j<=5;j++)
					{
						if(i!=j)
						{
							System.out.println("VALUE i : "+i+" VALUE j :"+j);
							break second;
						}
					}
				break first;
			}

	}

	// While Loop: 
	public static void testWhileLoop()
	{
		int i=1;
		while(i==10)// If Condition is true ==> Go into while loop
		{
			System.out.println("While : "+i);
			i++;
		}
	}
	
	// Do While Loop
	public static void testDoWhileLoop()
	{
		int i =1;
		do{
			System.out.println("Do while : "+i);
			i++;
		}while(i==10);
	}
	
	// Break
	public static void testBreakLoop()
	{
		for (int i=1;i<=10;i++)
		{
			if(i==6)
			{
				break;
			}
			System.out.println(i);
		}
	}
	
	// Continue
		public static void testContinueLoop()
		{
			for (int i=1;i<=10;i++)
			{
				if(i==6)
				{
					continue;
				}
				System.out.println(i);
			}
		}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//testSimpleForloop();
		//testForEachLoop();
		//testLabelLoop();
		//testWhileLoop();
		//testDoWhileLoop();
		//testBreakLoop();
		testContinueLoop();
	}

}
