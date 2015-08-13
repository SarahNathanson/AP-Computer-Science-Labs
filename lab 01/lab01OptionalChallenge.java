import java.util.Scanner;
import java.io.*;

public class lab01OptionalChallenge {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		//take in file names
		System.out.print("Where is the input file? ");
		String inputfile=scanner.nextLine();
		System.out.print("Where is the output file? ");
		String file=scanner.nextLine();
		
		//take in 4 chars
		System.out.print("Enter A, B, C: ");
		char char1= scanner.next().charAt(0);
		System.out.print("Enter A, B, C: ");
		char char2= scanner.next().charAt(0);
		System.out.print("Enter A, B, C: ");
		char char3= scanner.next().charAt(0);
		System.out.print("Enter A, B, or C: ");
		char char4= scanner.next().charAt(0);
		
		//Read from file
		BufferedReader br = null;
		BufferedWriter writer = null;
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
			
			try {
				writer = new BufferedWriter(new FileWriter(file, true));
			} catch (IOException ex) {
			  // report
			} 
			
			for(int i=1;i<=5;i++){
				//char1
				if (char1=='A'){
					writer.write(a.substring(10*(i-1), 10*(i-1)+10));
				}
				else if (char1=='B'){
					writer.write(b.substring(10*(i-1), 10*(i-1)+10));
				}
				else{
					writer.write(c.substring(10*(i-1), 10*(i-1)+10));
				}
				
				//char2
				if (char2=='A'){
					writer.write(a.substring(10*(i-1), 10*(i-1)+10));
				}
				else if (char2=='B'){
					writer.write(b.substring(10*(i-1), 10*(i-1)+10));
				}
				else{
					writer.write(c.substring(10*(i-1), 10*(i-1)+10));
				}
				
				//char3
				if (char3=='A'){
					writer.write(a.substring(10*(i-1), 10*(i-1)+10));
				}
				else if (char3=='B'){
					writer.write(b.substring(10*(i-1), 10*(i-1)+10));
				}
				else{
					writer.write(c.substring(10*(i-1), 10*(i-1)+10));
				}
				
				//char4
				if (char4=='A'){
					writer.write(a.substring(10*(i-1), 10*(i-1)+10));
				}
				else if (char4=='B'){
					writer.write(b.substring(10*(i-1), 10*(i-1)+10));
				}
				else{
					writer.write(c.substring(10*(i-1), 10*(i-1)+10));
				}
				
				writer.newLine();
			}
			writer.close();
			
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