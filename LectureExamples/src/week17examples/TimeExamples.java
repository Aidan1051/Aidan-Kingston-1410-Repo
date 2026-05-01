package week17examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeExamples {

    public static void main(String[] args) {
        LocalDate today= LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd yyyy");

        LocalDate before = LocalDate.of(1901, 1, 1);
        System.out.println(before.getDayOfWeek());

        System.out.println(today);
        System.out.println(formatter.format(today));
        System.out.println(formatter.format(today.plusWeeks(1)));
        System.out.println(today.getDayOfWeek());

        if (today.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("It's Sunday!");
        }
        ;
    }
}
