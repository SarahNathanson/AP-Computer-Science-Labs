
public class HotDogVendor {
	private String name;
	private int personalsales;
	private static int totalsales=0;
	private static int totalvendors=0;
	
	public HotDogVendor(){
		personalsales=0;
		totalvendors++;
	}
	
	public HotDogVendor(String name){
		this.name=name;
		personalsales=0;
		totalvendors++;
	}
	public HotDogVendor(String name, int num){
		this.name=name;
		personalsales=num;
		totalvendors++;
		totalsales+=personalsales;
	}
	
	public int personalSales(){
		return personalsales;
	}
	
	public void sell(){
		personalsales++;
		totalsales++;
	}
	
	public void setName(String name){
		if(this.name==null)
			this.name=name;
	}
	
	public static int totalSales(){
		return totalsales;
	}
	
	public static double averageSalesPerVendor(){
		return ((int)((totalsales/totalvendors)*10))/10.0;
	}
	
	public String getName(){
		return name;
	}
	
}
