package cn.lnlwf.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class EagerSingleton1Test {

    @Test
    public void eagerSingletonTest(){
        EagerSingleton1 instance = EagerSingleton1.INSTANCE;
        System.out.println(instance.getName());
    }
}