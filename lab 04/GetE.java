public class GetE {
	public static void main(String args[]){
		double e=1;
		double denom=1;
		for (int i=1; i < Integer.parseInt(args[0]) ;i++){
			e+=1/(denom);
			denom*=(i+1);
		}
		System.out.println(e);
	}
}
