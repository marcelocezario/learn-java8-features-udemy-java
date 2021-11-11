package br.dev.mhc.defaults;

public interface Interface1 {
	
	default void methodA() {
		
		System.out.println("inside Method A" + Interface1.class);
	}
}
