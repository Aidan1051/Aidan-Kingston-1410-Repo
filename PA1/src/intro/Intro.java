package intro;

import java.util.Objects;

public class Intro {


    private String firstName;
    private String lastName;
    private String highSchoolLevel;
    private double age;
    private String expectedMajor;
    private String customMessage;

    public Intro(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getHighSchoolLevel() {
        return highSchoolLevel;
    }

    public void setHighSchoolLevel(String highSchoolLevel) {
        this.highSchoolLevel = highSchoolLevel;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getExpectedMajor() {
        return expectedMajor;
    }

    public void setExpectedMajor(String expectedMajor) {
        this.expectedMajor = expectedMajor;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    @Override
    public String toString() {
        return "Intro {" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", highSchoolLevel='" + highSchoolLevel + '\'' +
                ", age=" + age +
                ", expectedMajor='" + expectedMajor + '\'' +
                ", customMessage='" + customMessage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Intro)) return false;
        Intro intro = (Intro) o;
        return Double.compare(intro.age, age) == 0 &&
                Objects.equals(firstName, intro.firstName) &&
                Objects.equals(lastName, intro.lastName) &&
                Objects.equals(highSchoolLevel, intro.highSchoolLevel) &&
                Objects.equals(expectedMajor, intro.expectedMajor) &&
                Objects.equals(customMessage, intro.customMessage);
    }

    public static void main(String[] args) {

        Intro me = new Intro("Aidan", "K");

        me.setHighSchoolLevel("Senior");
        me.setAge(16);
        me.setExpectedMajor("Computer Science");
        me.setCustomMessage("This is my custom message!");

        System.out.println(me);
    }
}
