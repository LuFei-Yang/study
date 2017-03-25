package cn.itcast.Strategy;

/**
 * Created by ASUS on 2017/3/25.
 */
public class GongShangBank implements Pay {
    @Override
    public void payMoney(float money) {
        System.out.println("工商银行支付了"+money);
    }
}
