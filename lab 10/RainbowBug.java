import java.awt.Color;
import info.gridworld.actor.*;
import java.util.ArrayList;

public class RainbowBug extends Bug {
	private int steps;
	private ArrayList<Color> colors = new ArrayList<Color>();
	

	public RainbowBug(ArrayList<Color> array) {
		colors = array;
	}
	
	public RainbowBug() {
		this.setColor(Color.red);
		colors.add(Color.RED);
		colors.add(Color.GREEN);
	}
	
	
	public void removeSelfFromGrid() {
	}

	
	public void act() {
		if (canMove())
			move();
		else
			turn();
		this.setColor(colors.get(steps % colors.size()));
		steps++;
	}
}
