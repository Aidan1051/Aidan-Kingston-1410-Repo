//package week11examples;
//
//import java.util.List;
//
//public class LambdaStreamExamples {
//    private List<Integer> numbers;
//
//    public LambdaStreamExamples() {
//        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//    }
//
//    public List<Integer> getNumbers() {
//        return numbers;
//    }
//
//    public static void main(String[] args) {
//        LambdaStreamExamples lambdaStreamExamples = new LambdaStreamExamples();
//        List<String> stringIntegers = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
//        List<Integer> myNumbers = lambdaStreamExamples.getNumbers();
//
////        lambdaStreamExamples.getNumbers().forEach(System.out::println);
////        lambdaStreamExamples.getNumbers().forEach(n -> {
////            System.out.println(n);
////        });
//
////        myNumbers.stream().filter(n -> n == 5).forEach(System.out::println);
//        System.out.println(myNumbers);
//        System.out.println(myNumbers.stream().filter(n -> n < 5).toList());
//        System.out.println(new HasSet<>(myNumbers));
//        myNumbers.streamI().map(n -> "My number is " + n).forEach
//
//
//    }
//}
