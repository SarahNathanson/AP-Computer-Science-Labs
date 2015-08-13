import java.util.Scanner;
public class lab01bInitials {
	public static void main (String arg[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char char1=scanner.next().charAt(0);
		System.out.print("Enter a character: ");
		char char2=scanner.next().charAt(0);
		System.out.print("Enter a character: ");
		char char3=scanner.next().charAt(0);
		System.out.print("  "+char1+char1+char1+char1+char1+"     "+char2+char2+char2+"  "+char3+char3+char3+"  "+char3+char3+char3
				+"\n "+char1+"     "+char1+"   "+char2+char2+"  "+char2+" "+char3+"  "+char3+" "+char3+" "+char3
				+"\n  "+char1+char1+"         "+char2+" "+char2+" "+char3+"   "+char3+char3+" "+char3 
				+"\n    "+char1+char1+"       "+char2+" "+char2+" "+char3+" "+char3+char3+"   "+char3
				+"\n "+char1+"    "+char1+"  "+char2+char2+" "+char2+char2+" "+char2+" "+char3+" "+char3+" "+char3+"  "+char3
				+"\n "+char1+char1+char1+char1+char1+"   "+char2+char2+char2+char2+char2+char2+"  "+char3+char3+char3+"  "+char3+char3+char3
				);
		scanner.close();
	}
}
