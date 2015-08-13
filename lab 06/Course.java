public class Course {
	private String courseTitle;
	private String teacher;
	private Student[] enrolledStudents;
	private Grade[] Grades;		// Must correspond 1-1 with enrolledStudents.
	private boolean honors;

	public Course(String Teacher, String title, boolean honors){
		teacher=Teacher;
		courseTitle=title;
		this.honors=honors;
		enrolledStudents=new Student[20];
		Grades= new Grade[20];
	}
	public String getTitle(){
		return courseTitle;
	}
	public String getTeacher(){
		return teacher;
	}
	public Grade getGrade(Student someStudent){
		for(int i=0;i<enrolledStudents.length;i++){
			if(enrolledStudents[i]==someStudent){
				return Grades[i];
			}
		}
		return null;
	}
	public int numberEnrolled(){
		int counter=0;
		for(int i=0;i<enrolledStudents.length;i++){
			if(enrolledStudents[i]!=null){
				counter++;
			}
		}
		return counter;
	}
	public Student[] enrolledStudents(){
		return enrolledStudents;
	}
	// Returns Student with specified class rank
	public Student topStudent(){
		Student top=null;
		for(int i=0;i<enrolledStudents.length;i++){
			if(enrolledStudents[i] != null){
				if(top==null || enrolledStudents[i].compareTo(top)>0){
					top=enrolledStudents[i];
				}
			}
		}
		return top;
	}

	public void setGrade(Student someStudent, double Grade){
		for(int i=0;i<enrolledStudents.length;i++){
			if(enrolledStudents[i]==someStudent){
				Grades[i].setGrade(Grade);
			}
		}
	}
	/* Enrolls Student and returns true if successful.
	* Returns false if: course would give Student more than 10 classes, student is already 
	* enrolled, or if enrollment would cause more than 20 students to be in the course.
	*/
	public boolean enroll(Student someStudent){
		for(int i=0;i<20;i++){
			if(enrolledStudents[i]==null){
				if(someStudent.addCourse(this)==true){
					enrolledStudents[i]=someStudent;
					Grades[i]=new Grade(honors, false);
					return true;
				}
				return false;
			}
		}
		return false;
	}
	public void unenroll(Student someStudent){
		for(int i=0;i<20;i++){
			if(enrolledStudents[i]==someStudent){
				someStudent.dropCourse(this);
				enrolledStudents[i]=null;
				Grades[i]=null;
				break;
			}
		}
	}

}
