public class CalendarPrinter {
	public static void main(String args[]) {
		
	}

	public void printMonth(int year, int month, int janFirst, boolean leapYear) {
		int[] monthdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] months = { "January", "February", "March", "April", "May",
				"June", "July", "August", "Septemeber", "October", "November",
				"December" };
		if (leapYear == true) {
			monthdays[1] = 29;
		}

		int dayofweek = janFirst; // day of week month starts on
		for (int i = 0; i < (month - 1); i++) {
			dayofweek += monthdays[i] + 1;

		}
		dayofweek %= 6;

		// 20 chars across

		// print spaces to center
		for (int i = 0; i < (20 - (months[month - 1] + " " + year).length()) / 2; i++) {
			System.out.print(" ");
		}
		System.out.println(months[month - 1] + " " + year);// print month and
															// year
		System.out.println("Su Mo Tu We Th Fr Sa");// print days of week

		for (int i = 0; i < dayofweek; i++) {// spaces for not starting on
												// sunday
			System.out.print("   ");
		}

		for (int i = 1; i <= monthdays[month - 1]; i++) {
			if (i < 10) {
				System.out.print(" ");
			}
			System.out.print(i);
			if (dayofweek == 6) {
				System.out.println();
				dayofweek = -1;
			}
			dayofweek++;
			if (dayofweek != 0) {
				System.out.print(" ");
			}
		}
	}

	public void printYear(int year, int janFirst, boolean leapYear) {
		int[] monthdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] months = { "January", "February", "March", "April", "May",
				"June", "July", "August", "Septemeber", "October", "November",
				"December" };
		String[][] monthformatting = new String[12][8];
		for(int i=0;i<12;i++){
			for(int j=0; j<8;j++){
				monthformatting[i][j]="";
			}
		}
		int linenumber;
		if (leapYear == true) {
			monthdays[1] = 29;
		}

		int dayofweek = janFirst; // day of week month starts on
		
		for (int i = 0; i < (66-Integer.toString(year).length()) / 2; i++) {
			System.out.print(" ");
		}
		System.out.println(year+"\n");
		
		
		for (int month = 1; month <= 12; month++) {
			linenumber=0;
			// print spaces to center
			for (int i = 0; i < (20 - (months[month - 1]).length()) / 2; i++) {
				monthformatting[month-1][linenumber]+=" ";
			}
			monthformatting[month-1][linenumber]+=months[month - 1];// print month
			linenumber++;
			monthformatting[month-1][linenumber]+="Su Mo Tu We Th Fr Sa";// print days of week
			linenumber++;
			
			for (int i = 0; i < dayofweek; i++) {// spaces for not starting on
													// sunday
				monthformatting[month-1][linenumber]+="   ";
			}

			for (int i = 1; i <= monthdays[month - 1]; i++) {//i is the day
				if(month==2 && dayofweek==1 && i>=15 && i<=21){
					monthformatting[month-1][linenumber]+="*p";
				}
				else if(month==11 && i==11){
					monthformatting[month-1][linenumber]+="*v";
				}
				else if(month==11 && dayofweek==4 && i>=22 && i<=28){
					monthformatting[month-1][linenumber]+="*t";
				}
				else if(month==5 && dayofweek==1 && i>=24 && i<=30){
					monthformatting[month-1][linenumber]+="*m";
				}
				else if(month==12 && i==25){
					monthformatting[month-1][linenumber]+="*c";
				}
				else if(month==1 && i==1){
					monthformatting[month-1][linenumber]+="*y";
				}
				else if(month==7 && i==4){
					monthformatting[month-1][linenumber]+="*4";
				}
				else if(month==9 && dayofweek==1 && i>=2 && i<=8){
					monthformatting[month-1][linenumber]+="*L";
				}
				else if(month==4 && ((dayofweek!=0 && dayofweek!=6 && i==15)|| (dayofweek!=0 && dayofweek==1 && (i==16 || i==17)))){
					monthformatting[month-1][linenumber]+="*x";
				}
				else{
					if (i < 10) {
						monthformatting[month-1][linenumber]+=" ";
					}
					monthformatting[month-1][linenumber]+=i;//print day
				}
				
				if (dayofweek == 6) {
					linenumber++;
					dayofweek = -1;
				}
				dayofweek++;
				if (dayofweek != 0) {
					monthformatting[month-1][linenumber]+=" ";
				}
			}
		}
		for(int i=0;i<12;i++){
			while(monthformatting[i][6].length()<20){
				monthformatting[i][6]+=" ";
				
			}
			while(monthformatting[i][7].length()<20){
				monthformatting[i][7]+=" ";
				
			}
			while(monthformatting[i][0].length()<20){
				monthformatting[i][0]+=" ";
				
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<8;j++){
				System.out.print(monthformatting[(i*3)][j]);
				System.out.print("   ");
				System.out.print(monthformatting[1+(i*3)][j]);
				System.out.print("   ");
				System.out.print(monthformatting[2+(i*3)][j]);
				System.out.println("   ");
			}
		}
	}
}
