package com.guideme.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.guideme.restapi.dtos.Student;

@Path("studentService")
public class StudentService {

	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Student> getStudents () {
		Student s1 = new Student("Arun", "Ammasai");
		Student s2 = new Student("Dennis", "John");

		List<Student> students = Arrays.asList(s1, s2);
		return students;
	}
}
