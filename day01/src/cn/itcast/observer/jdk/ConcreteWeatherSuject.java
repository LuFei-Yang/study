package cn.itcast.observer.jdk;

import java.util.Observable;

/**
 * Created by ASUS on 2017/3/23.
 */
public class ConcreteWeatherSuject extends Observable {


    private String weatherState;

    public String getWeatherState() {
        return weatherState;
    }

    public void setWeatherState(String weatherState) {

        this.weatherState = weatherState;
        this.setChanged();
        this.notifyObservers(weatherState);
    }
}
