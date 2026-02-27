package children;

import parent.LivingBeing;

public class Lion extends LivingBeing {

    private String prideName;
    private boolean isMale;

    public Lion(String species, int age, String prideName, boolean isMale) {
        super(species, age);
        this.prideName = prideName;
        this.isMale = isMale;
        setWeightKg(190.0);
        setHabitat("Savanna");
    }

    @Override
    public String makeDailyRoutine() {
        return "Rest, hunt, eat, patrol territory, roar";
    }

    public void roar() {
        System.out.println("ROOOOOOAR!");
    }

    public void hunt() {
        System.out.println("Stalking prey...");
    }

    public String getPrideName() {
        return prideName;
    }

    public void setPrideName(String prideName) {
        this.prideName = prideName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "Lion{" +
                super.toString().replace("LivingBeing", "Lion") +
                ", prideName='" + prideName + '\'' +
                ", isMale=" + isMale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lion)) return false;
        if (!super.equals(o)) return false;
        Lion lion = (Lion) o;
        return isMale == lion.isMale && prideName.equals(lion.prideName);
    }
}