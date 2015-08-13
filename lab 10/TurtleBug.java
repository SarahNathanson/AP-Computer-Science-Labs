import info.gridworld.actor.*;
//import info.gridworld.grid.Grid;
//import info.gridworld.grid.Location;
import java.awt.Color;

public class TurtleBug extends Bug{
	private int wait;
	private int counter;
	
	
	public TurtleBug() {
		super();
		this.setColor(Color.GREEN);
		wait=1;
		counter=0;
	}
	
	/*
	 * if wait is how many moves it waits in between moving
	 * the higher wait is the slower SpeedBug is
	 * */
	public TurtleBug(int wait){						
		super();
		this.setColor(Color.GREEN);
		if(wait>=0){
			this.wait=wait;
		}
		else{//user entered a negative wait time, act as if default constructor
			this.wait=1;
		}
		counter=0;
	}
	
	
	public void act() {
		if(counter<wait){
			counter++;
		}
		else{
			counter=0;
			if(canMove())
				move();
			else
				turn();
		}
	}
}
