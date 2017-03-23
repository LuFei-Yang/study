package cn.observer;

/**
 * Created by ASUS on 2017/3/23.
 * 具体的目标对象 把有关状态存到相对象的观察者对象中
 */
public class ConcreteSubject extends  Subject {

    // 目标对象状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    /**
     * 更新具体目标状态的时候 通知所有的观察者
     * @param subjectState
     */
    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
