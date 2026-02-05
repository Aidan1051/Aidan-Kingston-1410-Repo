/**
 * Represents a sled dog.
 *
 * @author CSIS + Aidan K
 */
public class SledDog extends Dog
{
    /**
     * Creates a SledDog with the given breed.
     *
     * @param b the breed
     */
    public SledDog(String b)
    {
        super(b);
    }

    /**
     * Describes pulling a sled.
     */
    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
}
