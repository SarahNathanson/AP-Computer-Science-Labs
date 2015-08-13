public class TwelveDays {
	
	public static void main(String args[]){
		
	}
	
	public String singThatSong(){
		String song="";
		String[] numbers={"twelveth","eleventh","tenth","ninth","eigth", "seventh",
						 "sixth" , "fifth" , "fourth" , "third" , "second" , "first"};
		for(int day=12;day>=1;day--){
			song+=day!=12?"\n\n":"";
			song+=String.format("On the %s day of high school, my teacher gave to me", numbers[day-1]);
			switch(day){
				case 1:song+= "\nTwelve lunch detentions";
				case 2:song+= "\nEleven vocab lists";
				case 3:song+= "\nTen Practice Problems";
				case 4:song+= "\nNine performance skits";
				case 5:song+= "\nEight examinations";
				case 6:song+= "\nSeven lab reports";
				case 7:song+= "\nSix chapters' reading";
				case 8:song+= "\nFive Shakespeare plays!";
				case 9:song+= "\nFour hundred emails";
				case 10:song+= "\nThree rough drafts";
				case 11:song+= "\nTwo problem sets";
				default:song+= "\nAnd a lecture about my workload.";
					break;
				case 12:song+= "\nA lecture about my workload.";
					break;
			}
		}
		return song;
	}
}
