package cn.itcast.Strategy;

/**
 * Created by ASUS on 2017/3/25.
 */
public class ZhanShangBank implements  Pay {
    @Override
    public void payMoney(float money) {
        System.out.println("招商银行付了"+money);
    }
}
