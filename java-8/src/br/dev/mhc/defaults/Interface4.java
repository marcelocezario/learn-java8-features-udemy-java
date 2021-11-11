package br.dev.mhc.defaults;

public interface Interface4 {

	default void methodA() {

		System.out.println("inside Method A" + Interface4.class);
	}
}
