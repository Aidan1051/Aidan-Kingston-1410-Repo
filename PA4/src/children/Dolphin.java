package children;

import parent.CanMakeSound;

public class Dolphin implements CanMakeSound {

    private String name;
    private double lengthM;
    private int clicksPerSecond;
    private boolean performsTricks;

    public Dolphin(String name, double lengthM, int clicksPerSecond, boolean performsTricks) {
        this.name = name;
        this.lengthM = lengthM;
        this.clicksPerSecond = clicksPerSecond;
        this.performsTricks = performsTricks;
    }

    @Override
    public void makeSound() {
        System.out.println("Eeee-eee-eee!");
    }

    @Override
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Click-click-eee!");
        }
    }

    @Override
    public String getFavoriteSound() {
        return "Whistle";
    }

    @Override
    public boolean isLoud() {
        return clicksPerSecond > 200;
    }

    public void jump() {
        System.out.println("Leaping out of water!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLengthM() {
        return lengthM;
    }

    public void setLengthM(double lengthM) {
        this.lengthM = lengthM;
    }

    public int getClicksPerSecond() {
        return clicksPerSecond;
    }

    public void setClicksPerSecond(int clicksPerSecond) {
        this.clicksPerSecond = clicksPerSecond;
    }

    public boolean isPerformsTricks() {
        return performsTricks;
    }

    public void setPerformsTricks(boolean performsTricks) {
        this.performsTricks = performsTricks;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + name + '\'' +
                ", lengthM=" + lengthM +
                ", clicksPerSecond=" + clicksPerSecond +
                ", performsTricks=" + performsTricks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dolphin)) return false;
        Dolphin dolphin = (Dolphin) o;
        return Double.compare(dolphin.lengthM, lengthM) == 0 &&
                clicksPerSecond == dolphin.clicksPerSecond &&
                performsTricks == dolphin.performsTricks &&
                name.equals(dolphin.name);
    }
}