package cn.itcast.handlerChain.handler;

/**
 * Created by ASUS on 2017/3/24.
 * 销售业务员 处理%5的优惠
 */
public class Sales extends PriceHandler {
    @Override
    public void processRequest(float price) {
        /**
         * 如果业务员能够处理优惠，就处理。无法处理时将请求上抛至父类
         */
        if (price<= 0.05){
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),price);
        }else {
            successor.processRequest(price);
        }
    }
}
