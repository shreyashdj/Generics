package com.bridgelabz.generics;

/*
 * @author - SHREYASH JADHAV
 */
public class FindMaximum {
	
	// created maximum method to find maximum Integer using compareTo
	
	public Integer maximum(Integer a, Integer b, Integer c) {
		
		Integer max = a;
		
		if (b.compareTo(max) > 0) {
			
			max = b;
		
		} else if (c.compareTo(max) > 0) {
			
			max = c;
		}
		
		return max;
	}
	
	// created maximum method to find maximum Float using compareTo
	
	public Float maximum(Float a, Float b, Float c) {
		
		Float max = a;
		
		if (b.compareTo(max) > 0) {
			
			max = b;
		
		} else if (c.compareTo(max) > 0) {
			
			max = c;
		}
		
		return max;
	}
	
	// created maximum method to find maximum String using compareTo
	
	public String maximum(String a, String b, String c) {
			
		String max = a;
			
			if (b.compareTo(max) > 0) {
				
				max = b;
			
			} else if (c.compareTo(max) > 0) {
				
				max = c;
			}
			
			return max;
		}
	
}