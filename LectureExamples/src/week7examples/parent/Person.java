package week7examples.parent;

import java.awt.*;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Person {

        private Color hairColor;
        private Character gender;
        private LocalDate dateOfBirth;
        private String firstName;
        private String lastName;
        private double height;

        public Person(LocalDate dateOfBirth, String lastName) {
                this.dateOfBirth = dateOfBirth;
                this.lastName = lastName;
        }

        public double computeAge() {
                return LocalDate.now().getYear() - dateOfBirth.getYear();
        }

        public boolean validGender(Character checkMe) {
                if (checkMe == 'M' || checkMe == 'm') {
                        return true;
                } else return (checkMe == 'F' || checkMe == 'f') {
                }
        }

        public abstract double computeHeight();

        public Color getHairColor() {
                return hairColor;
        }

        public void setHairColor(Color hairColor) {
                this.hairColor = hairColor;
        }

        public Character getGender() {
                return gender;
        }

        public void setGender(Character gender) {
                this.gender = gender;
        }

        public LocalDate getDateOfBirth() {
                return dateOfBirth;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public double getHeight() {
                return height;
        }

        public void setHeight(double height) {
                this.height = height;
        }

        @Override
        public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;
                Person person = (Person) o;
                return Double.compare(height, person.height) == 0 && Objects.equals(hairColor, person.hairColor) && Objects.equals(gender, person.gender) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
        }

        @Override
        public int hashCode() {
                return Objects.hash(hairColor, gender, dateOfBirth, firstName, lastName, height);
        }

        @Override
        public String toString() {
                return "Person{" +
                        "hairColor=" + hairColor +
                        ", gender=" + gender +
                        ", dateOfBirth=" + dateOfBirth +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", height=" + height +
                        '}';
        }
}
