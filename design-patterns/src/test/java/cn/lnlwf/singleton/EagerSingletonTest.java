package cn.lnlwf.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class EagerSingletonTest {

    @Test
    public void eagerSingletonTest(){
        EagerSingleton a = EagerSingleton.INSTANCE;
        System.out.println(a.getName());
    }
}