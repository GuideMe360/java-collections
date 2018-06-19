package com.guideme.restapi.mockup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.guideme.restapi.dtos.Student;

public class StudentMockup {

	List<Student> studentList;

	public StudentMockup() {
		Student s1 = new Student("Arun", "Ammasai");
		Student s2 = new Student("Dennis", "John");
		studentList = Arrays.asList(s1, s2);
	}

	public List<Student> getStudents() throws SQLException {
		List<Student> studentList = new ArrayList<Student>();
		ResultSet rs = getDataSource().createStatement().executeQuery("select * from student");
		while (rs.next()) {
			Student stu = new Student();
			stu.setFirstName(rs.getString(2));
			stu.setLastName(rs.getString(3));
			studentList.add(stu);
		}
		return studentList;
	}

	public Student getStudent(String name) {
		return studentList.stream().filter(p -> p.getFirstName().equals(name)).findAny().orElse(null);
	}

	public void createStudent(Student s) throws SQLException {
		String updateQuery = "insert into student (firstname,lastname) values(?,?)";
		PreparedStatement ps = getDataSource().prepareStatement(updateQuery);
		ps.setString(1, s.getFirstName());
		ps.setString(2, s.getLastName());
		ps.executeUpdate();
	}
	
	public Student updateStudent(Student s) throws SQLException {
		String updateQuery = "update student set lastname =? where firstname =?";
		PreparedStatement ps = getDataSource().prepareStatement(updateQuery);
		ps.setString(1, s.getLastName());
		ps.setString(2, s.getFirstName());
		int count = ps.executeUpdate();
		System.out.println("Updated Record Count :" + count);
		return s;
	}
	
	public Student dropStudent(Student s) throws SQLException {
		String updateQuery = "DELETE FROM STUDENT WHERE firstname=?";
		PreparedStatement ps = getDataSource().prepareStatement(updateQuery);
		ps.setString(1, s.getFirstName());
		int count = ps.executeUpdate();
		System.out.println("Deleted Record Count :"+count);
		return s;
	}

	public Connection getDataSource() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
