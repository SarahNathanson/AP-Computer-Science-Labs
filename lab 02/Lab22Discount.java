
public class Lab22Discount {

	static int passed = 0;
	static int tests = 0;
	public static void main(String[] FreddieMyLove){
		DiscountCalc discounter = new DiscountCalc();

		testCase1(discounter, "calculateTheDiscount(1,1000.0)",1,1000.0,100.0);
		testCase1(discounter, "calculateTheDiscount(5,1000.0)",5,1000.0,100.0);
		testCase1(discounter, "calculateTheDiscount(6,1000.0)",6,1000.0,90.0);
		testCase1(discounter, "calculateTheDiscount(10,1000.0)",10,1000.0,90.0);
		testCase1(discounter, "calculateTheDiscount(11,1000.0)",11,1000.0,0.0);
		testCase1(discounter, "calculateTheDiscount(20,1000.0)",20,1000.0,0.0);
		testCase1(discounter, "calculateTheDiscount(21,1000.0)",21,1000.0,100.0);
		System.out.println("\t\t\t"+passed+"/"+tests+" = \t"+(int)(100*passed/tests)+"%");
	}

	public static void testCase1(DiscountCalc discounter, String testCase, int numOfItems, double cost, double expected){
		tests++;
		if (discounter.calculateTheDiscount(numOfItems, cost) == expected){
			passed++;
			System.out.println(testCase +"\tpassed");
		} else {

			System.out.println(testCase+" - expected "+expected+", received " + discounter.calculateTheDiscount(numOfItems, cost));
		}
	}



}

