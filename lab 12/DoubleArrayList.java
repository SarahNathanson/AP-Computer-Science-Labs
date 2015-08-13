public class DoubleArrayList {
	//instance variables
	double[] list;
	public DoubleArrayList(){
		//default constructor
		list= new double[0];
	}

	public DoubleArrayList(double[] dList){
		list = dList;
	}
	
	public boolean add(double d){
		double[] templist=new double[list.length+1];
		for(int i=0;i<list.length;i++){
			templist[i]=list[i];
		}
		templist[templist.length-1]=d;
		list=templist;
		return true;//always returns true unless it errors
		//return consistent with documentation
	}
	public void add(int index, double d){
		double[] templist=new double[list.length+1];
		int j=0;
		for(int i=0;i<list.length+1;i++){
			if(i==index){
				templist[i++]=d;
			}
			else{
				templist[i]=list[j];
			}
			j++;
		}
		list=templist;
	}
	public boolean addAll(double[] dList){
		double[] templist=new double[list.length+dList.length];
		for(int i=0;i<list.length;i++){
			templist[i]=list[i];
		}
		for(int i=0;i<dList.length;i++){
			templist[i+list.length]=dList[i];
		}
		boolean listChanged=(list!=templist);
		list=templist;
		return listChanged;//consistent with documentation
	}
	public boolean addAll(int index, double[] dList){
		double[] templist=new double[list.length+dList.length];
		int j=0;
		for(int i=0;i<list.length+1;i++){
			if(i==index){
				for(int x=0;x<dList.length;x++){
					templist[x+list.length]=dList[x];
				}
				i+=dList.length;
			}
			else{
				templist[i]=list[j++];
			}
		}
		list=templist;
		
		boolean listChanged=(list!=templist);
		list=templist;
		return listChanged;//consistent with documentation
	}
	public void clear(){
		list=new double[0];
	}
	
	public boolean contains(double d){
		for(int i=0;i<list.length;i++){
			if(list[i]==d){
				return true;
			}
		}
		return false;//consistent with documentation
	}
	public double get(int index){
		return list[index];
	}
	public int indexOf(double d){
		for(int i=0;i<list.length;i++){
			if(list[i]==d){
				return i;
			}
		}
		return -1;//consistent
	}
	public boolean isEmpty(){
		return list.length==0;//consistent with documentation
	}
	public int lastIndexOf(double d){
		int index=-1;
		for(int i=0;i<list.length;i++){
			if(list[i]==d){
				index=i;
			}
		}
		return index;
	}
	public double remove(int index){
		double[] templist=new double[list.length-1];
		int x=0;
		for(int i=0;i<list.length;i++){
			if(i==index){
				i++;
			}
			templist[x++]=list[i];
		}
		list=templist;
		return list[index];
	}
	public boolean remove(double d){
		boolean inList=false;
		double[] templist=new double[list.length-1];
		int x=0;
		for(int i=0;i<list.length;i++){
			if(list[i]==d){
				i++;
				inList=true;
			}
			templist[x]=list[i];
			x++;
		}
		list=templist;
		return inList;
	}
	public boolean removeAll(double[] dList){
		boolean inList=false;//refers to whether in dList -> NOT in final list
		int counter=0;
		for(int i=0;i<list.length;i++){//goes through and counts elements still in list
			inList=false;
			for(int j=0;j<dList.length;j++){
				if(list[i]==dList[j]){
					inList=true;
				}
			}
			if(inList==false){
				counter++;
			}
		}
		double[] templist=new double[counter];
		for(int i=0;i<list.length;i++){//makes list of elements still in list
			inList=false;
			for(int j=0;j<dList.length;j++){
				if(list[i]==dList[j]){
					inList=true;
				}
			}
			if(inList==false){
				templist[i]=list[i];
			}
		}
		boolean listChanged=(list!=templist);
		list=templist;
		return listChanged;//consistent with documentation
	}
	public boolean retainAll(double[] dList){
		boolean inList=false;
		int counter=0;
		for(int i=0;i<list.length;i++){//goes through and counts elements still in list
			inList=false;
			for(int j=0;j<dList.length;j++){
				if(list[i]==dList[j]){
					inList=true;
				}
			}
			if(inList==true){
				counter++;
			}
		}
		double[] templist=new double[counter];
		int x=0;
		for(int i=0;i<list.length;i++){//makes list of elements still in list
			inList=false;
			for(int j=0;j<dList.length;j++){
				if(list[i]==dList[j]){
					inList=true;
				}
			}
			if(inList==true){
				templist[x++]=list[i];
			}
		}
		boolean listChanged=(list!=templist);
		list=templist;
		return listChanged;//consistent with documentation
	}
	public double set(int index, double d){
		double temp=list[index];
		list[index]=d;
		return temp;
	}
	public int size(){
		return list.length;
	}
	public double[] subList(int fromindex, int toindex){
		double[] tempList=new double[(toindex-fromindex)];
		int x=0;
		for(int i=fromindex;i<toindex;i++){
			tempList[x]=list[i];
			x++;
		}
		return tempList;
		
	}
	//add "also added" methods
	public String toString(){
		if(list.length==0){
			return "[]";
		}
		String stringForm="[";
		for(int i=0;i<list.length-1;i++){
			stringForm+=list[i]+", ";
		}
		return stringForm+list[list.length-1]+"]";
	}
	
	public double[] toArray(){
		double[] temp= new double[list.length];
		for(int i=0;i<list.length;i++){
			temp[i]=list[i];
		}
		return temp;//should return deep copy
	}
	public void selectionSort(){
		//selection sort
		double temp;
		int smallest;//index of smallest element
		for(int i=0;i<list.length;i++){
			smallest=i;
			for(int j=i+1;j<list.length;j++){
				if(list[j]<list[smallest]){
					smallest=j;
				}
			}
			temp=list[i];
			list[i]=list[smallest];
			list[smallest]=temp;
		}
	}
	public void insertionSort(){
		//insertion sort
		double temp;
		//list is unsorted array
		for(int i=1;i<list.length;i++){
			temp=list[i];
			for(int j=i;j>=0;j--){
				if(j==0 || temp>list[j-1]){//hard part
					list[j]=temp;
					break;
				}
				else{
					list[j]=list[j-1];
				}
				
			}
		}
	}
	
	public void mergeSort(){
		list=mergeSortHelper(list);
	}
	private double[] mergeSortHelper(double a[]){
		if(a.length==1){
			return a;
		}
		double b[]=new double[a.length/2];
		double c[]=new double[a.length-(a.length/2)];
		for(int i=0;i<b.length;i++){
			b[i]=a[i];
		}
		for(int i=0,j=b.length;(i<c.length && j<a.length);i++,j++){
			c[i]=a[j];
		}
		
		return merge(mergeSortHelper(b),mergeSortHelper(c));
	}
	
	private double[] merge(double[] a, double[] b){
		int startA=0;
		int startB=0;
		double[] c = new double[a.length+b.length];
		for(int i=0;i<c.length;i++){
			if(startA>=a.length){
				c[i]=b[startB++];
			}else if(startB>=b.length){
				c[i]=a[startA++];
			}
			else if(a[startA]<=b[startB]){
				c[i]=a[startA++];
			}else if (a[startA]>b[startB]){
				c[i]=b[startB++];
			}
		}
		return c;
	}
	
		
}
