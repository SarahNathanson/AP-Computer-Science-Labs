import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

public class SneakyRock extends Rock {
	
	
	public SneakyRock(Color color) {
		super();
		this.setColor(color);
	}

	public SneakyRock() {
		super();
	}
	
	
	public void turn() {
		setDirection(getDirection() + Location.HALF_RIGHT);
	}
	
	
	public void act() {
		Boolean turn=true;
		Grid<Actor> gr = getGrid();
		Location loc;
		for(int i=0;i<=360;i+=45){
			loc=this.getLocation().getAdjacentLocation(i);
			if(gr.isValid(loc) && gr.get(loc) != null && !(gr.get(loc) instanceof Flower)){
				//will turn if the surrounding square is off the grid, empty, or a flower
				//Should it turn for flowers?  Not sure if in doc "no one" includes flowers or not
				turn=false;
			}
		}
		if(turn){
			turn();
		}
	}
}