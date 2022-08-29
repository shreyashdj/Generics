package com.bridgelabz.generics;

/*
 * @author - SHREYASH JADHAV
 */
public class FindMaximumMain {

	public static void main(String[] args) {

		System.out.println(" *** Welcome to Find Maximum Program *** ");
		
		FindMaximum findMaximum = new FindMaximum();		// created object of FindMaximum class
		
		//	printing maximum Integers, Floats and Strings
		
		System.out.println("\n Maximun Integer value is : " + findMaximum.maximum(56, 91, 22));
		
		System.out.println("\n Maximun Float value is : " + findMaximum.maximum(34.32f, 6.34f, 87.21f));
		
		System.out.println("\n Maximun Float value is : " + findMaximum.maximum("Shreyash", "Parth", "Omkar"));
		
	}

}