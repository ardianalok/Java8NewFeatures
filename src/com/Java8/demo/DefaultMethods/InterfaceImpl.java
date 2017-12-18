package com.Java8.demo.DefaultMethods;

interface oldInterface {
	public void existingMethod();

	default public void newDefaultMethod() {
		System.out.println("New default method" + " is added in interface");
	}
}

public class InterfaceImpl implements oldInterface {
	public static void main(String[] args) {
		InterfaceImpl obj = new InterfaceImpl();
		obj.newDefaultMethod();
	}

	@Override
	public void existingMethod() {
		// TODO Auto-generated method stub

	}
}
