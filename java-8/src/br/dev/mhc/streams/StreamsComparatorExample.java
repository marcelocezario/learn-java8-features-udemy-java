package br.dev.mhc.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.dev.mhc.data.Student;
import br.dev.mhc.data.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentByName() {
		return StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGpa() {
		return StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}
	
	public static List<Student> sortStudentByGpaDesc() {
		return StudentDataBase.getAllStudents()
				.stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		System.out.println("Students sorted by Name : ");
		sortStudentByName().forEach(System.out:: println);

		System.out.println("Students sorted by Gpa : ");
		sortStudentByGpa().forEach(System.out:: println);
		
		System.out.println("Students sorted by Gpa Desc : ");
		sortStudentByGpaDesc().forEach(System.out:: println);

	}

}
