package cn.lnlwf.designpatterns.singleton;

import org.junit.Test;

public class SingletonEnumTest {

    @Test
    public void singletonEnumTest(){
        System.out.println(SingletonEnum.INSTANCE);
    }
}