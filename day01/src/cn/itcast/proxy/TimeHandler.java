package cn.itcast.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ASUS on 2017/3/24.
 * 创建事物管理器  内部实现增强的逻辑
 */
public class TimeHandler implements InvocationHandler {

   //被代理类
    private  Object object;

    //构造器，将被代理类传入进来，
    public TimeHandler(Object object) {
        this.object = object;
    }

    /**
     *  实现方法增强的逻辑
     * @param proxy 被代理类
     * @param method 被代理对象的方法对象
     * @param args 方法的参数
     * @return  可以返回方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {



        System.out.println("before");//方法前增强

        Object invoke = method.invoke(object,args);//执行方法

        System.out.println("after");//方法后增强

        return invoke;
    }
}
