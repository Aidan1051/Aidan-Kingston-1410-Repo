package week8examples.children;

import week8examples.parent.Person;

import java.time.LocalDate;

public class Employee extends Person {
    private int employeeId;
    private double salary;

    public Employee(LocalDate dateOfBirth, String lastName, int employeeId) {
        super(dateOfBirth, lastName);
        this.employeeId = employeeId;
    }

    @Override
    public double computeHeight() {
        return 0;
    }
}
