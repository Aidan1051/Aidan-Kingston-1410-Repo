package parent;

public interface CanMakeSound {

    String DEFAULT_SOUND_VOLUME = "medium";

    void makeSound();
    void makeSound(int times);
    String getFavoriteSound();
    boolean isLoud();
}