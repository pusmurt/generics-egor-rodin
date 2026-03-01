package task2_3.hero;

import task2_3.weapon.RangedWeapon;

public class Archer<T extends RangedWeapon> extends Hero<T>{
    @Override
    public String getHeroClass() {
        return "Лучник";
    }
}
