package cn.lnlwf.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonEnumTest {

    @Test
    public void singletonEnumTest(){
        System.out.println(SingletonEnum.INSTANCE);
    }
}