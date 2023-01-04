package com.bridgelabz.finbonacciseries;
import java.util.*;

public class finbonacci_Series {

	public static void main(String[] args) {
		
		int first_num = 0, second_num = 1;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Enter the number for series: ");
		int num = sc.nextInt();
		
		System.out.println(" The series is: ");
		
		for (int i = 0; i <= num; i++) {
			
			System.out.print( first_num + " ,");
			
			int sum = first_num + second_num;
			first_num = second_num;
			second_num = sum;
			
		}
	}
}
