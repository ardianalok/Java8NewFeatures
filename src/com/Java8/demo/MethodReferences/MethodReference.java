package com.Java8.demo.MethodReferences;

//We can create a thread using method reference
public class MethodReference {

	public static void main(String[] args) {
		Thread t1=new Thread(MethodReference::print);
		Thread t2=new Thread(MethodReference::print);
        t1.start();
        t2.start();
	}
	public static void print(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
		}
	}

}
