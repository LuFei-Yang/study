package cn.itcast.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by ASUS on 2017/3/23.
 * 创建观察者  实现JDK的observer接口，重写update方法，实现
 */
public class ConcreteWeahterObserver implements Observer {

    private String observerState;

    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(Observable o, Object arg) {
        //observerState = ((ConcreteWeatherSuject) o).getWeatherState();
        observerState = (String )arg;
        System.out.println(observerName+"======================"+observerState);
    }
}
