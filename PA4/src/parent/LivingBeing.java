package parent;

import java.util.Objects;

public abstract class LivingBeing {

    private String species;
    private int age;
    private double weightKg;
    private String habitat;

    public LivingBeing(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public double eat(double foodAmount) {
        this.weightKg += foodAmount * 0.12;
        return this.weightKg;
    }

    public boolean isAdult() {
        return this.age >= 2;
    }

    public abstract String makeDailyRoutine();

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "LivingBeing{" +
                "species='" + species + '\'' +
                ", age=" + age +
                ", weightKg=" + weightKg +
                ", habitat='" + habitat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivingBeing that = (LivingBeing) o;
        return age == that.age &&
                Double.compare(that.weightKg, weightKg) == 0 &&
                Objects.equals(species, that.species) &&
                Objects.equals(habitat, that.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, age, weightKg, habitat);
    }
}