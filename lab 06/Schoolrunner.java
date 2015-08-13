public class Schoolrunner {
	public static void main(String args[]){
		//format of output is received response, expected response
		int tests=0;
		boolean temp=false;
		//Grade
		Grade grade = new Grade(false,false);
		System.out.println(grade.getGrade() + ", 0.0");//should print 0
		if(grade.getGrade()==0.0){
			tests++;
		}
		grade.setGrade(28);
		System.out.println(grade.getGrade() + ", 28.0");//should print 28
		if(grade.getGrade()==28.0){
			tests++;
		}
		System.out.println(grade.audited()+", false");//false
		if(grade.audited()==false){
			tests++;
		}
		grade.setAudit(true);
		System.out.println(grade.audited()+", true");//true
		if(grade.audited()==true){
			tests++;
		}
		Grade gradehonors = new Grade(true,false, 88.92);
		System.out.println(gradehonors.honors()+", true"); //should print true
		if(gradehonors.honors()==true){
			tests++;
		}
		System.out.println(gradehonors.getGrade()+", 93.366"); //should print 93.366
		if(gradehonors.getGrade()==93.366){
			tests++;
		}
		Grade outofrange = new Grade(false,false,488.92);
		System.out.println(outofrange.getGrade()+", 100.0");//Should print 100
		if(outofrange.getGrade()==100.0){
			tests++;
		}
		
		//School
		School school=new School("BCA");
		
		//Student
		Student student = new Student("Sarah Nathanson",2017, school);
		Student student2 = new Student("Juliann Barbella",2017, school);
		Student student3 = new Student("Rikako Onuma", 2017, school);
		System.out.println(student.getName()+", Sarah Nathanson"); //Sarah Nathanson
		if(student.getName()=="Sarah Nathanson"){
			tests++;
		}
		System.out.println(student.getGradYear()+", 2017"); //2017
		if(student.getGradYear()==2017){
			tests++;
		}
		System.out.println(student.getAcademy()+", school object"); //returns school object
		if(student.getAcademy() instanceof School){
			tests++;
		}
		
		
		//Course
		Course spanish = new Course("Calandra","Spanish",false);
		Course biology = new Course("Zhang","Biology", true);
		System.out.println(spanish.getTitle()+", Spanish");//Spanish
		if(spanish.getTitle()=="Spanish"){
			tests++;
		}
		System.out.println(spanish.getTeacher()+", Calandra");//Calandra
		if(spanish.getTeacher()=="Calandra"){
			tests++;
		}
		temp=spanish.enroll(student);
		System.out.println(temp+", true");
		if(temp=true){
			tests++;
		}
		
		temp=biology.enroll(student);
		System.out.println(temp+", true");
		if(temp=true){
			tests++;
		}
		
		temp=spanish.enroll(student2);
		System.out.println(temp+", true");
		if(temp=true){
			tests++;
		}
		
		temp=spanish.enroll(student3);
		System.out.println(temp+", true");
		if(temp=true){
			tests++;
		}
		
		System.out.println(spanish.numberEnrolled()+", 3"); //3
		if(spanish.numberEnrolled()==3){
			tests++;
		}
		System.out.println(spanish.enrolledStudents()+", array of student objects"); //array of student objects
		if(spanish.enrolledStudents()[0] instanceof Student){
			tests++;
		}
		spanish.unenroll(student3);
		System.out.println(spanish.numberEnrolled()+", 2"); //2
		if(spanish.numberEnrolled()==2){
			tests++;
		}
		spanish.setGrade(student,98.5);
		System.out.println(spanish.getGrade(student).getGrade()+", 98.5");//98.5
		if(spanish.getGrade(student).getGrade()==98.5){
			tests++;
		}
		
		
		//More student
		temp=student.addCourse(spanish);
		System.out.println(temp+", true");
		if(temp=true){
			tests++;
		}
		System.out.println(student.getSchedule()+", array of courses");
		System.out.println("Test: "+student.getSchedule()[0]);
		if(student.getSchedule()[0] instanceof Course||student.getSchedule()[0]==null){
			tests++;
		}
		System.out.println(student.getGPA()+", 49.25");
		if(student.getGPA()==49.25){
			tests++;
		}
		
		temp=student.dropCourse(spanish);
		System.out.println(temp+", true");
		if(temp=true){
			tests++;
		}
		
		//More school
		System.out.println(school.getName()+", BCA");
		if(school.getName()=="BCA"){
			tests++;
		}
		school.setName("BA");
		System.out.println(school.getName()+", BA");//BA
		if(school.getName()=="BA"){
			tests++;
		}
		school.addStudent(student);
		school.addStudent(student2);
		school.addStudent(student3);
		System.out.println(school.enrolledStudents()+", 3");
		if(school.enrolledStudents()==3){
			tests++;
		}
		school.unenrollStudent(student3);
		System.out.println(school.enrolledStudents()+ ", 2");
		if(school.enrolledStudents()==2){
			tests++;
		}
		//Course temp= new Course("Golf", "Ralf Plotrich", false);
		System.out.println(school.getCourses()+ ", array of course objects");
		System.out.println("Test: "+school.getCourses()[0]);
		if(school.getCourses()[0] instanceof Course||school.getCourses()[0]==null){
			tests++;
		}
		school.createClass("Golf", "Ralf Plotrich", false);
		temp=school.enroll(student, school.getCourses()[0]);
		System.out.println(temp+", true");
		if(temp=true){
			tests++;
		}
		temp=school.unenroll(student, school.getCourses()[0]);
		System.out.println(temp+", true");
		if(temp=true){
			tests++;
		}

		System.out.println("Test cases correct: "+tests+"/31");
	}
}
