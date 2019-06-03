package cn.yunovo.test.sailBook;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/12/18.
 */

public class MyHandler implements InvocationHandler {
    //这里也需要传入被代理对象
    private Subject subject;

    public MyHandler(Subject subject){
        this.subject = subject;
    }

    //这个方法中就是代理对象要执行的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        dazhe();
        //执行被代理对象中的方法
        Object result = method.invoke(subject, args);
        give();
        return result;
    }
    public void dazhe() {
        System.out.println("打折");
    }

    public void give() {
        System.out.println("赠送代金券");
    }
}
