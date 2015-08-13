public class Student implements Comparable<Student>{
	/* When you declare the Student class, declare it as:
	*	public class Student extends Comparable{
	* This is your promise to include the compareTo() method.
	*/ 
	private String Name;
	private int gradYear;
	private School Academy;
	private Course[] schedule; // Contains no more than ten courses. //should it be private??

	public Student (String name, int gradYear, School  Academy){
		this.Name=name;
		this.gradYear=gradYear;
		this.Academy=Academy;
		schedule=new Course[10];
	}
	public String getName(){
		return Name;
	}
	public int getGradYear(){
		return gradYear;
	}
	public School getAcademy(){
		return Academy;
	}
	public Course[] getSchedule(){
		return schedule;
	}
	// Calculates GPA as average of classes
	public double getGPA(){
		double gpa=0;
		int counter=0;
		for(int i=0;i<schedule.length;i++){
			if(schedule[i] != null){
				if(!schedule[i].getGrade(this).audited()){
					gpa += schedule[i].getGrade(this).getGrade();
					counter++;
				}
			}
		}
		return gpa/counter;
	}
	// Returns compareTo value for the GPAs of the two students
	public int compareTo(Student someOtherKid){
		return (int)(this.getGPA() - someOtherKid.getGPA());
		//will return a negative, positive, or zero value
		//negative if this.getGPA < someOtherKid.getGPA()
		//positive if this.getGPA > someOtherKid.getGPA()
		//zero if this.getGPA == someOtherKid.getGPA()
		
	}

	/* Adds course and returns true if successful.
	* Returns false if: course would brings classes to more than 
	* 10, or student is already enrolled. */
	public boolean addCourse(Course someCourse){
		int index=-1;
		for(int i=0;i<10;i++){
			if(schedule[i]==null){
				index=i;	
			}
			if(schedule[i]==someCourse){
				return false;
			}
		}
		if(index==-1){
			return false;
		}
		schedule[index]=someCourse;
		return true;
	}
	/* Removes course and returns true if successful.
	* Returns false if: course was not on student’s schedule.
	*/
	public boolean dropCourse(Course someCourse){
		for(int i=0;i<10;i++){
			if(schedule[i]==someCourse){
				schedule[i]=null;
				return true;
			}
		}
		return false;
	}


}
