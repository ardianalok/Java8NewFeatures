package com.Java8.demo.LambdaExpression;

interface ZeroParameter {
	String start();
}

interface OneParameter {
	String start(String s);
}

interface MultipleParameters {
	String start(String s, String t);
}

public class Test {

	public static void main(String[] args) {
		// If the method you are matching your lambda expression against takes
		// no parameters,
		// then you can write your lambda expression like this:

		ZeroParameter i = () -> {
			int k=5;int l=56;
			int t=k+l;
			System.out.println("No Parameter"+t);
			return "No Parameter"+t;
		};
		i.start();

		// If the method you are matching your Java lambda expression against
		// takes one
		// parameter, you can write the lambda expression like this:
		OneParameter j = param -> {
			System.out.println(param);
			return param;
		};
		j.start("One parameter");

		// When a lambda expression takes a single parameter, you can also omit
		// the parentheses, like this:
		OneParameter k = (param) -> {
			System.out.println(param);
			return param;
		};
		k.start("One parameter");

		// If the method you match your Java lambda expression against takes
		// multiple parameters,
		// the parameters need to be listed inside parentheses. Here is how that
		// looks in Java code:

		MultipleParameters m = (p1, p2) -> {
			System.out.println("Multiple parameters: " + p1 + ", " + p2);
			return p1 + p2;
		};
		m.start("one", "two");

	}

}
