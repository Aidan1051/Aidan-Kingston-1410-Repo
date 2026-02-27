package runMe;

import parent.LivingBeing;
import parent.CanMakeSound;
import children.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMe {

    public static List<LivingBeing> createAllAbstractObjects() {
        List<LivingBeing> beings = new ArrayList<>();

        Dog dog = new Dog("Canis lupus familiaris", 5, "Golden Retriever", "Golden");
        Cat cat = new Cat("Felis catus", 3, "Short hair", true);
        Cow cow = new Cow("Bos taurus", 6, "Holstein", 28.5);
        Lion lion = new Lion("Panthera leo", 8, "Serengeti Pride", true);

        beings.add(dog);
        beings.add(cat);
        beings.add(cow);
        beings.add(lion);

        return beings;
    }

    public static List<CanMakeSound> createAllInterfaceObjects() {
        List<CanMakeSound> soundMakers = new ArrayList<>();

        Parrot parrot = new Parrot("Polly", 120, "Rainbow", true);
        Snake snake = new Snake("Python regius", 180.0, false, "Black & Gold");
        Dolphin dolphin = new Dolphin("Echo", 2.8, 250, true);

        soundMakers.add(parrot);
        soundMakers.add(snake);
        soundMakers.add(dolphin);

        return soundMakers;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey what's up");
        System.out.println("I've got a lot of animals to show you");
        System.out.println("Press 1 to see animals that extend LivingBeing");
        System.out.println("Press 2 to see animals that implement CanMakeSound");

        String input = scanner.nextLine().trim();

        if (input.equals("1")) {
            System.out.println("\nAnimals from LivingBeing:");
            for (LivingBeing being : createAllAbstractObjects()) {
                System.out.println(being);
            }
        } else if (input.equals("2")) {
            System.out.println("\nAnimals that make sounds:");
            for (CanMakeSound soundMaker : createAllInterfaceObjects()) {
                System.out.println(soundMaker);
                soundMaker.makeSound();
            }
        } else {
            System.out.println("Bye! Maybe next time.");
        }

        scanner.close();
    }
}