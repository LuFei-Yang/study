package cn.itcast.Strategy;

/**
 * Created by ASUS on 2017/3/25.
 */
public class Test {
    public static void main(String[] args){
        Client client = new Client(new GongShangBank());
        client.payMoney(200);
    }
}
