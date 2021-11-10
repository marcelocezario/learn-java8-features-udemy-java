package br.dev.mhc.streams;

import java.util.List;
import java.util.stream.Collectors;

import br.dev.mhc.data.Student;
import br.dev.mhc.data.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> printStudentActivites() {
		List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
				.map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) //Stream<String>
				.collect(Collectors.toList());

		return studentActivities;
	}

	public static void main(String[] args) {
		
		System.out.println("printStudentActivities : " + printStudentActivites()); 
	}

}
