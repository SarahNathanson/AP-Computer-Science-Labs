
public class Lab21TaxCalcRunner {
	static int passed = 0;
	static int tests = 0;
	public static void main(String[] FreddieMyLove){
		TaxCalc calculate = new TaxCalc();
		
		testCase1(calculate, "oldTax(500.0)           ", 500.0, "$0.00");
		testCase1(calculate, "oldTax(100000.0)        ", 100000.0, "$17,060.00");
		testCase1(calculate, "oldTax(1000000.0)       ", 1000000.0, "$306,906.50");
		testCase2(calculate, "newTax(1000000.0)       ", 1000000.0, "$330,000.00");
		testCase3(calculate, "taxDifference(27000.0)  ", 27000.0, "$0.00");
		testCase3(calculate, "taxDifference(1000000.0)", 1000000.0, "$23,093.50");
		System.out.println("\t\t\t"+passed+"/"+tests+" = \t"+(int)(100*passed/tests)+"%");
	}
	
	public static void testCase1(TaxCalc calculate, String testCase, double numToTest, String expected){
		tests++;
		if (calculate.oldTax(numToTest).equals(expected)){
			passed++;
			System.out.println(testCase +"\tpassed");
		} else {

			System.out.println(testCase+" - expected "+expected+", received " + calculate.oldTax(100000.0));
		}
	}
	
	
	public static void testCase2(TaxCalc calculate, String testCase, double numToTest, String expected){
		tests++;
		if (calculate.newTax(numToTest).equals(expected)){
			passed++;
			System.out.println(testCase +"\tpassed");
		} else {

			System.out.println(testCase+" - expected "+expected+", received " + calculate.oldTax(100000.0));
		}
	}
	
	
	public static void testCase3(TaxCalc calculate, String testCase, double numToTest, String expected){
		tests++;
		if (calculate.taxDifference(numToTest).equals(expected)){
			passed++;
			System.out.println(testCase +"\tpassed");
		} else {

			System.out.println(testCase+" - expected "+expected+", received " + calculate.oldTax(100000.0));
		}
	}
}
