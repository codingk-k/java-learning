package cn.lnlwf.designpatterns.singleton;


import org.junit.Test;

import java.util.concurrent.*;

public class InnerStaticClassSingletonTest{

    @Test
    public void innerStaticClassSingletonTest() throws ExecutionException, InterruptedException {
        Callable<InnerStaticClassSingleton> cb = InnerStaticClassSingleton::getInstance;
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<InnerStaticClassSingleton> a1 = es.submit(cb);
        Future<InnerStaticClassSingleton> a2 = es.submit(cb);
        InnerStaticClassSingleton s1 = a1.get();
        InnerStaticClassSingleton s2 = a2.get();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}