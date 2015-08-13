import java.util.Arrays;

public class School {
	String Name;
	Student[] enrolledStudents;//max 300
	Course[] schoolCourses;//max 300

	public School(String Name){
		this.Name=Name;
		enrolledStudents=new Student[300];
		schoolCourses=new Course[300];
	}
	// Returns name of school
	public String getName(){
		return Name;
	}
	
	public Course[] getCourses(){
		return schoolCourses;
	}
	
	// Returns number of enrolled students
	public int enrolledStudents(){
		int counter=0;
		for(int i=0;i<300;i++){
			if(enrolledStudents[i]!=null){
				counter++;
			}
		}
		return counter;
	}
	// returns Student with specified class rank
	public Student kidWithClassRank(int rank){
		Arrays.sort(enrolledStudents);
		return enrolledStudents[rank-1];
	}

	public void addStudent(Student someKid){
		for(int i=0;i<300;i++){
			if(enrolledStudents[i]==null){
				enrolledStudents[i]=someKid;
				break;
			}
		}
	}
	public void unenrollStudent(Student someKid){
		for(int i=0;i<300;i++){
			if(enrolledStudents[i]==someKid){
				enrolledStudents[i]=null;
				break;
			}
		}
	}

	public void createClass(String Teacher, String title, boolean honors){
		for(int i=0;i<300;i++){
			if(schoolCourses[i]==null){
				schoolCourses[i]=new Course(Teacher, title, honors);
				break;
			}
		}
	}
	public void setName(String name){
		this.Name=name;
	}
	/* Enrolls Student in Course and returns true if successful.
	* Returns false if: Course not in school, Course would have more than 20 students, or 
	* Student would have more than 10 Courses.
	 */
	public boolean enroll (Student kid, Course someCourse){
		//int studentindex=-1;
		int courseindex=-1;
		for(int i=0;i<300;i++){
			/*if(enrolledStudents[i]==kid){
				studentindex=i;
			}*/
			if(schoolCourses[i]==someCourse){
				courseindex=i;
			}
		}
		if(/*studentindex==-1 ||*/ courseindex==-1){
			return false;
		}
		return schoolCourses[courseindex].enroll(kid);
	}
	/* Unenrolls Student in Course and returns true if successful.
	* Returns false if: Course not in school, or Student not in Course.
	 */
	public boolean unenroll (Student kid, Course someCourse){
		//int studentindex=-1;
		int courseindex=-1;
		for(int i=0;i<300;i++){
			/*if(enrolledStudents[i]==kid){
				studentindex=i;
			}*/
			if(schoolCourses[i]==someCourse){
				courseindex=i;
			}
		}
		if(/*studentindex==-1 ||*/ courseindex==-1){
			return false;
		}
		schoolCourses[courseindex].unenroll(kid);
		return true;
	}

}
