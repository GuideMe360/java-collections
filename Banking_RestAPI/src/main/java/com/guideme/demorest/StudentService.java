package com.guideme.demorest;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
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

	/*@GET
	@Path("{year}/{month}/{day}")
	public Student getUserHistory(@PathParam("year") int year, @PathParam("month") int month, @PathParam("day") int day) {

		String date = year + "/" + month + "/" + day;
		System.out.println("Inputs :" + date);

		return mockup.getStudent("Arun");
	}*/
}
