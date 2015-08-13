public class EncryptionV2 {
	public String encrypt(int key, String text){
		String newtext="";
		int letter=0;
		for(int i=0;i<text.length();i++){
			key+=letter;
			newtext+=(char)((((text.charAt(i)) + (key) - 32) % 95) + 32);
			letter=text.charAt(i);
			//System.out.println((char)letter+" "+letter+" " + (char)((((text.charAt(i)) + (key) - 65) % 26) + 65) + " " + ((((text.charAt(i)) + (key) - 65) % 26) + 65)+" " + key);
		}
		return newtext;
	}
	
	public String decrypt(int key, String text){
		//System.out.println(((-52 % 26)));
		String newtext="";
		int letter=0;
		for(int i=0;i<text.length();i++){
			letter=(text.charAt(i) - key - 32) % 95;
			if ((text.charAt(i) - key - 32) < 0 && ((text.charAt(i) - key - 32)% 95 != 0.0)){
				if(text.charAt(i)=='A'){
					System.out.println("TEST");
				}
				letter+=95;
			}
			letter+=32;
			newtext+=(char)letter;
			key+=letter;
			//System.out.println(text.charAt(i)+" "+(int)text.charAt(i)+" " + (char)letter + " " + letter+" " + key);
		}
		return newtext;
	}
}
