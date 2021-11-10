package br.dev.mhc.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static int findMaxValue(List<Integer> integerList) {
		return integerList.stream()
				// 6 -> y
				// 7 -> y
				// 8 -> y
				// 9 -> y
				// 10 -> y
				// x variable holds the max value for each element in the interation
				.reduce(0, (x, y) -> x > y ? x : y);
	}
	
	public static int findMinValue(List<Integer> integerList) {
		return integerList.stream()
				// 6 -> y
				// 7 -> y
				// 8 -> y
				// 9 -> y
				// 10 -> y
				// x variable holds the max value for each element in the interation
				.reduce(0, (x, y) -> x < y ? x : y);
	}

	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		return integerList.stream()
				// 6 -> y
				// 7 -> y
				// 8 -> y
				// 9 -> y
				// 10 -> y
				// x variable holds the max value for each element in the interation
				.reduce((x, y) -> x > y ? x : y);
	}
	
	public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
		return integerList.stream()
				// 6 -> y
				// 7 -> y
				// 8 -> y
				// 9 -> y
				// 10 -> y
				// x variable holds the max value for each element in the interation
				.reduce((x, y) -> x < y ? x : y);
	}

	public static void main(String[] args) {

		
		  //List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10); //List<Integer>
			List<Integer> integerList = new ArrayList<>();
		  
		  int minValue = findMinValue(integerList);
		  System.out.println("minValue : " + minValue);
		  
		  Optional<Integer> minValueOptional = findMinValueOptional(integerList);
		  System.out.println("minValueOptional : " + minValueOptional);
		  
		  if(minValueOptional.isPresent()) {
			  System.out.println("minValueOptional : " + minValueOptional.get());
		  } else {
			  System.out.println("No input is passed");
		  }
		  
			/*
			 * int maxValue = findMaxValue(integerList);
			 * System.out.println(" max value is : " + maxValue);
			 * 
			 * Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
			 * System.out.println("Optional Max is : " + maxValueOptional);
			 * if(maxValueOptional.isPresent()) {
			 * System.out.println("MaxValue using optional : " + maxValueOptional.get());
			 * 
			 * } else { System.out.println("Input list is empty.");
			 * 
			 * }
			 */
		 
		
		
	}

}
