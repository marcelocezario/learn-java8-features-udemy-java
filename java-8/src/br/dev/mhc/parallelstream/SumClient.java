package br.dev.mhc.parallelstream;

import java.util.stream.IntStream;

public class SumClient {

	public static void main(String[] args) {
		
		Sum sum = new Sum();
		
		IntStream.rangeClosed(1, 1000)
			//1,2,3...1000
			.parallel()
			.forEach(sum::performSum); //500500
		//455057
		//482746
		
		System.out.println(sum.getTotal());

	}

}
