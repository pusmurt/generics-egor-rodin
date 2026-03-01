import task1.*;

import java.util.Arrays;

public class PairRunner {
    static void main() {
        int count = 1;

        Pair<String, Integer> pair1 = new Pair<>("Стринговый ключ",22);
        Pair<Integer, String> pair2 = new Pair<>(11,"Стринговое значение");
        Pair<Double, Boolean> pair3 = new Pair<>(10.135,true);

        System.out.println("Работа класса Pair с различными типами данных:");
        System.out.println("#1 " + pair1);
        System.out.println("#2 " + pair2);
        System.out.println("#3 " + pair3 + "\n");

        System.out.println("Работа класса Pair с массивом:");
        Pair<String, Integer> pair4 = new Pair<>("Стринговый ключ",15);
        Pair<String, Integer> pair5 = new Pair<>("Стринговый ключ",25);
        Pair<String, Integer>[] pairs = new Pair [2];
        pairs[0] = pair4;
        pairs[1] = pair5;
        System.out.println(Arrays.toString(pairs)+"\n");

        System.out.println("Работа класса Pair с коллекцией:");
        java.util.ArrayList<Pair<String, Double>> list1 = new java.util.ArrayList<>();
        list1.add(new Pair<>("Пи", 3.1415));
        list1.add(new Pair<>("e", 2.71828));
        for (Pair<String, Double> pair : list1) {
            System.out.println("#" + count + " " + pair);
            count++;
        }
        System.out.println(list1+"\n");

        System.out.println("Работа класса Pair с его же геттерами и сеттерами:");
        Pair<String, Integer> pair6 = new Pair<>("Стринговый ключ",22);
        System.out.println("Пара до изменения: " + pair6);
        pair6.setFirst(pair6.getFirst() + " изменён через метод класса");
        pair6.setSecond(pair6.getSecond()*2);
        System.out.println("Пара после изменения: " + pair6);

    }
}
