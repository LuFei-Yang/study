package cn.itcast.singleton;

/**
 * 单例模式之懒汉模式
 *  在类加载的时候会初始化静态的成员变量，在访问提问的方法的时候判断是否已经实例化。如果没有就进行实例化，
 *
 */
public class Singleton2 {
    //私有化构造器，不允许外部通过构造器创建实例
    private Singleton2(){};
    //创建类的变量
    private static Singleton2 singleton2;
    //对外提供访问方法 --获取唯一 的实例
    public static Singleton2 getInstance(){
       /* 在此处可能出现线程不安全的问题
            因为此处是设计  查询-判断-处理
                这是一组操作，涉及到执行的原子性，*/

        //第一次需要创建实例的时候，变量singleton是null，给变量进行赋值，
        if(singleton2 == null){
            //正确的写法
            singleton2 = new Singleton2();
           /* 错误的写法 每次都创建新的实例，
            return new Singleton2();*/
        }
        //返回类的实例
        return singleton2;
    }
}
