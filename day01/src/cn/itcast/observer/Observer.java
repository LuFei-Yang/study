package cn.itcast.observer;

/**
 * Created by ASUS on 2017/3/23.
 * 观察者接口，定义一个更新接口 给那些在目标对象状态发生变化时通知的所有对象
 */
public interface Observer {

    /**
     * 更新接口
     * @param subject 传入参数，指向状态发生变化的具体目标对象  方便获取目标状态
     */
   public void update(Subject subject);
}
