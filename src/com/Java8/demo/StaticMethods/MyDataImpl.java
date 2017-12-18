package com.Java8.demo.StaticMethods;
//let’s see an implementation class that is having isNull() method with poor implementation.
public class MyDataImpl implements MyData {

	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		obj.isNull("abc");
		
		/* Note that isNull(String str) is a simple class method, 
		it’s not overriding the interface method. For example, 
		if we will add @Override annotation to the isNull() method,
		it will result in compiler error.*/
	}
	
}