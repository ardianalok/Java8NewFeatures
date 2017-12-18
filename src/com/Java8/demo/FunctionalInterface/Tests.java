package com.Java8.demo.FunctionalInterface;
abstract class Hello{
	abstract void hello();
	
}
public class Tests {

	public static void main(String[] args) {
		// old way with anonymous class
		Thread t =new Thread(new Runnable(){
			   public void run(){
			     System.out.println("Runnable implemented by using Lambda Expression");
			   }
			});
		
		t.run();
		
		
		//new way with lambda expression
		Thread t1 = new Thread(()->{
			   System.out.println("Runnable implemented by using Lambda Expression");
			});
		
		t1.run();
		
		Hello l=new Hello(){

			@Override
			void hello() {
				// TODO Auto-generated method stub
				
			}};
			//Hello l1=()->{System.out.println("");};
			
			//error :the target of l1 type must be a functional interface
	}
}
