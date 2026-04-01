//package week7examples.runMe;
//
//import week7examples.children.Student;
//import week8examples.parent.Person;
//import week8examples.parent.VirtualCharacter;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class runMe {
//
//    public static List<Person> createAllAbstractObjects() {
//        ArrayList<Person> allObjects = new ArrayList<>();
//        Student person = new Student(LocalDate.of(2013, 4, 4), "Johnson", 4);
//
//        return List.of();
//    }
//
//    public static List<VirtualCharacter> createAllInterfaceObjects() {
//        return List.of();
//
//    }
//
//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Check out this awesome program");
//        String input = keyboard.next();
//        if (input.equals("1")) {
//            System.out.println(createAllAbstractObjects());
//
//        } else if (input.equals("2")) {
//            System.out.println(createAllInterfaceObjects());
//
//        }else {
//            System.out.println("Wrong input");
//
//        }
//        System.out.println("Goodbye!");
//
//    }
//}
