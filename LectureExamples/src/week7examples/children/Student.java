package week7examples.children;

import week7examples.parent.Person;

import java.time.LocalDate;

public class Student {

    private int yearStarted;
    private int studentId;


    public class Student extends Person{
        public Student(LocalDate dateOfBirth, String lastName) {
            super(dateOfBirth, lastName);

        }

        @Override
        public double computeHeight() {
            return 0;
        }
    }
}
