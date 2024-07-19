package org.example.singleThreadedNaive;

public class ClientCode {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("NaiveSingleton Pattern");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
