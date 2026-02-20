package labInterface;

/**
 * Represents a plane.
 */
public class Plane implements Flyable
{
	private final int numberOfEngines;
	private final String model;

	/**
	 * Creates a Plane.
	 *
	 * @param engines number of engines
	 * @param m model name
	 */
	public Plane(int engines, String m)
	{
		numberOfEngines = engines;
		model = m;
	}

	/**
	 * Launch behavior for a plane.
	 */
	@Override
	public void launch()
	{
		System.out.println("Rolling until take-off");
	}

	/**
	 * Land behavior for a plane.
	 */
	@Override
	public void land()
	{
		System.out.println("Rolling to a stop");
	}

	/**
	 * Returns plane description.
	 */
	@Override
	public String toString()
	{
		return String.format("%s with %d engines", model, numberOfEngines);
	}
}