package cn.lnlwf.designpatterns.singleton;

import java.util.ResourceBundle;

/**
 * 懒汉式：
 * 什么时候用到什么时候初始化对象
 * 1）构造器私有化
 * 2）静态变量保存这个实例
 * 3）是线程不安全的（需要同步代码）
 * 3）提供一个public静态方法获取这个实例
 * @author liuning
 * @date 2020/7/11.
 * @email 24333389385@qq.com
 */
public class LazySingleton {
    private static volatile LazySingleton lazySingleton;
    private final String name;

    public String getName() {
        return name;
    }

    private LazySingleton(){
        ResourceBundle bundle = ResourceBundle.getBundle("singleton");
        String name = bundle.getString("name");
        this.name = name;
    }
    public static LazySingleton getInstance() {
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
