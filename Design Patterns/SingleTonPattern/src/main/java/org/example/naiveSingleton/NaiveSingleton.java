package org.example.naiveSingleton;

public final class NaiveSingleton {

    public static NaiveSingleton instance;
    public String value;

    private NaiveSingleton(String value) {
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static NaiveSingleton getInstance(String value){
        if(instance == null){
            instance = new NaiveSingleton(value);
        }
        return instance;
    }
}
