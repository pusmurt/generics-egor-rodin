import task2_3.hero.*;
import task2_3.weapon.*;

// Добавил поле "Имя" в класс Hero, чтобы было проще отличать героев во время sout.
// В интерфейс Weapon добавил метод для вывода типа оружия, в класс Hero абстрактный метод для получения класса героя.

public class GameRunner {
    static void main(String[] args) {
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

        equipHeroDagger(rogue, new Dagger());
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

//Не совсем понял задание 3. По логике программы, больше подходит этот закомментированный метод, так как он подходит для уже всех
//созданных героев. Если мы используем синтаксис <? super Weapon>, то нам нужен ПРЕДОК а не наследник weapon, хотя все существующие герои
//работают именно с дочерними классами Weapon. Если смысл был в том, чтобы в принципе опробовать и понять смысл записи, то ок.
//Так же создал новый класс rogue, который наследуется от Weapon, а не от MeleeWeapon, и типизируется Weapon, чтобы
//Продемонстрировать работу метода
//
//    public static <T extends Weapon> void equipHero (Hero <T> hero, T weapon) {
//        hero.setWeapon(weapon);
//    }

    public static void equipHeroDagger (Hero<? super Weapon> hero, Weapon weapon) {
        hero.setWeapon(weapon);
    }

}
