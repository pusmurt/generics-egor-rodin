package task2_3.hero;

import task2_3.weapon.Weapon;

public abstract class Hero<T extends Weapon> {
    private T weapon;
    private String name;

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getHeroClass();
}
