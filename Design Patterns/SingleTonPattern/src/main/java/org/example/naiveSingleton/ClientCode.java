package org.example.naiveSingleton;

public class ClientCode {
    public static void main(String[] args) {
        System.out.println("NaiveSingleton Pattern");
        NaiveSingleton singleton = NaiveSingleton.getInstance("FOO");
        NaiveSingleton anotherSingleton = NaiveSingleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
