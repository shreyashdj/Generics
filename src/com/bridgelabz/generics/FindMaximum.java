package com.bridgelabz.generics;

/*
 * @author - SHREYASH JADHAV
 */
public class FindMaximum {
	
	// created maximum Generic method to find maximum value using compareTo
	
	public <T extends Comparable <T>> T maximum(T a, T b, T c) {
		
		T max = a;
		
		if (b.compareTo(max) > 0) {
			
			max = b;
		
		} else if (c.compareTo(max) > 0) {
			
			max = c;
		}
		
		return max;
	}
	
}