/*
Assignment name: Review: Chapter 2
Course: CS 2420 
Author: Ricardo Gonzalez Mendez
Note: just some practice to get back into the swig of things be able to be good   
Edited by:
Date: 09/13/2021
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class chapter2{
	public static void main(String[] args){
		double []arr2 = new double[9];
		
		//create a link to the file
    	File file = new File("double1.txt");
    	
        try {
            Scanner sc = new Scanner(file);
            //read in the file and count the number of t's
    
            for(int i = 0; i < arr2.length; i++) {
            	arr2[i] = sc.nextDouble();
        		System.out.println(arr2[i]);
        	}
            
            sum(arr2);
            average(arr2);
    		System.out.println("\n");
    		mode(arr2);
    		System.out.println("\n");

            sc.close();
          } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
		double []arr = new double [9];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] = (double)(Math.random()*10));
		}
		
		sum(arr);
		average(arr);
		
		arr[0] = 1.5;
		arr[1] = 2.5;
		arr[2] = 6.4;
		arr[3] = 2.5;
		arr[4] = 3.21;
		arr[5] = 45.6;
		arr[6] = 9.1;
		arr[7] = 4.3;
		arr[8] = 35.2;
		System.out.println("\n");
		mode(arr);
		
	}
	public static double sum( double [ ] arr ) {
		double sum = 0;
		for(double total : arr) {
			sum += total;
		}
		
		System.out.println("\n");
		System.out.println("Sum: " + sum);
		return sum;
	}
	
	public static double average( double [ ] arr ) {
		double sum = 0;
		double avg = 0;
		
		for(double total : arr) {
			sum += total;
		}
		
		System.out.println("\n");
		System.out.println("Average: " + sum/9);
		return avg;
	}
		
	public static double mode( double [ ] arr ) {
		double mode = arr[0];
		double mcount = 0;
		for(int i = 0; i < arr.length; i++) {
			double current = arr[i];
			double count  = 1;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == current) {
					count++;
				}
				if(count > mcount) {
					mode = current;
					mcount = count;
				}
			}
		}
		System.out.println("Mode: " + mode);
		return mode;
	}
}
	