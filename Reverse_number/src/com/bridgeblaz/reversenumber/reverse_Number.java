package com.bridgeblaz.reversenumber;
import java.util.*;

public class reverse_Number {

	public static void main(String[] args) {
		
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the numbers to reverse: ");
		int num = sc.nextInt();
		
		while (num != 0) {
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num/10;
		}
		System.out.println(" The reverse numbers are: " + reverse);
	}
}
