package week17examples;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ProgrammingChallenge2 {
        public static void main(String[] args) {

            int count = 0;

            LocalDate date = LocalDate.of(1901, 1, 1);
            LocalDate end = LocalDate.of(2000, 12, 31);

            while (!date.isAfter(end)) {

                if (date.getDayOfMonth() == 1 &&
                        date.getDayOfWeek() == DayOfWeek.SUNDAY) {

                    count++;
                }

                date = date.plusMonths(1);
            }

            System.out.println("Sundays on the 1st of the month: " + count);
        }
    }
