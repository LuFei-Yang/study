package cn.itcast.observer;

/**
 * Created by ASUS on 2017/3/23.
 * 具体的观察者 实现更新接口，使得自身的状态和目标对象状态一致
 */
public class ConcreteObserver implements Observer {
    //定义一个观察者对象状态
    private String obseverState;

    /**
     * 实现同步更新 观察者状态
     * @param subject 传入参数，指向状态发生变化的具体目标对象  方便获取目标状态
     */
    @Override
    public void update(Subject subject) {
        obseverState = ((ConcreteSubject) subject).getSubjectState();
    } }
