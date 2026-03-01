package task1;

import java.io.PrintStream;

public class Pair<K,V> {
    private K key;
    private V value;

    public Pair (K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public void setFirst(K key) {
        this.key = key;
    }

    public V getSecond() {
        return value;
    }

    public void setSecond(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Пара" +
                "{Ключ=" + key +
                ", значение=" + value +
                '}';
    }

}
