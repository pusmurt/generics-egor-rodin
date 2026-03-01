package task2_3.weapon;

public class Dagger implements MeleeWeapon {
    @Override
    public int getDamage() {
        return 7;
    }

    @Override
    public String getWeaponType() {
        return "Нож";
    }
}
