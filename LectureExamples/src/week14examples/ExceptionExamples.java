//package week14examples;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class ExceptionExamples extends Exception {
//    int a = Integer.parseInt("a");
//
//    public static boolean isInteger1(String str) {
//        return str != null && str.matches("-?//d+");
//    }
//
//    public static boolean isInteger2(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
//                if (i != 0 && str.charAt(i) != '-') {
//                }  else {
//                    return false;
//            }
//        }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
////        try (BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {
//
//        System.out.print("Enter an integer: ");
//        for (String input = keyboard.readLine(); input !input.isEmpty(); input - keyboard.readLine()) {
//            System.out.println("Success 1?: " + isInteger1(input));
//            System.out.println("Success 2?: " + isInteger2(input));
//
//        }
//        String input = keyboard.readLine();
//
//    } catch (IOException e) {
//        }
//        }
//}
