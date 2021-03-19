package cn.lnlwf.designpatterns.singleton;

/**
 * 饿汉式：
 * 枚举表示对象是有限的，可以限制为一个即为单例
 * @author liuning
 * @date 2020/7/11.
 * @email 24333389385@qq.com
 */
public enum  SingletonEnum {
    /**
     * 用户
     */
    WANG_WU("王五","男","北京");

    private String name, sex,address;

    private SingletonEnum(String name, String sex, String address) {
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

    @Override
    public String toString() {
        return "SingletonEnum{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
