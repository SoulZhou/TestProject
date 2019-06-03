package cn.yunovo.test.buycar;

/**
 * Created by Administrator on 2018/12/17.
 */

public class Customer implements IBuyCar {
    private int cash;//购车款

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public void buyCar() {
        System.out.println("买一辆车花费了-->" + cash + "元");
    }
}
