package children;

import parent.CanMakeSound;

public class Parrot implements CanMakeSound {

    private String name;
    private int vocabularySize;
    private String featherColor;
    private boolean talksToHumans;

    public Parrot(String name, int vocabularySize, String featherColor, boolean talksToHumans) {
        this.name = name;
        this.vocabularySize = vocabularySize;
        this.featherColor = featherColor;
        this.talksToHumans = talksToHumans;
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk! Hello!");
    }

    @Override
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Squawk!");
        }
    }

    @Override
    public String getFavoriteSound() {
        return "Pretty bird!";
    }

    @Override
    public boolean isLoud() {
        return vocabularySize > 30;
    }

    public void mimicPhone() {
        System.out.println("Ring ring! Hello?");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVocabularySize() {
        return vocabularySize;
    }

    public void setVocabularySize(int vocabularySize) {
        this.vocabularySize = vocabularySize;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public boolean isTalksToHumans() {
        return talksToHumans;
    }

    public void setTalksToHumans(boolean talksToHumans) {
        this.talksToHumans = talksToHumans;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", vocabularySize=" + vocabularySize +
                ", featherColor='" + featherColor + '\'' +
                ", talksToHumans=" + talksToHumans +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Parrot)) return false;
        Parrot parrot = (Parrot) o;
        return vocabularySize == parrot.vocabularySize &&
                talksToHumans == parrot.talksToHumans &&
                name.equals(parrot.name) &&
                featherColor.equals(parrot.featherColor);
    }
}