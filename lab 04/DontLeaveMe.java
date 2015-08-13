import java.util.*;
public class DontLeaveMe {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		String phrase="";
		while (true){
			System.out.print("What should I say? ");
			phrase=input.nextLine();
			if(phrase.equalsIgnoreCase("Exit")){
				break;
			}
			System.out.println(phrase+"\n");
		}
		System.out.print("Exiting...");
		input.close();
	}
		
}
