package br.dev.mhc.defaults;

public interface Interface2 extends Interface1 {
	
	default void methodB() {
		
		System.out.println("inside Method B");
	}
	
	default void methodA() {
		
		System.out.println("inside Method A" + Interface2.class);
	}
}
