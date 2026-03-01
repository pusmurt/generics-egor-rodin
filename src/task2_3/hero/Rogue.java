package task2_3.hero;

import task2_3.weapon.Weapon;

public class Rogue<T extends Weapon> extends Hero<T> {
    @Override
    public String getHeroClass() {
        return "Разбойник";
    }
}
