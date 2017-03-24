package cn.itcast.handlerChain;

/**
 * Created by ASUS on 2017/3/24.
 * 测试 责任链模式
 */
public class Test {
    public static void main(String[] args){
        //创建客户
       /* Customer customer = new Customer();
        customer.setPriceHandler(HandlerFactory.getHandler());

        Random random= new Random();

        for (int i=1;i<20;i++){
            customer.sendRequset(random.nextFloat());
        }*/
        String property = System.getProperty("user.dir");
        System.out.println(property);

    }
}
