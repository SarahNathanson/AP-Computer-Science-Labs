import info.gridworld.actor.*;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class SwirlBomb extends Actor implements Explodable {
	private int count = 0;
	private int counttime=0;

	
	public SwirlBomb(int i) {
		setCountdown(i);
		count = i;
		counttime=i;
	}

	
	public void act() {
		if (getCountdown() == 0) {
			Explode();
			count=counttime;
		}
		else{
			count--;
		}
	}

	
	public void Explode() {
		Grid<Actor> gr = getGrid();
		for (int i = 0; i < gr.getNumRows(); i++) {
			for (int j = 0; j < gr.getNumCols(); j++) {
				Actor currentActor=gr.get(new Location(i, j));
				if (currentActor != null && currentActor != this)
					currentActor.removeSelfFromGrid();
			}
		}
	}
	

	@Override
	public void setCountdown(int numTurns) {
		count = numTurns;
	}

	
	@Override
	public int getCountdown() {
		return count;
	}

}
