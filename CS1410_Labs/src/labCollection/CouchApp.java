package labCollection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CouchApp {
    public static void main(String[] args) {
        Color[] colors = {Color.BLACK, Color.BLUE, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.RED, Color.WHITE};

        List<Couch> couches = new ArrayList<>();
        for (Color c : colors) {
            couches.add(new Couch(c, Material.FABRIC));
            couches.add(new Couch(c, Material.LEATHER));
            couches.add(new Couch(c, Material.VINYL));
        }

        List<Couch> favorites = new ArrayList<>();
        favorites.add(new Couch(Color.RED, Material.FABRIC));
        favorites.add(new Couch(Color.BLACK, Material.LEATHER));
        favorites.add(new Couch(Color.WHITE, Material.VINYL));

        printCouches(couches);
        System.out.println("Number of elements in list couches: " + couches.size());
        checkFavorites(couches, favorites);

        System.out.println("\nRemoving all vinyl couches . . .\n");
        couches.removeIf(c -> c.getMaterial() == Material.VINYL);
        printCouches(couches);
        System.out.println("Number of elements in list couches: " + couches.size());
        checkFavorites(couches, favorites);

        System.out.println("\nAdding all the favorites to the list couches . . .\n");
        couches.addAll(favorites);
        printCouches(couches);
        System.out.println("Number of elements in list couches: " + couches.size());
        checkFavorites(couches, favorites);

        System.out.println("\nAdding all the couches to a set . . .\n");
        Set<Couch> couchSet = new HashSet<>(couches);
        printCouches(couchSet);
        System.out.println("Number of elements in the set: " + couchSet.size());
        checkFavorites(couchSet, favorites);
    }

    public static void printCouches(Iterable<Couch> list) {
        list.forEach(System.out::println);
    }

    public static void checkFavorites(Iterable<Couch> couches, List<Couch> favorites) {
        boolean allIncluded = true;
        for (Couch f : favorites) {
            boolean found = false;
            for (Couch c : couches) {
                if (c.equals(f)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                allIncluded = false;
                break;
            }
        }
        if (allIncluded) {
            System.out.println("All favorites are in the list.");
        } else {
            System.out.println("Not all favorites are in the list.");
        }
    }
}