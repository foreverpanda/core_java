package com.developers.SMSService;

import java.time.LocalDate;

import com.developers.CustomExceptionClasses.AccountExistsException;
import com.developers.CustomExceptionClasses.InvalidCourseException;
import com.developers.CustomExceptionClasses.InvalidEmailIdException;
import com.developers.CustomExceptionClasses.MinimumMarksException;
import com.developers.CustomExceptionClasses.SeatsNotAvailableException;
import com.developers.core.Courses;
import com.developers.core.Student;

public interface SMSInterface {
	
	public void admitStudent(String studentName, String studentEmail, int studentMarks, Courses course, LocalDate admissionDate) throws MinimumMarksException,InvalidEmailIdException,AccountExistsException, InvalidCourseException,SeatsNotAvailableException;
	public void cancelAdmission(String studentEmail) throws InvalidEmailIdException;
	public void searchStudentByEmail(String studentEmail) throws InvalidEmailIdException;
	public void displayAllStudents();
	public void listStudentOfCourse(Courses c1)throws InvalidCourseException;
	
	
}
