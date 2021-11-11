package br.dev.mhc.defaults;

public interface Interface3 extends Interface2 {

	default void methodC() {

		System.out.println("inside Method C");
	}
}
