package br.dev.mhc.streams;

import java.util.Optional;

import br.dev.mhc.data.Student;
import br.dev.mhc.data.StudentDataBase;

public class StreamsFindAnyFirstExample {
	
	public static Optional<Student> findAnyStudent() {
		return StudentDataBase.getAllStudents().stream()
				//adam
				//jenny
				//emily
				.filter(student -> student.getGpa() >= 3.9)
				.findAny();
	}
	
	public static Optional<Student> findFirstStudent() {
		return StudentDataBase.getAllStudents().stream()
				//adam
				//jenny
				//emily
				.filter(student -> student.getGpa() >= 3.9)
				.findFirst();
	}

	public static void main(String[] args) {
		
		Optional<Student> studentOptionalFindAny = findAnyStudent();
		if(studentOptionalFindAny.isPresent()) {
			System.out.println("Found the student : " + studentOptionalFindAny.get());
		} else {
			System.out.println("Student not found !");
		}
		
		Optional<Student> studentOptionalFindFirst = findFirstStudent();
		if(studentOptionalFindFirst.isPresent()) {
			System.out.println("Found the student : " + studentOptionalFindFirst.get());
		} else {
			System.out.println("Student not found !");
		}
		
	}

}
