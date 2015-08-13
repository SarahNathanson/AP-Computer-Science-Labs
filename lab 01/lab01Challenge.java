import java.util.Scanner;
import java.io.*;

public class lab01Challenge {
	public static void main(String args[]){
		//take in 4 chars
		Scanner scanner=new Scanner(System.in);
		System.out.print("Where is your file? ");
		String inputfile=scanner.nextLine();
		System.out.print("Give a letter: ");
		char char1= scanner.next().charAt(0);
		System.out.print("Give a letter: ");
		char char2= scanner.next().charAt(0);
		System.out.print("Give a letter: ");
		char char3= scanner.next().charAt(0);
		System.out.print("Give a letter: ");
		char char4= scanner.next().charAt(0);
		
		//Read from file
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(inputfile));
			String a="";
			for(int i=1;i<=5;i++){
				a+= br.readLine();
			}
			String b="";
			for(int i=1;i<=5;i++){
				b+= br.readLine();
			}
			String c="";
			for(int i=1;i<=5;i++){
				c+= br.readLine();
			}
			
			for(int i=1;i<=5;i++){
				//char1
				if (char1=='A'){
					System.out.print(a.substring(10*(i-1), 10*(i-1)+10));
				}
				else if (char1=='B'){
					System.out.print(b.substring(10*(i-1), 10*(i-1)+10));
				}
				else{
					System.out.print(c.substring(10*(i-1), 10*(i-1)+10));
				}
				
				//char2
				if (char2=='A'){
					System.out.print(a.substring(10*(i-1), 10*(i-1)+10));
				}
				else if (char2=='B'){
					System.out.print(b.substring(10*(i-1), 10*(i-1)+10));
				}
				else{
					System.out.print(c.substring(10*(i-1), 10*(i-1)+10));
				}
				
				//char3
				if (char3=='A'){
					System.out.print(a.substring(10*(i-1), 10*(i-1)+10));
				}
				else if (char3=='B'){
					System.out.print(b.substring(10*(i-1), 10*(i-1)+10));
				}
				else{
					System.out.print(c.substring(10*(i-1), 10*(i-1)+10));
				}
				
				//char4
				if (char4=='A'){
					System.out.print(a.substring(10*(i-1), 10*(i-1)+10));
				}
				else if (char4=='B'){
					System.out.print(b.substring(10*(i-1), 10*(i-1)+10));
				}
				else{
					System.out.print(c.substring(10*(i-1), 10*(i-1)+10));
				}
				
				System.out.println();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		scanner.close();
	}

}
