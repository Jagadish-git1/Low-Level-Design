package org.example.multiThreadedNaive;

public class ClientCode{
    public static void main(String[] args) {
        System.out.println("MultiThreaded Naive singleton");
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

     static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            try {
                Singleton singleton = Singleton.getInstance("Foo");
                System.out.println(singleton.value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class ThreadBar implements Runnable{

        @Override
        public void run() {
            try {
                Singleton singleton = Singleton.getInstance("Bar");
                System.out.println(singleton.value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
