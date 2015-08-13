//import java.util.*;

public class DiscountCalc {
	public static void main (String args[]){	
	}
	public double calculateTheDiscount(int numOfItems, double cost){
		if (numOfItems>=6 && numOfItems<=10){
			return ((int)((100*(cost*0.91))+.5))/100.00;
		}
		if (numOfItems>=11 && numOfItems<=20){
			return ((int)((100*(cost))+.5))/100.00;
		}
		return ((int)((100*(cost*0.9))+.5))/100.00; //if items < 6 or > 20
	}
	
}
