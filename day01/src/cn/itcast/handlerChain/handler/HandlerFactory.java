package cn.itcast.handlerChain.handler;

/**
 * Created by ASUS on 2017/3/24.
 * handler 工厂， 提供处理器
 */
public class HandlerFactory {
    public static PriceHandler getHandler(){
        //创建多个实现类市里
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler ceo = new Ceo();

        //通过这里的方法形成责任连
        sales.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(ceo);

        //返回责任链的入口对象
        return  sales;
    }
}
