/**
 * 
 */
package com.freeautomationlearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author CHIRAG
 *
 */
public class Tutorial12 {

	// Set interface
	
	public void testhashSet()
	{
		// Declare hashset
		Set<String> s = new HashSet<String>();
		s.add("Chirag");
		s.add("Singh");
		s.add("Chirag");
		// Print the hashset value
		for(String i : s)
		{
			System.out.println("Value of set : "+i);
		}
	}
	
		// List interface
	
		public void testarrayList()
		{
			System.out.println("*******************");
			// Declare Arraylist
			List<String> s = new ArrayList<String>();
			s.add("Chirag");
			s.add("Singh");
			s.add("Chirag");
			// Print the arraylist value
			for(String i : s)
			{
				System.out.println("Value of List : "+i);
			}
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tutorial12 obj = new Tutorial12();
		obj.testhashSet();
		obj.testarrayList();
	}

}
