package children;

import parent.CanMakeSound;

public class Snake implements CanMakeSound {

    private String species;
    private double lengthCm;
    private boolean isVenomous;
    private String primaryColor;

    public Snake(String species, double lengthCm, boolean isVenomous, String primaryColor) {
        this.species = species;
        this.lengthCm = lengthCm;
        this.isVenomous = isVenomous;
        this.primaryColor = primaryColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Hssssssss...");
    }

    @Override
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hiss!");
        }
    }

    @Override
    public String getFavoriteSound() {
        return "Hiss";
    }

    @Override
    public boolean isLoud() {
        return false;
    }

    public void shedSkin() {
        System.out.println("Shedding old skin...");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getLengthCm() {
        return lengthCm;
    }

    public void setLengthCm(double lengthCm) {
        this.lengthCm = lengthCm;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "species='" + species + '\'' +
                ", lengthCm=" + lengthCm +
                ", isVenomous=" + isVenomous +
                ", primaryColor='" + primaryColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snake)) return false;
        Snake snake = (Snake) o;
        return Double.compare(snake.lengthCm, lengthCm) == 0 &&
                isVenomous == snake.isVenomous &&
                species.equals(snake.species) &&
                primaryColor.equals(snake.primaryColor);
    }
}