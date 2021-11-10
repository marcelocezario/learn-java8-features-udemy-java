package br.dev.mhc.streams_terminal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.dev.mhc.data.Student;
import br.dev.mhc.data.StudentDataBase;

public class StreamGroupingByExample {
	
	public static void groupStudentsByGender() {
		
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGender));
		
		System.out.println(studentMap);
	}
	
	public static void customizedGroupingBy() {
		
		Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
				.stream() //Stream<Students>
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
		
		System.out.println(studentMap);
	}

	public static void main(String[] args) {
		
		groupStudentsByGender();
		
		System.out.println();
		System.out.println();
		
		customizedGroupingBy();

	}

}
