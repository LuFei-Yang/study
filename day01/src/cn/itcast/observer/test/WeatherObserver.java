package cn.itcast.observer.test;

/**
 * Created by ASUS on 2017/3/23.
 * 定义观察者接口   定义一个方法当目标类发生变化的时候，同步更新观察者的状态
 */
public interface WeatherObserver {

    public void update(WeatherSubject weatherSubject);
}
