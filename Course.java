package proje;

public class Course {

	String courseId;
	String courseName;
	
	public Course(String courseId,String courseName) {
		
		this.courseId = courseId;
		this.courseName = courseName;
		
	}
	
	public void setCourseId(String courseId) {
		
		this.courseId = courseId;
		
	}
	public void setCourseName(String courseName) {
		
		this.courseName = courseName;
		
	}
	
	public String getCourseId() {
		
		return courseId;
		
	} 
	
	public String getCourseName() {
		return courseName;
	}
	
}
