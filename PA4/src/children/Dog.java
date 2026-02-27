package children;

import parent.LivingBeing;

public class Dog extends LivingBeing {

    private String breed;
    private String furColor;

    public Dog(String species, int age, String breed, String furColor) {
        super(species, age);
        this.breed = breed;
        this.furColor = furColor;
        setWeightKg(18.0);
        setHabitat("Human homes");
    }

    @Override
    public String makeDailyRoutine() {
        return "Walk, play, eat, sleep, guard house";
    }

    public void bark() {
        System.out.println("Woof woof!");
    }

    public void fetchStick() {
        System.out.println("Running to get the stick!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString().replace("LivingBeing", "Dog") +
                ", breed='" + breed + '\'' +
                ", furColor='" + furColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return breed.equals(dog.breed) && furColor.equals(dog.furColor);
    }
}