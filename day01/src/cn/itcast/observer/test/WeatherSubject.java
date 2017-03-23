package cn.itcast.observer.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2017/3/23.
 * 目标对象  维护观察者
 *
 */
public class WeatherSubject {
    //维护一个观察者集合
    private List<WeatherObserver> observers = new ArrayList<>();

    /**
     * 目标对象 注册 观察者
     * @param observer 传入参数
     */
    public void attach(WeatherObserver observer){
        observers.add(observer);
    }

    /**
     * 目标对象中 移除 制定观察者
     * @param observer
     */
    public void detach(WeatherObserver observer){
        observers.remove(observer);
    }

    /**
     * 通知所有的观察者
     * 推模型
     * 拉模型
     */
    protected void notifyObservers(){
        for (WeatherObserver observer :
                observers) {
            //拉模型   传送数据，观察者根据自己需要获取相应的数据
            observer.update(this);
            //推模型   传输制定数据，目标知道 观察者需要的信息，只传输其需要的数据
           //observer.update(Object o);
        }
    }
}
