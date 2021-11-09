package br.dev.mhc.methodreference;

import java.util.function.Consumer;

import br.dev.mhc.data.Student;
import br.dev.mhc.data.StudentDataBase;

public class ConsumerMethodReferenceExample {
	
	/**
	 * classname::methodName
	 */
	static Consumer<Student> c1 = System.out::println;
	
	/**
	 * Classname::instanceMethodName
	 */
	static Consumer<Student> c2 = Student::printListOfActivities;

	public static void main(String[] args) {
	
		StudentDataBase.getAllStudents().forEach(c1);
		
		StudentDataBase.getAllStudents().forEach(c2);
		
	}

}
