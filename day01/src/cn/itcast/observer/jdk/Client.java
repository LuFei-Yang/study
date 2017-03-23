package cn.itcast.observer.jdk;

/**
 * Created by ASUS on 2017/3/23.
 */
public class Client {
    public static void main(String[] args){
        ConcreteWeatherSuject suject = new ConcreteWeatherSuject();
        ConcreteWeatherSuject2 suject2 = new ConcreteWeatherSuject2();
        ConcreteWeahterObserver girl = new ConcreteWeahterObserver();
       // ConcreteWeahterObserver mum = new ConcreteWeahterObserver();
        girl.setObserverName("tom");
       // mum.setObserverName("mum");

        suject2.addObserver(girl);
        suject.addObserver(girl);
      //  suject.addObserver(mum);

        suject.setWeatherState("this is a change");
        suject2.setDayState("today is fourthy");


    }
}
