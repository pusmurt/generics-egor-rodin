package task2_3.hero;

import task2_3.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    @Override
    public String getHeroClass() {
        return "Воин";
    }
}
