
public class MakeChange {
	public void main(String args[]){
		
	}
	String makeChange (double money){
		double cash=money;
		String change="";
		
		double[] denominations={100, 50, 20, 10, 5, 1, 0.25, 0.1, 0.05, 0.01};
		for(int x=0; x < denominations.length; x++){
			change+=(int)((cash)/denominations[x]);
			if (x!=denominations.length-1){
				change+=" ";
			}
			cash %= denominations[x];
		}
		
		return change;
	}

}
