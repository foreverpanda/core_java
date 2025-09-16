package com.developers.SMSService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.developers.CustomExceptionClasses.AccountExistsException;
import com.developers.CustomExceptionClasses.InvalidCourseException;
import com.developers.CustomExceptionClasses.InvalidEmailIdException;
import com.developers.CustomExceptionClasses.MinimumMarksException;
import com.developers.CustomExceptionClasses.SeatsNotAvailableException;
import com.developers.core.Courses;
import com.developers.core.Student;
import com.developers.validations.studentValidations;

public class SMSServiceImpl implements SMSInterface {
//	public Student(String studentName, String studentEmail, int studentMarks, Courses course, LocalDate admissionDate) {
	List<Student> studentsList;

	public SMSServiceImpl() {
		studentsList = new ArrayList<>();
	}

	@Override
	public void admitStudent(String studentName, String studentEmail, int studentMarks, Courses course,
			LocalDate admissionDate) throws AccountExistsException, MinimumMarksException, SeatsNotAvailableException,
			InvalidEmailIdException, InvalidCourseException {
		
		//validating email is in correct format or not
		studentValidations.emailValidation(studentEmail);
		
		//checking if email id is already in the database or not
		Student dummy = new Student(studentEmail);
		if (studentsList.contains(dummy)) {
			throw new AccountExistsException("Account already Exists!!");
		}

		//validating whether student is eligible for course or not
		studentValidations.courseValidation(course, studentMarks);
		
		//Validation successfull -> registering the student
		studentsList.add(new Student(studentName, studentEmail, studentMarks, course, admissionDate));
		
		System.out.println("Registeration Successful!!");

	}

	@Override
	public void cancelAdmission(String studentEmail) throws InvalidEmailIdException {
		// TODO Auto-generated method stub
		Student dummy = new Student(studentEmail);
		int index = studentsList.indexOf(dummy);
		if(index == -1) {
			throw new InvalidEmailIdException("Email not found!!");
		}
		Student removeThisStudent = studentsList.get(index);
		removeThisStudent.course.increaseSeatbyOne();
		System.out.println("Admission Cancelled for "+ removeThisStudent);
		studentsList.remove(removeThisStudent);
	}

	@Override
	public void searchStudentByEmail(String studentEmail) throws InvalidEmailIdException {
		// TODO Auto-generated method stub
		Student thisStudent = new Student(studentEmail);
		int index = studentsList.indexOf(thisStudent);
		if(index == -1) {
			throw new InvalidEmailIdException("Email Not Found!!");
		}
		thisStudent = studentsList.get(index);
		System.out.println(thisStudent);
		 
	}

	@Override
	public void displayAllStudents() {
		// TODO Auto-generated method stub
		for (Student i : studentsList) {
			System.out.println(i);
		}
	}

	@Override
	public void listStudentOfCourse(Courses c1) throws InvalidCourseException {
		// TODO Auto-generated method stub
		int found = 0;
		for(Student i : studentsList) {
			if(i.getCourse() == c1) {
				found = 1;
				System.out.println(i);
			}
		}
		if(found == 0) {
			System.out.println("Not students are currently enrolled in this course!!");
		}
		

	}

}
