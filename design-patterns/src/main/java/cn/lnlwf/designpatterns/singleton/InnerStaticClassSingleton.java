package cn.lnlwf.designpatterns.singleton;

import java.util.ResourceBundle;

/**
 * 懒汉式：
 * 1）静态内部类不会随着外边的类的初始化而初始化
 * 2）线程安全的
 * 3）提供静态方法初始化静态内部类
 * @author liuning
 * @date 2020/7/13.
 * @email 24333389385@qq.com
 */
public class InnerStaticClassSingleton {
    private final String name;
    private InnerStaticClassSingleton(){
        ResourceBundle bundle = ResourceBundle.getBundle("singleton");
        this.name = bundle.getString("name");
    }

    private static class Inner{
        private static final InnerStaticClassSingleton INSTANCE = new InnerStaticClassSingleton();
    }

    public static InnerStaticClassSingleton getInstance(){
        return Inner.INSTANCE;
    }
}
