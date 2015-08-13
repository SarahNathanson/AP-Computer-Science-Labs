import java.util.Random;


public class KidBook extends Book{
	public final String[] titlestart={
			"The Grand Adventures Of",
			"My Mother Is",
			"An Afternoon with",
			"Sharing the Holidays with",
			"A Special Time With",
			"Adventure Time! With",
			"The World Revolves Around",
			"The Secret Life of",
			"The Year of"};
	public final String[] person={
			"Walter White",
			"Batman",
			"Lady Gaga",
			"Pikachu",
			"Beyonce",
			"John Oliver",
			"Kim Kardashian",
			"Bob the Builder",
			"Mr. Contempte"};
	public KidBook(){
		//use rule for naming type of book
		Random rn = new Random();
		title=titlestart[(rn.nextInt(titlestart.length))];
		title+=" "+person[(rn.nextInt(person.length))];
	}
	public String onceUponATime(){
		return "Once upon a time lived: ";
	}
}
