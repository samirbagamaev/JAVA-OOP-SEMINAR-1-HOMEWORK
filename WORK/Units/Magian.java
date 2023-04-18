package WORK.Units;

public class Magian extends Hero{ // герои с магическими способностями
    protected int mana;
    protected int maxMana;
    protected int accuracy;
    protected int field;

    public Magian(String name, int health, int[] damage, int armor, int mana, int accuracy, int field) {
        super(name, health, damage, armor);
        this.mana = mana;
        this.maxMana = mana;
        this.accuracy = accuracy;
        this.field = field;
    }

}