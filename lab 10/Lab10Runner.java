import info.gridworld.actor.*;
import java.util.ArrayList;
import java.awt.Color;

public class Lab10Runner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.add(new SwirlBomb(10));
		ArrayList<Color> someColors = new ArrayList<Color>();
		world.add(new SneakyRock(Color.PINK));
		world.add(new SneakyRock(Color.CYAN));
		world.add(new SneakyRock(Color.MAGENTA));
		world.add(new SneakyRock(Color.ORANGE));
		world.add(new SneakyRock(Color.LIGHT_GRAY));
		world.add(new SneakyRock(Color.GRAY));
		world.add(new SneakyRock(Color.GREEN));
		world.add(new SneakyRock());
		someColors.add(Color.RED);
		someColors.add(Color.GREEN);
		someColors.add(Color.YELLOW);
		someColors.add(Color.BLUE);
		someColors.add(Color.WHITE);
		world.add(new TurtleBug());// default constructor
		world.add(new TurtleBug(3)); // 3 second lapses
		world.add(new RainbowBug(someColors));
		world.add(new FrightenedBug());
		world.add(new SpaceshipCritter());
		world.show();
	}
}
