package com.Java8.demo.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkingWithStream {

	public static void main(String[] args) {
		// Most stream operations accept some kind of lambda expression parameter,
		//a functional interface specifying the exact behavior of the operation.
		List<String> myList =
			    Arrays.asList("a1", "a2", "b1", "c2", "c1");

			myList
			    .stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			   .forEach(System.out::println);
			
			
		//  Different kind of streams 
			
			
			/*
			 * Streams can be created from various data sources, especially collections.
			 *  Lists and Sets support new methods stream() 
			 * */
			Arrays.asList("a1", "a2", "a3")
		    .stream()
		    .findFirst()
		    .ifPresent(System.out::println);  // a1
			
		/*
		 * Calling the method stream() on a list of objects returns a regular object stream. 
		 * But we don't have to create collections in order to work with streams as we see in
		 *  the next code sample	
		 *  
		 *  Just use Stream.of() to create a stream from a bunch of object references.
		 */
			
			Stream.of("a1", "a2", "a3")
		    .findFirst()
		    .ifPresent(System.out::println);  // a1	
		/*
		 * working with the primitive data types int, long and double.
		 *  As you might have guessed it's IntStream, LongStream and DoubleStream.	
		 */
			
			IntStream.range(1, 4)
		    .forEach(System.out::println);
			
			
	    
	}
	
	
	
	
}
