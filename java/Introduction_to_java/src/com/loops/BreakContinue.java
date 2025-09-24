package com.loops;

public class BreakContinue {
	protected int a =10;
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}else if(i==8) {
				break;
			}else {
				System.out.print(i+" ");
			}
		}
	}
}
