package schoolManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class School{
	
	private String name;
	private List<Teacher> teachersList;
    private List<Student> studentsList;
    

//	public School(String name) {
//		super();
//		this.setName (name);
//		this.setTeachersList(new ArrayList<>());
//		this.setStudentsList(new ArrayList<>());
//	}
    
	public School(String name) {
	super();
	this.name = name;
	this.teachersList = new ArrayList<>();
	this.studentsList = new ArrayList<>();
}
	

	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Teacher> getTeachersList() {
		return teachersList;
	}


	public void setTeachersList(List<Teacher> teachersList) {
		this.teachersList = teachersList;
	}


	public List<Student> getStudentsList() {
		return studentsList;
	}


	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}


	public void addTeacher(Teacher teacher) {
		teachersList.add(teacher);
	    }

	    public void addStudent(Student student) {
	       studentsList.add(student);
	    }

	public Teacher getTeacherInformation(String teacherName)
	   {
	      for(Teacher teacherName1: teachersList)
	      {
	    	  if(teacherName1.name.equals(teacherName))
	    	  {
	    		  return teacherName1;
	    	  }
	      }
	      return null;
	   }
}



