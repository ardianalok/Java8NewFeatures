package com.Java8.demo.StreamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(11);
		a.add(13);

		a.add(14);
		System.out.println(Test.sumIterator(a)); 
        System.out.println(Test.sumStream(a)); 
         
         
	}
	
	//Internal or Stream Iteration
	private static OptionalDouble sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).average();
	}
	
	
	//External Iteration
	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}
}
