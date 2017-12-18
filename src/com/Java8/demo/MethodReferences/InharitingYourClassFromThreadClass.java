package com.Java8.demo.MethodReferences;
class MyThreadClass extends Thread{
	@Override
	public void run() {
		System.out.println("hello");
	}
}



//By inheriting your class from the Thread class
public class InharitingYourClassFromThreadClass {
public static void main(String[] args) {
	new MyThreadClass().run();
}
	
	
}
