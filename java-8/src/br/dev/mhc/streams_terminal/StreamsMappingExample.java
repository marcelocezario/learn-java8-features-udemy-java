package br.dev.mhc.streams_terminal;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import br.dev.mhc.data.Student;
import br.dev.mhc.data.StudentDataBase;

public class StreamsMappingExample {

	public static void main(String[] args) {
		
		List<String> namesList = StudentDataBase.getAllStudents()
				.stream()
				.collect(mapping(Student::getName, toList()));
		
		System.out.println("namesList : " + namesList);

		Set<String> namesSet = StudentDataBase.getAllStudents()
				.stream()
				.collect(mapping(Student::getName, toSet()));

		StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)
				.collect(toList());

		System.out.println("namesSet : " + namesSet);
}

}
