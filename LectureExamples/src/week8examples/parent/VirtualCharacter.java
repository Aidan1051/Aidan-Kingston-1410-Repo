package week8examples.parent;

public interface VirtualCharacter {
    public static final double FALL_ACCELERATION = 9.8;
    public static final String FALL_ACCELERATION_UNITS = "meters/second^2";

    public void performSpecialAttack();

    public float calculateDamage();

    public void block(int waitCounter);

    void performSpecialAttack(int attackSeed);

    char getGender();
}
