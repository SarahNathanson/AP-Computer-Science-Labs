public class TaxCalc {
	public static void main(String args[]){
		
	}
	/* oldTax returns the old tax, rounded to the nearest penny, properly formatted with dollar signs and commas, such as “$4,564.25 */
	public String oldTax(double income){
		double tax = 0;
		if(income < 17400){
			//tax is already 0
		}
		else if(income >= 17400 && income < 70700){
			tax+=17399.99*0.10;
			tax += (income - 17399.99) * 0.15;
		}
		else if(income >= 70700 && income < 142700){
			tax+=17399.99*0.10;
			tax += 70699.99 * 0.15;
			tax += (income - 17399.99 - 70699.99) * 0.25;
		}
		else if(income >= 142700 && income < 217450){
			tax+=17399.99*0.10;
			tax += 70699.99*0.15;
			tax += 142699.99*0.25;
			tax += (income - 17399.99 - 142699.99 - 70699.99) * 0.28;
		}
		else{
			tax+=17399.99*0.10;
			tax += 70699.99 * 0.15;
			tax += 142699.99 * 0.25;
			tax += 217449.99 * 0.25;
			tax += (income - 17399.99 - 142699.99 - 70699.99 - 217449.99) * 0.33;
		}
		return String.format("$%, .2f",tax);
	}

	/* newTax returns the net tax in the same format as above */
	public String newTax(double income){
		double tax = 0;
		if(income < 17400){
			//tax is already 0
		}
		else if(income >= 17400 && income < 70700){
			tax+=17399.99*0.10;
			tax += (income - 17399.99) * 0.15;
		}
		else if(income >= 70700 && income < 142700){
			tax+=17399.99*0.10;
			tax += 70699.99 * 0.15;
			tax += (income - 17399.99 - 70699.99) * 0.25;
		}
		else if(income >= 142700 && income < 217450){
			tax+=17399.99*0.10;
			tax += 70699.99*0.15;
			tax += 142699.99*0.25;
			tax += (income - 17399.99 - 142699.99 - 70699.99) * 0.28;
		}
		else{
			tax += income * 0.33;
		}
		return String.format("$%, .2f",tax);
	}

	/* taxDifference returns the new tax minus the old tax.  For low incomes, should return “$0.00” */
	public String taxDifference(double income){
		double difference=0.00;
		if (income>=217450){
			difference=(income * 0.33)-((70699.99 * 0.15)+(142699.99 * 0.25)+(217449.99 * 0.25)+((income - 17399.99 - 142699.99 - 70699.99 - 217449.99) * 0.33));
		}
		return String.format("$%, .2f",difference);
	}

}
