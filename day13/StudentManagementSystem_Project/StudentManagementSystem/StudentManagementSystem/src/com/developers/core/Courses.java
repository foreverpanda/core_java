package com.developers.core;

import com.developers.CustomExceptionClasses.SeatsNotAvailableException;

public enum Courses {
//	CourseName(availableSeats,marksRequired)
	CORE_JAVA(60,80), DBT(20,40), PYTHON(50,10) , MERN(40,5), WEB_JAVA(100,50),DEV_OPS(30,75);
	
	
	  private int availableSeats;  
	    private int marksRequired; 
	    
	Courses(int availableSeats, int marksRequired) {
		
		this.availableSeats = availableSeats;
		this.marksRequired = marksRequired;
	}

	public  int getAvailableSeats() {
		return availableSeats;
	}
	public  int getMarksRequired() {
		return marksRequired;
	}
	
	public boolean modifyAvailableSeats() throws SeatsNotAvailableException {
		if(availableSeats == 0 ) {
			throw new SeatsNotAvailableException("Seats NOT available!!!");
		}
		else {
			availableSeats--;
			
		}
		return true;
		
	}
	public void increaseSeatbyOne() {
		availableSeats++;
	}
	
	
	
	
	
}
