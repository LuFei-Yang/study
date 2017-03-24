package cn.itcast.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2017/3/23.
 * 目标对象   它知道它的观察者并提供注册（添加）和删除的方法
 */
public class Subject {
    //维护一个Obsever的集合，
    private List<Observer> observers = new ArrayList<>();

    // attach 注册观察者 detach 移除观察者  notifyobserver 向所有观察者发送信息

    /**
     *  实现 注册新的观察者
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 实现 移除指定的观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有的观察者，观察者执行方法
     * 这个方法只能有子类重写，权限修饰符定义为protected
     */
    protected void notifyObservers(){
        for (Observer observer: observers) {
            observer.update(this);
        }
    }
}
