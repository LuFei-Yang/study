package cn.itcast.Strategy;

/**
 * Created by ASUS on 2017/3/25.
 * 客户端
 */
public class Client {
    private Pay pay;

    public Client(Pay pay) {
        this.pay = pay;
    }

    public void payMoney(float money){
        pay.payMoney(money);
    }
}
