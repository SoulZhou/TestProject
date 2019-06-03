package cn.yunovo.test.dynamic;

/**
 * Created by Administrator on 2018/12/15.
 */

public class RealSubject implements Subject {
    @Override
    public void visit() {
        System.out.println("do RealSubject visit ----------");
    }
}
