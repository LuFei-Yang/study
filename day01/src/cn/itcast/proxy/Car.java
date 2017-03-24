package cn.itcast.proxy;

/**
 * Created by ASUS on 2017/3/24.
 */
public class Car implements MoveThing {
    @Override
    public String move() {
        System.out.println("car move");
        return "love";
    }

    @Override
    public void run(int a ) {
        System.out.println("run with time"+a);
    }
}
