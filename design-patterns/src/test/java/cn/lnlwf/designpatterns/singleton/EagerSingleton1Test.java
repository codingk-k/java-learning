package cn.lnlwf.designpatterns.singleton;

import org.junit.Test;

public class EagerSingleton1Test {

    @Test
    public void eagerSingletonTest() throws InterruptedException {
        Thread t1 = new Thread(() ->{
            System.out.println(EagerSingleton1.INSTANCE);
        });
        Thread t2 = new Thread(() ->{
            System.out.println(EagerSingleton1.INSTANCE);
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("over");
    }
}