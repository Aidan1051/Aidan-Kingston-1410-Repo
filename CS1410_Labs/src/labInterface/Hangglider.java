package labInterface;

/**
 * Represents a hangglider.
 */
public class Hangglider implements Flyable
{
	private final boolean isRigidWing;

	/**
	 * Creates a Hangglider.
	 *
	 * @param rigidWing true if rigid-wing
	 */
	public Hangglider(boolean rigidWing)
	{
		isRigidWing = rigidWing;
	}

	/**
	 * Launch behavior for a hangglider.
	 */
	@Override
	public void launch()
	{
		System.out.println("Running until take-off");
	}

	/**
	 * Land behavior for a hangglider.
	 */
	@Override
	public void land()
	{
		System.out.println("Gliding to a land");
	}

	/**
	 * Returns the hangglider type.
	 */
	@Override
	public String toString()
	{
		return isRigidWing ? "Rigid-wing" : "Flex-wing";
	}
}