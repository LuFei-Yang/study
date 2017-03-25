package cn.itcast.proxy;

/**
 * Created by ASUS on 2017/3/25.
 */
public class StrongeBicyle implements MoveThing {
    public StrongeBicyle(MoveThing moveThing) {
        this.moveThing = moveThing;
    }

    private MoveThing moveThing;

    @Override
    public String move() {
        System.out.println("before");
        moveThing.move();
        System.out.println("after");
        return null;
    }

    @Override
    public void run(int a) {

    }
}
