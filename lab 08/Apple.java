
public class Apple {
	private double color;
	private int weight;
	public Apple(){
		//default constructor
		color=1.0;
		weight=1;
	}
	public double getcolor(){
		//accessor, returns color
		return color;
	}
	public int weigh(){
		//accessor, returns weight
		return weight;
	}
	
	public void grow(){
		//mutator
		//Grows by 1, color changes by 1.5
		color+=1.5;
		weight+=1;
	}
	
}
