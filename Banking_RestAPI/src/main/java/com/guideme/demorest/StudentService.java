package com.guideme.demorest;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.guideme.restapi.dtos.Student;
import com.guideme.restapi.mockup.StudentMockup;

@Path("studentService")
public class StudentService {

	StudentMockup mockup = new StudentMockup();

	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Student> getStudents() throws SQLException {
		return mockup.getStudents();
	}

	@POST
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student addStudent(Student s) throws SQLException {
		System.out.println("Add Student :" + s);
		mockup.createStudent(s);
		return s;
	}

	@GET
	@Path("studentFetch/{fname}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student getStudent(@PathParam("fname") String fname) {
		System.out.println("Fetching Student :" + fname);
		return mockup.getStudent(fname);
	}
	
	@PUT
	@Path("student")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student updateStudent(Student s) throws SQLException {
		System.out.println("Update Student :" + s);
		mockup.updateStudent(s);
		return s;
	}
	
	@DELETE
	@Path("studentFetch/{fname}")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student dropStudent(@PathParam("fname") String fname) throws SQLException {
		System.out.println("Delete Student :" + fname);
		Student s = mockup.getStudent(fname);		
		mockup.dropStudent(s);
		return s;
	}

	
}
