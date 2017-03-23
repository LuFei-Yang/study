package cn.itcast;

/**
 * 单例模式学习
 * 饿汉模式与懒汉模式对比
 *      饿汉模式 是在类加载的时候创建对象，因此类的加载速度慢 ，而且是线程不安全的，
 *      懒汉模式 在类加载的时候创建变量，在需要的时候会创建实例，这样加载速度快。线程不安全，
 */
public class Day01_01 {
   public static void main(String[] args){
       //饿汉模式
       Singleton1 instance = Singleton1.getInstance();
       Singleton1 instance1 = Singleton1.getInstance();
       System.out.println(instance == instance1);
       //懒汉模式
       Singleton2 instance2 = Singleton2.getInstance();
       Singleton2 instance3 = Singleton2.getInstance();
       System.out.println(instance2 == instance3);
   }
}
