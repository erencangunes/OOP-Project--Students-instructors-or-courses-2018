package proje;

public class Student {
	
	String studentId;
	String name;
	String surname;
	String birthday;
	String department;
	
	public Student(String studentId,String name,String surname,String birthday,String department) {
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
		this.birthday = birthday;
		this.department = department;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void setSurname(String surname) {
		this.surname = surname;
		
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
		
	}
	public void setDepartment(String department) {
		this.department = department;
		
	}

	public String getStudentId() {
		
		return studentId;
		
	}
	public String getName() {
		
		return name;
		
	}
	public String getSurname() {
	
	return surname;
	
}
	public String getBirthday() {
	
	return birthday;
	
}
	public String getDepartment() {
	
	return department;
	
}
}
