package children;

import parent.LivingBeing;

public class Cat extends LivingBeing {

    private String coatType;
    private boolean likesToClimb;

    public Cat(String species, int age, String coatType, boolean likesToClimb) {
        super(species, age);
        this.coatType = coatType;
        this.likesToClimb = likesToClimb;
        setWeightKg(4.5);
        setHabitat("Houses and apartments");
    }

    @Override
    public String makeDailyRoutine() {
        return "Sleep, eat, groom, play with toy, sleep again";
    }

    public void purr() {
        System.out.println("Prrrrrrrr...");
    }

    public void knockThingsOver() {
        System.out.println("Crash! Oops...");
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }

    public boolean isLikesToClimb() {
        return likesToClimb;
    }

    public void setLikesToClimb(boolean likesToClimb) {
        this.likesToClimb = likesToClimb;
    }

    @Override
    public String toString() {
        return "Cat{" +
                super.toString().replace("LivingBeing", "Cat") +
                ", coatType='" + coatType + '\'' +
                ", likesToClimb=" + likesToClimb +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return likesToClimb == cat.likesToClimb && coatType.equals(cat.coatType);
    }
}