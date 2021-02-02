

package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService ex = Executors.newSingleThreadExecutor();

        // Executor service, submit method
        ex.submit(new RunClass());
        ex.submit(new RunClass());
        ex.submit(new RunClass());

        // My method
        runOneByOne(new RunClass());
        runOneByOne(new RunClass());
        runOneByOne(new RunClass());


    }
    public static void runOneByOne(Runnable r) throws InterruptedException {

        Thread t = new Thread(r);
        t.start();
        t.join();
    }
}
