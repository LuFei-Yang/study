package cn.itcast.observer.jdk;

import java.util.Observable;

/**
 * 定义一个具体目标对象
 */
public class ConcreteWeatherSuject2 extends Observable {


    private String dayState;

    public String getDayState() {
        return dayState;
    }

    public void setDayState(String dayState) {
        this.dayState = dayState;
        this.setChanged();
        this.notifyObservers(dayState);
    }
}
