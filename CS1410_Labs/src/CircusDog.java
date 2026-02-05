/**
 * Represents a circus dog.
 *
 * @author CSIS + Aidan K
 */
public class CircusDog extends Dog
{
    /**
     * Creates a CircusDog with the given breed.
     *
     * @param b the breed
     */
    public CircusDog(String b)
    {
        super(b);
    }

    /**
     * Describes how the circus dog moves.
     */
    @Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
}
