package cn.yunovo.test.sailBook;

/**
 * Created by Administrator on 2018/12/18.
 */

public class RealSubject implements Subject {
    @Override
    public void sailBook() {
        System.out.println("卖书");
    }

    @Override
    public void getMoney() {
        System.out.println(" 100 ");
    }
}
