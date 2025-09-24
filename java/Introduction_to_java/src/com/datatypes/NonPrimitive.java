package com.datatypes;

import java.util.Arrays;

public class NonPrimitive {
	public static void main(String[] args) {
		//string
		String name ="pavan";
		System.out.println("Your name: "+name);
		//array
		int[] arr= {2,3,4,5,6};
		//1st
		System.out.println("Your marks: "+Arrays.toString(arr));
		//2nd
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
