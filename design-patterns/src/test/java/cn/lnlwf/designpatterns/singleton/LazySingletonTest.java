package cn.lnlwf.designpatterns.singleton;

import org.junit.Test;

import java.util.concurrent.*;

public class LazySingletonTest{

    @Test
    public void lazySingletonTest() throws ExecutionException, InterruptedException {
        Callable<LazySingleton> cb = LazySingleton::getInstance;
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<LazySingleton> a1 = es.submit(cb);
        Future<LazySingleton> a2 = es.submit(cb);
        LazySingleton s1 = a1.get();
        LazySingleton s2 = a2.get();
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}