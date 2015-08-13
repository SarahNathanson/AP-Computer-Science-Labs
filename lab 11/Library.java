import java.util.ArrayList;

/* 
 *  Rules for titling the different book types can be found in
 *  the related Excel document.
 */			

public class Library {
	public static void main(String[] args){
		ArrayList<Book> myLibrary = new ArrayList<Book>();
		for (int j = 0; j < 30; j++){
			double temp = Math.random();
			if (temp <= 0.4){
				myLibrary.add(new BabyBook());
			} else if (temp <= 0.8){
				myLibrary.add(new KidBook());
			} else {
				myLibrary.add(new MathBook());
			}
		}
		
		for (int j = 0; j < myLibrary.size(); j++){
			if(myLibrary.get(j) instanceof KidBook){
				System.out.print(((KidBook)myLibrary.get(j)).onceUponATime());
			}
			System.out.println(myLibrary.get(j).getTitle());
			/* STUDENT MUST:
			*  add in code here so that if it is a KidBook, it also
			*  called the "onceUponATime()" method, which RETURNS a 
			*  String (that you should print to the screen) that 
			*  reads "Once upon a time lived " and then include the
			*  name from the title of the book.
			*/

		}
	}
}

