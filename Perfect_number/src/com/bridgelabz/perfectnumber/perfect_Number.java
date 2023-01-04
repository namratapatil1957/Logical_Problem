package com.bridgelabz.perfectnumber;
import java.util.*;

public class perfect_Number {

	public static void main(String[] args) {
		
		double sum = 0;
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter the number: ");
		double num = sc.nextDouble();
		
		for (int i = 1; i <= num/2; i++) {
			if ( num % i == 0) {
				
				sum = sum + i;
				
			}
		}
		
		if (sum == num) {
			System.out.println( num + " is a perfect number");
		}
		else {
			System.out.println( num + " is not a perfect number");
		}
	}
}
