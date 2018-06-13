package com.guideme.demorest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.guideme.restapi.dtos.Student;
import com.guideme.restapi.mockup.StudentMockup;

@Path("studentService")
public class StudentService {

	StudentMockup mockup = new StudentMockup();
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Student> getStudents () {
		return mockup.getStudents();
	}
}
