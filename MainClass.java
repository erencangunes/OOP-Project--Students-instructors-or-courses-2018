package proje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class MainClass {
	
	
	 private static ArrayList<Student> studentList;;
	 private static ArrayList<Instructor> instructorList;
	 private static ArrayList<Course> courseList;
	 
	 private static Student student;
	 private static Course course;
	 private static Instructor instructor;
	 private static Iterator<Student> iteStu;
	 private static Iterator<Course> iteCou;
	 private static Iterator<Instructor> iteIns;
	 
	 public static void main(String args[]) {
		 	System.out.println("#######################\n"
		 					 + "#                     #\n"
		 					 + "#                     #\n"
		 					 + "#                     #\n"
		 					 + "#        WELCOME      #\n"
		 					 + "#                     #\n"
		 					 + "#                     #\n"
		 					 + "#                     #\n"
		 					 + "#######################\n");
		 	
		 		studentList = new ArrayList<>();
		 		instructorList = new ArrayList<>();
		 		courseList = new ArrayList<>();
		 		giris();
		 
		}
	

	
	
	
	private static void giris() {
		
		String char1 = null;
		String char2 = null;
	 	String char3 = null;
	 	String char4 = null;
	 	String char5 = null;
	 	String char6 = null;
	 	boolean control = true; //first time
	 	boolean controlAdd;
	 	boolean controlRemove ;
	 	boolean controlUpdate ;
	 	boolean listProperty;
	 	boolean controlList;
	 	
	 	Scanner scan = new Scanner(System.in);
	 	while(control) {
	 		System.out.println("1=Add\n"
					  +"2=Remove\n"
					  + "3=Update\n"
					  + "4=List for property\n"
					  + "5=List all\n"
					  + "6=Quit"
			);
	 		char1 = scan.next();
	 	
	 		switch(char1) 
	 		{
/*1 START SECTION*/case "1":
		 			controlAdd = true;
		 			while(controlAdd) 
		 			{
		 				System.out.println("1=Add student\n"
			 					+ "2=Add instructor\n"
			 					+ "3=Add course\n"
			 					+ "4=back");
		 				char2 = scan.next();
		 				
		 				switch(char2) 
		 				{
		 				
		 					case "1":
		 						addStudent();
		 						break;
		 					case "2":
		 						addInstructor();
		 						break;
		 					case "3":
		 						addCourse();
		 						break;
		 					case "4":
		 						controlAdd =false;
		 						break;
		 					default:
		 						System.out.println("Lütfen geçerli karakter girin!!");
		 						continue;
		 				
		 				}
	 				
	 				
	 			}
	 			
/*1 END SECTION*/break;
	 			
/*  2 START SECTION*/case "2":
	 					controlRemove = true;
	 					while(controlRemove) 
	 					{
	 						System.out.println("1=Remove Student\n"
	 								+ "2=Remove instructor\n"
	 								+ "3=Remove course\n"
	 								+ "4=back");
	 						char3 = scan.next();
	 						
	 						switch(char3) 
	 						{
	 						
	 						case "1":
	 							removeStudent();
	 							break;
	 						case "2":
	 							removeInstructor();
	 							break;
	 						case "3":
	 							removeCourse();
	 							break;
	 						case "4":
	 							controlRemove = false;
	 							break;
	 						default:
		 						System.out.println("Lütfen geçerli karakter girin!!");
		 						continue;
	 						
	 						}
	 						
	 					}

/*2 END SECTION*/break;
	 			
/*3START SECTION*/case "3":
	 				controlUpdate = true;
	 				while(controlUpdate) 
	 				{
	 					
	 					System.out.println("1=Update student\n"
	 							+ "2=Update instructor\n"
	 							+ "3=Update course\n"
	 							+ "4=back");
	 					char4 = scan.next();
	 					switch(char4) 
	 					{
	 					case "1":
	 						updateStudent();
	 						break;
	 					case "2":
	 						updateInstructor();
	 						break;
	 					case "3":
	 						updateCourse();
	 						break;
	 					case "4":
	 						controlUpdate = false;
	 						break;
	 					default:
	 						System.out.println("Lütfen geçerli karakter girin!!");
	 						continue;
	 					
	 					}
	 					
	 					
	 				}

/*3 END SECTION*/break;
	 			
/*4START SECTION*/case "4":
	 				listProperty = true;
	 				while(listProperty) 
	 				{
	 					
	 					System.out.println("1=List student\n"
	 							+ "2=List instructor\n"
	 							+ "3=List course\n"
	 							+ "4=back");
	 					char5 = scan.next();
	 					switch(char5) 
	 					{
	 					case "1":
	 						listStudent();
	 				
	 						break;
	 					case "2":
	 						listInstructor();
	 						
	 						break;
	 					case "3":
	 						listCourse();
	 						
	 						break;
	 					case "4":
	 						listProperty = false;
	 						break;
	 					default:
	 						System.out.println("Lütfen geçerli karakter girin!!");
	 						continue;
	 					
	 					}
	 				
	 			
	 		}
	 				
/*4 END SECTION*/break;
	 			
/*5START SECTION*/case "5":
	 				controlList = true;
	 				
	 				while(controlList) 
	 				{
	 					System.out.println("1=List Id\n"
	 							+ "2=List Name\n"+
	 							"3 = back");
	 					char6 = scan.next();
	 					switch(char6) 
	 					{
	 						case "1":
	 							
	 							listId();
	 							
	 		
	 							break;
	 						
	 						case "2":
	 							listName();
	 							break;
	 						case "3":
	 							controlList = false
	 						;
	 						default:
		 						System.out.println("Lütfen geçerli karakter girin!!");
		 						continue;
	 					
	 					}
	 					
	 				}
	 			
/*5END SECTION*/break;
	 			
/*6START SECTION*/case "6":
	 				control =false;
	 				scan.close();
	 				System.out.println("BYE BYE !!!");

/*6END SECTION*/break;
	 				
	 			default:
						System.out.println("Lütfen geçerli karakter girin!!");
						continue;
	 				
	 		}
	 		
	 	}
	 	
		
	}
	
	/*----------------ADDING----------------*/
	
				
	private static void addStudent() {
		
		String studentId;
		String name;
		String surname;
		String birthday;
		String department;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id");
		studentId=scan.nextLine();
		
		System.out.println("name");
		name=scan.nextLine();
		
		System.out.println("surname");
		surname=scan.nextLine();
		
		System.out.println("birth");
		birthday=scan.nextLine();
		
		System.out.println("department");
		department=scan.nextLine();
		
		
		studentList.add(new Student(studentId,name,surname,birthday,department));
		
	}
			
	private static void addInstructor() {
		String academicId;
		String academicTitle;
		String name;
		String surname;
		String birthday;
		String department;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Academic Id:");
		academicId = scan.nextLine();
		
		System.out.println("Academic Title:");
		academicTitle=scan.nextLine();
		
		System.out.println("Name:");
		name=scan.nextLine();
		
		System.out.println("Surname:");
		surname=scan.nextLine();
		
		System.out.println("Birthday:");
		birthday=scan.nextLine();
		
		System.out.println("Department");
		department=scan.nextLine();
		
		
	
		instructorList.add( new Instructor(academicId,academicTitle,name,surname,birthday,department) );
		
	}
	
	private static void addCourse() {
		
		String courseId;
		String courseName;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Course Id:");
		courseId = scan.nextLine();
		
		System.out.println("Course Name:");
		courseName = scan.nextLine();
		
		courseList.add(new Course(courseId, courseName));
		
	}
	/*----------------UPDATE----------------*/
	
	private static void updateStudent() {
		String ID;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID:");
		ID = scan.nextLine();
	
		if(studentList.isEmpty()) {
			
			System.out.println("Null List");
		}
		
		else 
		{
			for (Student s:studentList) {
				
				if(ID.equals(s.getStudentId())) {
					
					String department;
					System.out.println("UPDATE DEPARTMENT"+" for "+s.getName()+" : ");
					department = scan.nextLine();
					s.setDepartment(department);
					
				}
			
			}
		}
	}
	
	private static void updateInstructor() {
		
		String ID;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID:");
		ID = scan.nextLine();
		
		if(instructorList.isEmpty()) {
			
			System.out.println("Null List");
			
		}
		else 
		{
			for(Instructor i:instructorList)
			{
				
				if(ID.equals(i.getAcademicId())) 
				
				{
				
					String academicTitle;
				
					String academicId;
				
					System.out.println("UPDATE ACADEMIC TITLE for "+i.getName());			
					academicTitle = scan.nextLine();
				
					i.setAcademicTitle(academicTitle);
					System.out.println("UPDATE ACADEMIC ID for "+i.getName());
				
					academicId = scan.nextLine();
					i.setAcademicId(academicId);
				
				}
				else
					System.out.println(ID+"Bulunamadı!!");
				
			}
		}
			
		
		
	}
	
	private static void updateCourse() {
		
		String ID;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID:");
		ID = scan.nextLine();
		
		if(courseList.isEmpty()) {
		
			System.out.println("Null List!!");
		}
		
		else 
		{
			for(Course c:courseList) {
				
				if(ID.equals(c.getCourseId())) {
					
					String courseName;
					
					System.out.println("UPDATE COURSE ID for "+c.getCourseName());
					courseName = scan.next();
					
					c.setCourseName(courseName);
				}
			
		}
		
		
	}
		
	}
	/*----------------LISTING----------------*/
	
	private static void listStudent() {
		
		System.out.println("\t\t\t\t\tSTUDENT");
		int i=0;
		iteStu = studentList.iterator();

			
			while(iteStu.hasNext()) {
				
				student = iteStu.next();
			
				System.out.println(
					(i+1)+"."+"\nName:"+student.getName()+"\n"
					+ "Surname:"+student.getSurname()+"\n"
					+ "Birthday:"+student.getBirthday()+"\n"
					+ "Department:"+student.getDepartment()+"\n\n");
						
			i++;
		}
		
		}
	
	
	private static void listInstructor() {
		int s=0;
		System.out.println("\t\t\t\t\tINSTRUCTOR");
		iteIns = instructorList.iterator();
		
		
		while(iteIns.hasNext()) {
			
			instructor = iteIns.next();
			
			System.out.println(
					
					(s+1)+"."
					+"\nAcademic Id:"+instructor.getAcademicId()+"\n"
					+"Academic Title:"+instructor.getAcademicTitle()+"\n"
					+"Name:"+instructor.getName()+"\n"
					+ "Surname:"+instructor.getSurname()+"\n"
					+ "Birthday:"+instructor.getBirthday()+"\n"
					+ "Department:"+instructor.getDepartment()+"\n"
											);
			s++;
		}
		
		}
		
		
	


	private static void listCourse() {
		int i =0;
		System.out.println("\t\t\t\t\tCOURSE");
		
		iteCou = courseList.iterator();
		
		
		while(iteCou.hasNext()) {	
			
			course = iteCou.next();
			
			System.out.println(
					(i+1)+"."
					+"\nCourse Id:"+course.getCourseId()+"\n"
					+ "Course Name:"+course.getCourseName()
							);
			i++;
		}
	}
	
	
	private static void removeStudent() {
		String remove;
		Scanner scan = new Scanner(System.in);
		System.out.println("id for remove:");
		remove = scan.nextLine();
		
		iteStu = studentList.iterator();
		
		
		while(iteStu.hasNext()) {
			student = iteStu.next();
			if(remove.equals(student.getStudentId())) {
				iteStu.remove();
				System.out.println(student.getName() +" "+ student.getSurname()+" başarıyla kaldırıldı!!");
			}
			
		}
		
	}

	private static void removeCourse() {
		String remove;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id for remove:");
		remove = scan.nextLine();
		
		
		iteCou = courseList.iterator();
		
		
		while(iteCou.hasNext()) {
			course= iteCou.next();
			if(remove.equals(course.getCourseId())) {
				iteCou.remove();
				System.out.println(course.getCourseName() +" başarıyla kaldırıldı!!");
			
			}
		}
		
	}

	private static void removeInstructor() {
		
		String remove;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id for remove:");
		remove = scan.nextLine();
		
		iteIns = instructorList.iterator();
		
		
		while(iteIns.hasNext()) {
			instructor= iteIns.next();
			if(remove.equals(instructor.getAcademicId())) {
				iteIns.remove();
				System.out.println(instructor.getName() +" "+ instructor.getSurname()+" başarıyla kaldırıldı!!");
			}
			
		}
		
	}
	
	private static void listId() {
		
		ite();
		
		while(iteIns.hasNext() || iteStu.hasNext() || iteCou.hasNext()) {
			
			System.out.println("Instructor Id:"+iteIns.next().getAcademicId()+"\n"+
			"Student Id:"+iteStu.next().getStudentId()+"\n"+
				"Course Id"+	iteCou.next().getCourseId()
					);
			
			
		}
		
		
	}
	
	private static void listName() {
		
		ite();
		
		while(iteIns.hasNext() || iteStu.hasNext() || iteCou.hasNext()) {
			
			System.out.println("Instructor Name:"+iteIns.next().getName()+"\n"+
			"Student Name:"+iteStu.next().getName()+"\n"+
				"Course Name:"+	iteCou.next().getCourseName()
					);
			
			
		}
		
		
	}
	
	static void ite() {
		iteIns = instructorList.iterator();
		iteStu = studentList.iterator();
		iteCou = courseList.iterator();
		
	}

}
