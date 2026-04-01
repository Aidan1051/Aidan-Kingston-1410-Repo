//package week8examples.children;
//
//import week8examples.parent.VirtualCharacter;
//
//import java.util.Objects;
//
//public class Brawler implements VirtualCharacter {
//    private float health;
//    private String name;
//    private int skinType;
//
//    public Brawler(float health, String name) {
//        this.health = health;
//        this.name = name;
//    }
//
//    public float massAttack() {
//        return 2 * health;
//    }
//
//
//
//    @Override
//    public void performSpecialAttack(int attackSeed) {
//        System.out.println("I hit you with this attack speed: " + attackSeed);
//    }
//
//    @Override
//    public void performSpecialAttack() {
//
//    }
//
//    @Override
//    public float calculateDamage() {
//        return 100;
//    }
//
//
//    @Override
//    public void block(int waitCounter) {
//        System.out.println("I hit you with this block speed: " + waitCounter);
//    }
//
//    public Brawler(float health, String name, int skinType) {
//        this.health = health;
//        this.name = name;
//        this.skinType = skinType;
//    }
//
//    public float getHealth() {
//        return health;
//    }
//
//    public void setHealth(float health) {
//        this.health = health;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getSkinType() {
//        return skinType;
//    }
//
//    public void setSkinType(int skinType) {
//        this.skinType = skinType;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Brawler brawler = (Brawler) o;
//        return Float.compare(health, brawler.health) == 0 && skinType == brawler.skinType && Objects.equals(name, brawler.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(health, name, skinType);
//    }
//
//    @Override
//    public String toString() {
//        return "Brawler{" +
//                "health=" + health +
//                ", name='" + name + '\'' +
//                ", skinType=" + skinType +
//                '}';
//    }
//}
