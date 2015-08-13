import java.util.Scanner;

public class lab01aRepeatRepeatParrot {
	public static void main(String arg[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("What should I say? ");
		String message=scanner.nextLine();
		System.out.print("\nHow many times should I say it? ");
		int times=scanner.nextInt();
		if (times>=1 && times<=8){
			for(int i=0;i<times;i++){
				System.out.println(message);
			}
		}
		scanner.close();
		
	}
}
