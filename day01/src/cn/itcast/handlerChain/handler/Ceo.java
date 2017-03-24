package cn.itcast.handlerChain.handler;

/**
 * Created by ASUS on 2017/3/24.
 * 老板 处理%50的优惠
 */
public class Ceo extends PriceHandler {
    @Override
    public void processRequest(float price) {
        /**
         * 最终上抛之老板的时候，老板必须处理。不能再上抛
         */
        if (price<= 0.5){
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),price);
        }else {
            System.out.format("%s拒绝折扣：%.2f%n",this.getClass().getName(),price);
        }
    }
}
