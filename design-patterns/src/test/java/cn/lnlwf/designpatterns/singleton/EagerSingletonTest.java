package cn.lnlwf.designpatterns.singleton;

import org.junit.Test;

import java.util.concurrent.Callable;

public class EagerSingletonTest {

    @Test
    public void eagerSingletonTest() throws InterruptedException {
        Thread s1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(EagerSingleton.INSTANCE);
            }
        });
        Thread s2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(EagerSingleton.INSTANCE);
            }
        });
        s1.start();
        s2.start();
        s1.join();
        s2.join();
        System.out.println("over");
    }
}