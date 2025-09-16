package com.developers.UI;

import java.time.LocalDate;
import java.util.Scanner;

import com.developers.SMSService.SMSServiceImpl;
import com.developers.core.Courses;

public class testerStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SMSServiceImpl service = new SMSServiceImpl();
		
		try(Scanner sc = new Scanner(System.in)){
			boolean exit = false;
			while(!exit) {
				try {
					System.out.println("MENU\n1. Register Student\n2. Display all Students\n3. Cancel Admission of Candidate\n4. Search student by email\n5. Print students of particular course 0. Exit");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter Name : ");
						String name = sc.next();
						System.out.println("Enter Email id : ");
						String email = sc.next().toLowerCase();
						System.out.println("Enter Marks obtained : ");
						int marks = sc.nextInt();
						System.out.println("Select a course : CORE_JAVA, DBT, PYTHON, MERN, WEB_JAVA, DEV_OPS" );
						String courseType = sc.next().toUpperCase();
						Courses selectedCourse = Courses.valueOf(courseType);
				
						service.admitStudent(name, email, marks, selectedCourse,  LocalDate.now() );
					break;
					
					case 2:
						service.displayAllStudents();
						break;
					case 3:
						System.out.println("Enter email id : ");
						service.cancelAdmission(sc.next());
						break;
					case 4:
						System.out.println("Enter email id : ");
						service.searchStudentByEmail(sc.next());
						break;
					case 5:
						System.out.println("Enter course : ");
						String getCourse = sc.next().toUpperCase();
						Courses course = Courses.valueOf(getCourse);
						service.listStudentOfCourse(course);
						break;
					case 0:
						exit = true;
						break;
				}}
				catch(Exception e) {
					sc.nextLine();
					System.out.println(e);
				}
				}
			}
		}

	}

