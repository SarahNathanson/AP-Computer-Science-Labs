import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;


public class FrightenedBug extends Bug {
	
	
	public FrightenedBug() {
		super();
		
	}

	
	public boolean neighborIsCalm() {
		Grid<Actor> gr = getGrid();
		Location loc;
		for(int i=0;i<=360;i+=45){
			loc=this.getLocation().getAdjacentLocation(i);
			if (!(gr.get(loc) instanceof Rock) && !(gr.get(loc) instanceof Flower) && (gr.get(loc) != null)){
				return false;//there is a neighbor, so it is not calm
			}
		}
		return true; //if there is no neighbor, it is calm
	}
	
	public void act() {
		if (canMove()) {
			move();
		} else if (neighborIsCalm()) { // returns true if facing a Rock, a
										// Flower, or the edge
			turn();
		} else {
			turn();
			turn();
			turn();
			turn();
		}
	}
}