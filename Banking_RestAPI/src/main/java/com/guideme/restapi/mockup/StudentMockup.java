package com.guideme.restapi.mockup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.guideme.restapi.dtos.Student;

public class StudentMockup {

	List<Student> studentList = new ArrayList<Student>();

	public StudentMockup() {
		Student s1 = new Student("Arun", "Ammasai");
		Student s2 = new Student("Dennis", "John");
		studentList = Arrays.asList(s1, s2);
	}

	public List<Student> getStudents() {
		return studentList;
	}

	public Student getStudent(String name) {
		return studentList.stream().filter(p -> p.getFirstName().equals(name)).findAny().orElse(null);
	}
}
