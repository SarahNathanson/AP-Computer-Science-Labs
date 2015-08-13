import java.util.Random;


public class BabyBook extends Book{
	public final String[] subject={
			"Grandma",
			"Grandpa",
			"Mommy",
			"Daddy",
			"Baby",
			"Sis",
			"Bro"};
	public final String[] verbs={
			"Loves",
			"Helps",
			"Has Fun With",
			"Plays with"};
	public final String[] objects={
			"Baby",
			"Strollers",
			"Bassinets",
			"Nurseries",
			"Onesies",
			"Bottles",
			"Rattles",
			"Pacifiers",
			"Cradles",
			"Mobiles",
			"Pajamas",
			"Formulas",
			"Potties",
			"Diapers",
			"Carriers",
			"Bouncers",
			"Bibs",
			"Booties",
			"Storks",
			"Blankets",
			"Hampers",
			"Teething Rings",
			"Night Lights",
			"Pillows",
			"Towels",
			"Car Seats",
			"Night Lights",
			"Swings",
			"Diaper Bags",
			"Play Mats",
			"Nursery Rhymes",
			"Baby Foods",
			"Diaper Rashes",
			"Cribs",
			"Juices",
			"Grandma",
			"Grandpa",
			"Mommy",
			"Daddy",
			"Bubbles",
			"Puppies",
			"Books"};
	
	public BabyBook(){
		//use rule for naming type of book
		Random rn = new Random();
		title=subject[(rn.nextInt(subject.length))];
		title+=" "+verbs[(rn.nextInt(verbs.length))];
		title+=" "+objects[(rn.nextInt(objects.length))];
	}
}
