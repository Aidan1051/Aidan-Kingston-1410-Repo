package labInterface;

/**
 * Represents a bird.
 */
public class Bird implements Flyable
{
	private final String type;

	/**
	 * Creates a Bird with the given type.
	 *
	 * @param t the type of bird
	 */
	public Bird(String t)
	{
		type = t;
	}

	/**
	 * Launch behavior for a bird.
	 */
	@Override
	public void launch()
	{
		System.out.println("Flapping the wings to take off");
	}

	/**
	 * Land behavior for a bird.
	 */
	@Override
	public void land()
	{
		System.out.println("Flapping the wings until landing");
	}

	/**
	 * Returns the bird type.
	 */
	@Override
	public String toString()
	{
		return type;
	}
}