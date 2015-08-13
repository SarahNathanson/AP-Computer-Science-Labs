import java.util.Random;

public class MathBook extends Book{
	private int temp;
	public MathBook(){
		//use rule for naming type of book
		Random rn = new Random();
		//rn.nextInt(max - min + 1) + min;
		temp=(rn.nextInt(100 - 1 + 1) + 1);
		if(Math.random()<=0.5){
			title=temp+" squared is "+(temp*temp);
		}
		else{
			title="The square root of "+temp+" is " +((int)(Math.sqrt(temp)*1000+0.5)/1000.0);
		}
		
	}
}
