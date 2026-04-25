package labSerialization;

import java.awt.Color;
import java.io.*;

/**
 * LabSerialization demonstrates how to serialize and deserialize
 * a custom object that references other objects on the heap.
 * Author(s): Aidan Kingston
 */
public class LabSerialization {
    public static void main(String[] args) {
        ListVsSetDemo demo = new ListVsSetDemo(
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(6, Color.BLUE),
                new ColoredSquare(4, Color.RED),
                new ColoredSquare(8, Color.YELLOW));

        serialize(demo, "Demo.ser");
        System.out.println("Serialization complete.");

        ListVsSetDemo newDemo = deserialize("Demo.ser");

        displayListAndSet(newDemo);

    };

    public static void serialize(ListVsSetDemo demo, String filename) {
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream(filename))) {

            out.writeObject(demo);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ListVsSetDemo deserialize(String filename) {
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream(filename))) {

            return (ListVsSetDemo) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Displays the elements of the list and the set.
     */
    private static void displayListAndSet(ListVsSetDemo demo) {
        System.out.println("List:");
        System.out.println(demo.getListElements());
        System.out.println("Set:");
        System.out.println(demo.getSetElements());
    }

}