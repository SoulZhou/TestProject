package cn.yunovo.test;

/**
 * Created by Administrator on 2018/12/15.
 */

public class ProxyTest {
    public static void main(String[] args){
        AbstractObject proxy = new ProxyObject(new RealObject());
        proxy.operation();
    }
}
