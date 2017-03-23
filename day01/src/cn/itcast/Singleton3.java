package cn.itcast;

/**
 * 双重校验
 */
public class Singleton3 {
    //私有构造器
    private Singleton3(){}
    //volatile 修饰符 线程读取堆内存中的最新的值
    private static volatile Singleton3 singleton3;

    public static Singleton3 getInstace(){
        if (singleton3 == null){
            synchronized (Singleton3.class){
                if (singleton3 == null){
                    singleton3 = new Singleton3();
                }
            }
        }
        return  singleton3;
    }
}
