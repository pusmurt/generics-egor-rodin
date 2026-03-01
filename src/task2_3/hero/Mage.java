package task2_3.hero;

import task2_3.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {
    @Override
    public String getHeroClass() {
        return "Маг";
    }
}
