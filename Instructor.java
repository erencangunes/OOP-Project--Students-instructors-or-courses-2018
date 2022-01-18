package proje;

public class Instructor {
	
	  	String academicTitle;
	    String name;
	    String surname;
	    String birthday;
	    String department;
	    String academicId;
	    public Instructor(String academicId,String academicTitle,String name,String surname,String birthday,String department) {
	    	 this.academicTitle = academicTitle;
	    	 this.name = name;
	    	 this.surname = surname;
	    	 this.birthday = birthday;
	    	 this.department = department;
	    	 this.academicId = academicId;
	    }
	    
	    public void setAcademicTitle(String academicTitle) {
	        this.academicTitle = academicTitle;
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
	    public void setAcademicId(String academicId) {
	    	this.academicId = academicId;
	    }
	    public String getAcademicTitle(){
	        return academicTitle;
	}
	    public String getName(){
	        return name;
	}
	     public String getSurname(){
	        return surname;
	}
	    public String getBirthday(){
	        return birthday;
	}
	  public String getDepartment(){
	          return department;
	}
	  public String getAcademicId() {
		  return academicId;
	  }


}
