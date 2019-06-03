package cn.yunovo.test.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/12/15.
 */

public class DynamicProxyTest {
    public static void main(String[] args){
        Subject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        Subject subject = (Subject) Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},proxySubject);
        subject.visit();
    }
}
