package cn.lnlwf.designpatterns.singleton;

import org.junit.Test;

public class SingletonEnumTest {

    @Test
    public void singletonEnumTest(){
        SingletonEnum wangWu = SingletonEnum.WANG_WU;
        System.out.println(wangWu.toString());
    }
}