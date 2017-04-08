/**
 * 
 */
package com.freeautomationlearning;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author CHIRAG
 *
 */
public class Tutorial10 {

	// 1D Array
	public static void testArraySingleDim()
	{
		// Single Dim Array
		// Inistalize 1D array
		//int a[] = {7,6,4,3};

		String a[] = new String[3];
		a[0]= "Chirag";
		a[1] ="Singh";
		a[2] = "QA";		//a[3] = "Sel";
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(i+" : "+a[i]);
		}

	}

	// Double Dimension Array
	public static void testArrayDoubleDim()
	{
		// Double Dim Array (2D Array) 
		String s[][] = new String[3][3];
		s[0][0] = "Chirag";
		s[1][2] = "Singh";

		for(int i=0;i<=s.length-1;i++)
		{
			for(int j=0;j<=s.length-1;j++)
			{
				System.out.println(i+" : "+j+ " : "+s[i][j]);
			}
		}
	}
	public static void testArrayList()
	{
		ArrayList<String> s = new ArrayList<String>();
		s.add("Chirag");
		s.add("Singh");

		for(String a : s)
		{
			System.out.println("ArrayList : "+a);
		}
	}

	public static void testLinkedList()
	{
		LinkedList<String> s = new LinkedList<String>();
		s.add("Chirag");
		s.add("Singh");

		for(String a : s)
		{
			System.out.println("LinkedList : "+a);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testArraySingleDim();
		//testArrayList();
		//testLinkedList();
	}

}
