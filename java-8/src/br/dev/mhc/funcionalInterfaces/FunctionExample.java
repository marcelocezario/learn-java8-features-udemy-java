package br.dev.mhc.funcionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
	
	static Function<String, String> function = (name) -> name.toUpperCase();

	static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

	public static void main(String[] args) {
		
		System.out.println("Result id : " +  function.apply("java8"));
		
		System.out.println("Result of andthen is : " +  function.andThen(addSomeString).apply("java8"));

		System.out.println("Result of andthen is : " +  function.compose(addSomeString).apply("java8"));
	}

}
