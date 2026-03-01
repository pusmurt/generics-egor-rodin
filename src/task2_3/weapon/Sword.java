package task2_3.weapon;

public class Sword implements MeleeWeapon{
    @Override
    public int getDamage() {
        return 15;
    }

    @Override
    public String getWeaponType() {
        return "Меч";
    }
}
