/**
 * Application to demonstrate dog behavior.
 *
 * @author CSIS + Aidan K
 */
public class DogApp
{
    /**
     * Program entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog);
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.println(mySledDog);
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myCircusDog);
        actAsDog(myCircusDog);

        System.out.println("Using an Array:");

        Dog[] dogs = { myDog, mySledDog, myCircusDog };

        for (Dog d : dogs)
        {
            System.out.println(d);
            actAsDog(d);

            if (d instanceof SledDog)
            {
                ((SledDog) d).pullSled();
            }
        }
    }

    /**
     * Makes a dog act like a dog.
     *
     * @param d the dog
     */
    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }
}
