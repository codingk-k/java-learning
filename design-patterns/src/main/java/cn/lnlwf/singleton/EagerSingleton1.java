package cn.lnlwf.singleton;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 饿汉式：
 * 直接创建实例对象，不管需不需要都会创建
 * 1）构造器私有化
 * 2）自行创建用，用静态变量保存
 * 3）向外提供这个实例
 * 4）强调单例可以用final修饰
 * 5）静态代码块创建对象可以加载配置，读取配置文件的数据来初始化生成单例对象
 * @author liuning
 * @date 2020/7/11.
 * @email 24333389385@qq.com
 */
public class EagerSingleton1 {

    public static final EagerSingleton1 INSTANCE;
    private final String name;

    public String getName() {
        return name;
    }

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("singleton");
        String name = bundle.getString("name");
//        Properties properties = new Properties();
//        try {
//            properties.load(Resource.class.getClassLoader().getResourceAsStream("singleton"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String name = properties.getProperty("name");
        INSTANCE = new EagerSingleton1(name);
    }

    private EagerSingleton1(String name){
        this.name = name;
    }
}
