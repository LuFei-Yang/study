package cn.itcast.proxy;

/**
 * Created by ASUS on 2017/3/24.
 * JDK动态代理应用
 */
public class Test {
    public static void main(String[] args){
      //被代理对象
        Car car = new Car();
        //事务管理器，内部实现需要增强的方法
    /*      TimeHandler timeHandler = new TimeHandler(car);
        //TimeHandler timeHandler = new TimeHandler();
        //创建代理对象
        MoveThing m = (MoveThing) Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), timeHandler);
        String move = m.move();
        System.out.println(move);
        m.run(5);*/
        Bicycle bicycle = new Bicycle();
        StrongeBicyle strongeBicyle = new StrongeBicyle(bicycle);
        strongeBicyle.move();

    }
}
