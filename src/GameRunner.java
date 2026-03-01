import task2_3.hero.*;
import task2_3.weapon.*;

public class GameRunner {
    static void main() {
        Archer<Bow> archer = new Archer<>();
        archer.setWeapon(new Bow());
        archer.setName("Иван-Меткий-Глаз");

        Mage<Wand> mage = new Mage<>();
        mage.setWeapon(new Wand());
        mage.setName("Иван-Острый-Ум");

        Warrior<Sword> warrior = new Warrior<>();
        warrior.setWeapon(new Sword());
        warrior.setName("Иван-Мощь-Гор");

        Rogue<Weapon> rogue = new Rogue<>();
        rogue.setName("Иван-Гроза-Тернистой-Долины");

        getHeroInfo(archer);
        getHeroInfo(mage);
        getHeroInfo(warrior);

        equipHeroDagger(rogue);
        getHeroInfo(rogue);
        equipHeroSword(rogue);
        getHeroInfo(rogue);

    }

//    public static <T extends Weapon> void getWeaponDamage(Hero<T> hero) {
//        System.out.println(hero.getWeapon().getDamage());
//    }

    public static void getHeroInfo(Hero<? extends Weapon> hero) {
        System.out.printf("Информация о герое: [%s] " +
                "Класс героя: [%s] " +
                "Герой экипирован оружием: [%s] " +
                "Урон героя с текущим оружием: [%s]\n", hero.getName(), hero.getHeroClass(), hero.getWeapon().getWeaponType(), hero.getWeapon().getDamage());
    }

    public static void equipHeroDagger(Hero<? super Weapon> hero) {
        hero.setWeapon(new Dagger());
    }

    public static void equipHeroSword(Hero<? super Weapon> hero) {
        hero.setWeapon(new Sword());
    }
}
