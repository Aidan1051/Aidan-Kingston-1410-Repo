/**
 * Represents a generic dog.
 *
 * @author CSIS + Aidan K
 */
public class Dog
{
    private final String breed;

    /**
     * Creates a Dog with the given breed.
     *
     * @param b the breed of the dog
     */
    public Dog(String b)
    {
        breed = b;
    }

    /**
     * Makes the dog communicate.
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }

    /**
     * Describes how the dog moves.
     */
    public void move()
    {
        System.out.println("run");
    }

    /**
     * Returns the breed of the dog.
     *
     * @return the breed
     */
    public String getBreed()
    {
        return breed;
    }

    /**
     * Returns a string representation of the dog.
     *
     * @return class name and breed
     */
    @Override
    public String toString()
    {
        return this.getClass().getSimpleName() + ": " + breed;
    }
}
