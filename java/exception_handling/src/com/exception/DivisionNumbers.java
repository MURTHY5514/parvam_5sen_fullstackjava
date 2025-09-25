package com.exception;

import java.util.Scanner;

public class DivisionNumbers {
	public static void main(String[] args) {
		/*
			 * 1. both exception(compile and run time)
			 * try{
			 * }catch(){
			 * }
			 * 
			 * 2. handle(compile time)
			 * throws
		 */
		System.out.println("Program started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res=0;
		try {
			res = num1/num2;
		} catch (ArithmeticException e) {
			//1. get message()
			System.out.println(e.getMessage());
		}
		System.out.println("resut is: "+res);
		
		System.out.println("Program Completed");
	}
}
