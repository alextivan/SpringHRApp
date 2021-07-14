package com.company.creational.singleton;

public class Counter {

    private static Counter instance;
    private int count;
    private Counter() {
    }

    public static Counter getInstance(){
        if(instance == null){
            instance = new Counter();
        }
        return instance;
    }

    public void incrementCount(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
