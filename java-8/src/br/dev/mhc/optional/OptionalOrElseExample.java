package br.dev.mhc.optional;

import java.util.Optional;

import br.dev.mhc.data.Student;
import br.dev.mhc.data.StudentDataBase;

public class OptionalOrElseExample {
	
	//orElse
	public static String optionalOrElse() {
		//Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null); //Optional.empty
		String name = studentOptional.map(Student::getName).orElse("Default");		
		return name;
	}

	//orElseGet
	public static String optionalOrElseGet() {
		//Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null); //Optional.empty
		String name = studentOptional.map(Student::getName).orElseGet(()->"Default");		
		return name;
	}

	//orElseThrow
	public static String optionalOrElseThrow() {
		//Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null); //Optional.empty
		String name = studentOptional.map(Student::getName)
				.orElseThrow(()->new RuntimeException("No Data Available"));		
		return name;
	}
	
	public static void main(String[] args) {
		
		System.out.println("OptionalOrElse : " + optionalOrElse());
		System.out.println("OptionalOrElseGet : " + optionalOrElseGet());
		System.out.println("OptionalOrElseThrow : " + optionalOrElseThrow());
		
		
	}

}
