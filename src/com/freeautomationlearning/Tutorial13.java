/**
 * 
 */
package com.freeautomationlearning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author CHIRAG
 *
 */
public class Tutorial13 {

	// Map Interface which works for Key and Value
	
	public static void testHashmap()
	{
		// Declare the Map
		Map<Integer, String> m = new HashMap<Integer,String>();
		
		// Add the values into Map
		m.put(2, "Deepak");
		m.put(1, "Chirag");
		
		// Identify the keys
		Set<Integer> keys = m.keySet();
		
		// Print the values of Map
		for(Integer i : keys)
		{
			System.out.println("Roll No. : "+i+" Student Name : "+m.get(i));
		}
				
	}
	
	public static void testTreemap()
	{
		// Declare the Map
		Map<String, String> m = new TreeMap<String,String>();
		
		// Add the values into Map
		m.put("Google", "Chirag");
		m.put("Facebook", "Deepak");
		
		// Identify the keys
		Set<String> keys = m.keySet();
		
		// Print the values of Map
		for(String i : keys)
		{
			System.out.println("Applicattion Name : "+i+" : UserName : "+m.get(i));
		}			
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testHashmap();
		testTreemap();

	}

}
