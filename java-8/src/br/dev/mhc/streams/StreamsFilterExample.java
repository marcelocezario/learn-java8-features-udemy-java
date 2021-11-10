package br.dev.mhc.streams;

import java.util.List;
import java.util.stream.Collectors;

import br.dev.mhc.data.Student;
import br.dev.mhc.data.StudentDataBase;

public class StreamsFilterExample {

	public static List<Student> filterStudents() {
		return StudentDataBase.getAllStudents().stream() //Stream<Student>
				.filter((student -> student.getGender().equals("female"))) //Streamm<Student>
				//filters and sends only the students whose gender is female
				.filter(student -> student.getGpa() >= 3.9)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		//System.out.println("filterStudents : " + filterStudents());
		filterStudents().forEach(System.out::println);

	}

}
