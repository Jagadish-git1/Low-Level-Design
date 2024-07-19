package org.example.singleThreadedNaive;

public final class Singleton {

    public static Singleton instance;
    public String value;

    private Singleton(String value) throws InterruptedException {
        Thread.sleep(1000);
        this.value = value;
    }

    public static Singleton getInstance(String value) throws InterruptedException {
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
