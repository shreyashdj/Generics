package com.bridgelabz.generics;

/*
 * @author - SHREYASH JADHAV
 */
public class FindMaximum {
	
	// created maximum method to find maximum Integer using compareTo
	
	public Integer maximum(Integer a, Integer b, Integer c) {
		
		Integer max = a;
		
		if (b.compareTo(max) > 0 && b.compareTo(c) > 0)
			
			max = b;
		
		else if (c.compareTo(max) > 0)
			
			max = c;
		
		return max;
	}

}