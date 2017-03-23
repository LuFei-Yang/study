package cn.itcast.observer.test;

/**
 * Created by ASUS on 2017/3/23.
 */
public class Client {
    public static void main(String[] args){
        //创建具体目标类
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        //创建观察者
        ConcreteWeatherObserver girl = new ConcreteWeatherObserver();
        ConcreteWeatherObserver mum = new ConcreteWeatherObserver();
        girl.setObserverName("lucy");
        mum.setObserverName("mum");

        subject.attach(girl);
        subject.attach(mum);

        subject.setWeatherState("天气晴朗");
    }
}
