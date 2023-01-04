package com.bridgelabz.stopwatch;
import java.util.*;

public class stop_Watch {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
	
		System.out.println(" Enter S to start the watch");
		char s = sc.next().charAt(0);
		double start = System.currentTimeMillis();
	
		System.out.println(" Enter E to stop the watch");
		char e = sc.next().charAt(0);
		double stop = System.currentTimeMillis();
	
		double elapsed_time = (stop - start);
		double sec = elapsed_time /1000;
		System.out.println(" The Elapsed time is: " + elapsed_time +" ms");
		System.out.println(" The Elapsed time in seconds is: " + sec + " sec");
	
	}
}
