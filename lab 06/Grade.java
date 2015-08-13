public class Grade {
	private double grade;
	private boolean audit;
	private boolean honors;

	// Basic constructor
	public Grade(boolean honors, boolean audited) {
		this.honors= honors;
		audit= audited;
		grade=0; //default grade?
	}

	// If the grade provided is out of range, the closest in-range grade is
	// entered
	public Grade(boolean honors, boolean audited, double grade) {
		this.honors= honors;
		audit= audited;
		if (grade>100){
			this.grade=100;
		}
		else if(grade<0){
			this.grade=0;
		}
		else{
			this.grade=grade;
		}

	}

	// Returns the grade. If this is an honors grade, the grade is raised by 5%
	// (max 105.0)
	public double getGrade() {
		if(honors){
			return grade*1.05;
		}
		return grade;
	}

	public boolean honors() {
		return honors;
	}

	public boolean audited() {
		return audit;
	}

	// Sets the Grade to a number between 0.0 and 100.0, inclusive.
	public void setGrade(double grade) {
		if (grade>100){
			this.grade=100;
		}
		else if(grade<0){
			this.grade=0;
		}
		else{
			this.grade=grade;
		}
	}

	public void setAudit(boolean audit) {
		this.audit=audit;
	}

}
