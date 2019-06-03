package cn.yunovo.work.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018/12/18.
 */

public class Test {
    public static void main(String[] args){
        try {
            Class<?> clz = Class.forName(A.class.getName());
            Object o = clz.newInstance();
            Method method = clz.getMethod("foo",String.class);
            for (int i=0;i<15;i++){
                method.invoke(o,String.valueOf(i));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
