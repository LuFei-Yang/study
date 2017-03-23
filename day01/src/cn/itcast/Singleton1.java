package cn.itcast;

/**
 * 单例模式之饿汉模式
 * 为何称为饿汉模式
 *       静态的成员变量，在类加载的时候，就会创建唯一的实例。
 */
public class Singleton1 {
    //私有化构造器，不允许外部通过构造器创建实例
    private Singleton1(){};
    //创建类的唯一实例
    private static Singleton1 singleton1 = new Singleton1();
    //对外提供访问方法
    public static Singleton1 getInstance(){
        return singleton1;
    }
}
