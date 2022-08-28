package com.bridgelabz.generics;

import java.util.Scanner;	// imported Scanner class

/*
 * @author - SHREYASH JADHAV
 */
public class FindMaximumMain {

	public static void main(String[] args) {

		System.out.println(" *** Welcome to Find Maximum Program *** ");
		
		FindMaximum findMaximum = new FindMaximum();		// created object of FindMaximum class
		
		Scanner scan = new Scanner(System.in);				// created object of Scanner class
		
		System.out.print("\n Enter number a : ");
		Integer a = scan.nextInt();
		
		System.out.print(" Enter number b : ");
		Integer b = scan.nextInt();
		
		System.out.print(" Enter number c : ");
		Integer c = scan.nextInt();
		
		System.out.println("\n Maximun Integer is : " + findMaximum.maximum(a, b, c));
		
		scan.close();
	}

}
