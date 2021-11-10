package br.dev.mhc.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.dev.mhc.data.Student;
import br.dev.mhc.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		// student name and there activities in a map
		Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
		Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3.9);

		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream()
				.filter(studentPredicate)
				.filter(studentGpaPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(studentMap);
	}

}
