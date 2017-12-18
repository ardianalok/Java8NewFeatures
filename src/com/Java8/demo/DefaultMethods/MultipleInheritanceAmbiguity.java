package com.Java8.demo.DefaultMethods;
 interface InterfaceA { 
    default void defaultMethod(){ 
        System.out.println("Interface A default method"); 
    } 
}
 interface InterfaceB {
    default void defaultMethod(){
        System.out.println("Interface B default method");
    }
}
public class MultipleInheritanceAmbiguity implements InterfaceA, InterfaceB  {
//The above code will fail to compile with the following error,
//java: class MultipleInheritanceAmbiguity inherits unrelated defaults for defaultMethod() from types InterfaceA and InterfaceB
//In order to fix this class, we need to provide default method implementation:
	@Override
	public void defaultMethod() {
//		Further, if we want to invoke default implementation provided by any
//		of super interface rather than our own implementation, we can do so as follows
//		We can choose any default implementation or both as part of our new method.
	InterfaceA.super.defaultMethod();
//		InterfaceB.super.defaultMethod();
		System.out.println("hello");
		
		
	}
	public static void main(String[] args) {
		MultipleInheritanceAmbiguity m=new MultipleInheritanceAmbiguity();
		m.defaultMethod();
	}
	
	
	
	
}

