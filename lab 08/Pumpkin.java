
public class Pumpkin {
	private int weight;
	public Pumpkin(){
		//default constructor
		weight=5;
	}
	public Pumpkin(int num){
		//constructor
		weight=num;
	}
	
	public int weigh(){
		//getter
		return weight;
	}
	public void grow(){
		//mutator
		//increase weight by 1/5, rounded down
		weight+=(weight/5);
		
	}
	
}
