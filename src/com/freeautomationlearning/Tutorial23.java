/**
 * 
 */
package com.freeautomationlearning;

/**
 * @author CHIRAG
 *
 */
public class Tutorial23 {

	// Checked Exception
	public void checkedExc() throws InterruptedException
	{
		Thread.sleep(1000);
	}
	
	// Unchecked Exception
	public void unCheckedExc()
	{
		try {
			int i =5/5;
			System.out.println(i);
			System.out.println("Rest my code");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("FINALLY : Rest my code always");
		}
		System.out.println("Rest my code");
	}
	
	public void testThrow()
	{
		int age = 10;
		if(age>=18)
		{
			System.out.println("Pass");
		}else
		{
			throw new NullPointerException();
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tutorial23 obj = new Tutorial23();
		//obj.unCheckedExc();
		obj.testThrow();
	}

}
