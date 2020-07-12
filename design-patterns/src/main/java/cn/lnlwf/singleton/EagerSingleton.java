package cn.lnlwf.singleton;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * 饿汉式：
 * 直接创建实例对象，不管需不需要都会创建
 * 1）构造器私有化
 * 2）自行创建用，用静态变量保存
 * 3）向外提供这个实例
 * 4）强调单例可以用final修饰
 * @author liuning
 * @date 2020/7/11.
 * @email 24333389385@qq.com
 */
public class EagerSingleton {
    public static final EagerSingleton INSTANCE = new EagerSingleton();
    private final String name;

    public String getName(){
        return this.name;
    }

    private EagerSingleton(){
        this.name = "codekk";
    }
}
