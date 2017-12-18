package com.Java8.demo.MethodReferences;

public class ImplementingTheRunnableInterface {

	public static void main(String[] args) {
	
	
	//lambda expression to create an instance of the Runnable interface as runnable is an functional interface
	
	
	Runnable runnable =()->System.out.println("welcome to runnable"+"interface of java 8");
	
	
	Thread thread =new Thread(runnable);
	
	
	thread.start();
}
}
