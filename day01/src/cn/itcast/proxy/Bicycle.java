package cn.itcast.proxy;

/**
 * Created by ASUS on 2017/3/25.
 */
public class Bicycle implements MoveThing {
    @Override
    public String move() {
        System.out.println("bicyle is run ");
        return null;
    }

    @Override
    public void run(int a) {

    }
}
