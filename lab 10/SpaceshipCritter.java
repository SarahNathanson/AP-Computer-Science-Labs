import olderprojects.Critter;
import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class SpaceshipCritter extends Critter {
	
	
	public SpaceshipCritter() {
		super();
	}

	
	public void turn() {
		setDirection(getDirection() + Location.HALF_RIGHT);
	}
	

	public void move() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location next2 = next.getAdjacentLocation(getDirection());
		if (gr.isValid(next2)
				&& (gr.get(next2) instanceof Flower || gr.get(next2) == null))
			moveTo(next2);
		else if (gr.isValid(next)
				&& (gr.get(next) instanceof Flower || gr.get(next) == null))
			moveTo(next);
	}
	
	
	public boolean canMove() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (!gr.isValid(next))
			return false;
		Actor neighbor = gr.get(next);
		return (neighbor == null) || (neighbor instanceof Flower);
		// ok to move into empty location or onto flower
		// not ok to move onto any other actor
	}

	
	public void act() {
		if (canMove()) {
			move();
		}
		else{
			turn();
			super.act();
		}
	}
}