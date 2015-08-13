public class Scrambler {
	public static void main(String args[]){
		
	}
	
	public String scramble(int addBy, int numTimes, String scrambleThis){
		String scrambled="";
		int i=0,j=0;
		while(j<numTimes*addBy){
			if (i >= scrambleThis.split(" ").length){
				i-=scrambleThis.split(" ").length;
			}
			scrambled +=scrambleThis.split(" ")[i]+" ";
			i+=addBy;
			j+=addBy;
		}
		return scrambled;
	}
}
