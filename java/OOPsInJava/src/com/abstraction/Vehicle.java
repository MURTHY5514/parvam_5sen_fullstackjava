package com.abstraction;

public interface Vehicle {
	//only abstract methods
	abstract void start();
    void stop();
    
    //java 8 and 9 onwards we can declare default and static methods
    public static void display() {
    	System.out.println("Hello display");
    }
}
