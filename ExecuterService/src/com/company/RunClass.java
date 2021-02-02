package com.company;


public class RunClass implements Runnable{
    @Override
    public void run(){
        try {
            System.out.println("wait...");
            Thread.sleep(2000);
            System.out.println("done: ");
        } catch (InterruptedException e) {}
    }

}
