package children;

import parent.LivingBeing;

public class Cow extends LivingBeing {

    private String breed;
    private double milkProductionPerDay;

    public Cow(String species, int age, String breed, double milkProductionPerDay) {
        super(species, age);
        this.breed = breed;
        this.milkProductionPerDay = milkProductionPerDay;
        setWeightKg(680.0);
        setHabitat("Farm pastures");
    }

    @Override
    public String makeDailyRoutine() {
        return "Graze, chew cud, get milked, rest";
    }

    public void moo() {
        System.out.println("Mooooooo!");
    }

    public void graze() {
        System.out.println("Eating grass calmly...");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getMilkProductionPerDay() {
        return milkProductionPerDay;
    }

    public void setMilkProductionPerDay(double milkProductionPerDay) {
        this.milkProductionPerDay = milkProductionPerDay;
    }

    @Override
    public String toString() {
        return "Cow{" +
                super.toString().replace("LivingBeing", "Cow") +
                ", breed='" + breed + '\'' +
                ", milkProductionPerDay=" + milkProductionPerDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cow)) return false;
        if (!super.equals(o)) return false;
        Cow cow = (Cow) o;
        return Double.compare(cow.milkProductionPerDay, milkProductionPerDay) == 0 && breed.equals(cow.breed);
    }
}