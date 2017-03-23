package cn.itcast.observer.test;

/**
 * Created by ASUS on 2017/3/23.
 * 具体目标对象
 * 观察者 观察 天气 ，天气变化 时同步更新 观察者状态
 */
public class ConcreteWeatherSubject extends WeatherSubject {
    //定义一个天气状态
    private String weatherState;

    public String getWeatherState() {
        return weatherState;
    }

    public void setWeatherState(String weatherState) {
        this.weatherState = weatherState;
        this.notifyObservers();
    }
}
