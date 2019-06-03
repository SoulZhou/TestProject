package cn.yunovo.test.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/12/15.
 */

public class ProxySubject implements InvocationHandler {
    private Object object;

    public ProxySubject(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        return result;
    }
}
