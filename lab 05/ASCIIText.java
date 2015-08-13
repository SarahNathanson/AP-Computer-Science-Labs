import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ASCIIText {
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.print("What font would you like: ");
		String inputfile=scanner.nextLine();
		System.out.print("Text to print: ");
		String message= scanner.nextLine();
		
		//Read from file
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(inputfile));
			
			//read 3 lines of comments
			for(int i=0;i<3;i++){
				br.readLine();
			}
			
			//create array of font numbers
			String[][] numbers = new String[10][6];
			for(int i=0;i<10;i++){
				br.readLine(); //read blank line before letter
				for(int j=0; j<6;j++){
					numbers[i][j]= br.readLine();
				}
			}
			
			
			//create array of lowercase letters
			String[][] lowercase = new String[26][6];
			for(int i=0;i<26;i++){
				br.readLine(); //read blank line before letter
				for(int j=0; j<6;j++){
					lowercase[i][j]= br.readLine();
				}
			}
			
			//create array of uppercase letters
			String[][] uppercase = new String[26][6];
			for(int i=0;i<26;i++){
				br.readLine(); //read blank line before letter
				for(int j=0; j<6;j++){
					uppercase[i][j]= br.readLine();
				}
			}
			
			//create array of punctuation marks
			String[][] punctuation = new String[7][6];
			for(int i=0;i<7;i++){
				br.readLine(); //read blank line before letter
				for(int j=0; j<6;j++){
					punctuation[i][j]= br.readLine();
				}
			}
			
			//creates array of characters in message
			String[][] meslets = new String[message.length()][];
			for(int i=0;i<message.length();i++){
				
				//numbers
				if(Character.isDigit(message.charAt(i))){
					meslets[i]=numbers[message.charAt(i)];
				}
				
				//stupid punctuation characters
				//how to do this better?
				else if(message.charAt(i)==','){
					meslets[i]=punctuation[0];
				}
				else if(message.charAt(i)=='.'){
					meslets[i]=punctuation[1];
				}
				else if(message.charAt(i)=='?'){
					meslets[i]=punctuation[2];
				}
				else if(message.charAt(i)=='!'){
					meslets[i]=punctuation[3];
				}
				else if(message.charAt(i)=='\''){
					meslets[i]=punctuation[4];
				}	
				else if(message.charAt(i)=='\"'){
					meslets[i]=punctuation[5];
				}
				else if(message.charAt(i)==' '){
					meslets[i]=punctuation[6];
				}
				
				//lowercase
				else if(message.substring(i,i+1).toLowerCase().equals(message.substring(i,i+1))){
					meslets[i]=lowercase[message.charAt(i)-97];
				}
				
				//uppercase
				else{
					meslets[i]=uppercase[message.charAt(i)-65];
				}
			}
			
			
			//prints message
			for(int i=0;i<6;i++){
				for(int j=0; j<message.length(); j++){
					System.out.print(meslets[j][i]);
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
