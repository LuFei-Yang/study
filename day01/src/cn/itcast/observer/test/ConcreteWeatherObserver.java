package cn.itcast.observer.test;

/**
 * Created by ASUS on 2017/3/23.
 * 根据具体目标对象变化，完成同步更新 观察者状态
 */
public class ConcreteWeatherObserver implements WeatherObserver{

    private String observerState;

    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    /**
     * 实现 同步更新 观察者 状态
     * @param weatherSubject
     */
    @Override
    public void update(WeatherSubject weatherSubject) {
        observerState= ((ConcreteWeatherSubject)weatherSubject).getWeatherState();
        System.out.println(observerName+" - 在 - "+observerState);
    }
}
