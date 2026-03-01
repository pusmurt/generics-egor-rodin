package task2_3.weapon;

public class Bow implements RangedWeapon {
    @Override
    public int getDamage() {
        return 10;
    }

    @Override
    public String getWeaponType() {
        return "Лук";
    }
}
