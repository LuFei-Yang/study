package cn.itcast.handlerChain;

import cn.itcast.handlerChain.handler.PriceHandler;

/**
 * Created by ASUS on 2017/3/24.
 * 客户端  发送请求
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void sendRequset(float price){
        priceHandler.processRequest(price);
    }
}
