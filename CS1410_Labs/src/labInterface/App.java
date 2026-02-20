package labInterface;

import java.util.ArrayList;

/**
 * Application driver class.
 */
public class App
{
	/**
	 * Program entry point.
	 */
	public static void main(String[] args)
	{
		Plane myPlane = new Plane(4, "Boing 747");
		System.out.printf("myPlane: %s%n", myPlane);

		Hangglider myHangglider = new Hangglider(true);
		System.out.printf("myHangglider: %s%n", myHangglider);

		Bird myBird = new Bird("Swallow");
		System.out.printf("myBird: %s%n", myBird);

		System.out.println(); // separates Part 1 and Part 2

		ArrayList<Flyable> flyingThings = new ArrayList<>();
		flyingThings.add(myPlane);
		flyingThings.add(myHangglider);
		flyingThings.add(myBird);

		for (Flyable f : flyingThings)
		{
			System.out.println(f);
			f.launch();
			f.land();
			System.out.println();
		}
	}
}