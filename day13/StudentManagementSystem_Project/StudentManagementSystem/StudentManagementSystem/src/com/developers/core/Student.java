package com.developers.core;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	{
		studentId = 101;
	}
	
	public static int studentId;
	public String studentName;
	public String studentEmail;
	public int studentMarks;
	public Courses course;
	public LocalDate admissionDate;
	
	public Student(String studentName, String studentEmail, int studentMarks, Courses course, LocalDate admissionDate) {
		super();
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMarks = studentMarks;
		this.course = course;
		this.admissionDate = admissionDate;
	}
	
	public Student(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentEmail=" + studentEmail + ", studentMarks="
				+ studentMarks + ", course=" + course + ", admissionDate=" + admissionDate + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(studentEmail.equals(((Student)o).getStudentEmail())) {
			return true;
		}
		return false;
	}

	public Courses getCourse() {
		return course;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		
//		return 0;
//	
//	}
	
	
	
	
}
