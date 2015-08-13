
public class Lab7DoubleArrayListRunner {
	private static int numTests = 14;
	private static boolean[] tst = new boolean[numTests];

	
	public static void main(String[] args){
		DoubleArrayList x = new DoubleArrayList();
		x.add(34.4);
		for (int i = 0; i < 10; i++){
			x.add(i+0.5);
		}
		tst[0] = x.toString()
				.equals("[34.4, 0.5, 1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5]");	System.out.println(tst[0] + "   "+x);
		tst[1] = x.contains(0.5);														System.out.println(tst[1] + "   contains 0.5");
		tst[2] = !x.contains(0.7);														System.out.println(tst[2] + "   does not contain 0.7");
		tst[3] = x.indexOf(5.5)==6;														System.out.println(tst[3] + "   index of 5.5 is 6 (ans:"+x.indexOf(5.5)+")");
		tst[4] = x.indexOf(5.8)==-1;													System.out.println(tst[4] + "   index of 5.8 is -1 (ans:"+x.indexOf(5.8)+")");
		tst[5] = x.size()==11;															System.out.println(tst[5] + "   array size is 11 (ans:"+x.size()+")");
		x.remove(5);
		tst[6] = x.size()==10;															System.out.println(tst[6] + "   array size after remove is 10 (ans:"+x.size()+")");
		tst[7] = x.indexOf(5.5)==5;														System.out.println(tst[7] + "   index of 5.5 is 5 (ans:"+x.indexOf(5.5)+")");
		x.addAll(new double[] {12.3, 13.7});
		tst[8] = x.size()==12;															System.out.println(tst[8] + "   array size after add is 12 (ans:"+x.size()+")");
		x.add(3,123.6);
		tst[9] = x.size()==13;															System.out.println(tst[9] + "   array size after index add is 13 (ans:"+x.size()+")");
		tst[10] = x.indexOf(123.6)==3;													System.out.println(tst[10] +"   index of 123.6 is 3 (ans:"+x.indexOf(123.6)+")");
		tst[11] = x.get(4) == 2.5;														System.out.println(tst[11] +"   4th element is 2.5 (ans: "+x.get(4)+")");
		x.clear();
		tst[12] = x.isEmpty();															System.out.println(tst[12] +"   List is empty after clear (ans: "+x.isEmpty()+")");
		x.add(9.0);
		x.add(6.0);
		x.add(1.0);
		x.add(-5.0);
		x.selectionSort();
		tst[13] = x.toString().equals("[-5.0, 1.0, 6.0, 9.0]");							System.out.println(tst[13] + "   "+x);
		int passCounter = 0;
		for(int i = 0; i < numTests; i++){
			if (tst[i]) passCounter++;
		}
		System.out.println("\nPassed "+passCounter+"/"+numTests+" "+((int)(100*passCounter/numTests))+"%");
	}
}
