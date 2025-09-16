package com.developers.validations;

import com.developers.CustomExceptionClasses.InvalidCourseException;
import com.developers.CustomExceptionClasses.InvalidEmailIdException;
import com.developers.CustomExceptionClasses.MinimumMarksException;
import com.developers.CustomExceptionClasses.SeatsNotAvailableException;
import com.developers.core.Courses;

public class studentValidations {

	public static void emailValidation(String email) throws InvalidEmailIdException {
		if (!(email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))) {
			throw new InvalidEmailIdException("INVALID EMAIL!");
		}
	}

	
	
	public static void courseValidation(Courses course, int marks) throws InvalidCourseException, MinimumMarksException,SeatsNotAvailableException,IllegalArgumentException {

		
		if (course.modifyAvailableSeats())
		
		if(!(marks >= course.getMarksRequired())) {
			throw new MinimumMarksException("Marks Required for enrollment : "+ course.getMarksRequired());
		}
	}
	
	
}