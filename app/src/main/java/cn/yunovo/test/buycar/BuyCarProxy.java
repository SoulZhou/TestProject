package cn.yunovo.test.buycar;

/**
 * Created by Administrator on 2018/12/17.
 */

public class BuyCarProxy implements IBuyCar {
    private Customer customer;//接收买车客户

    public BuyCarProxy(Customer customer){
        this.customer=customer;//接收买车客户
    }

    @Override
    public void buyCar() {//实现为客户买车
//        customer.buyCar();
        int cash=customer.getCash();
        if(cash<100000){
            System.out.println("你的钱不够买一辆车");
            return;
        }
        customer.buyCar();
    }
}
