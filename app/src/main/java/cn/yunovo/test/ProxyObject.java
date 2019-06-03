package cn.yunovo.test;

/**
 * Created by Administrator on 2018/12/15.
 */

public class ProxyObject extends AbstractObject {
    private RealObject realObject;

    public ProxyObject(RealObject realObject){
        this.realObject = realObject;
    }

    @Override
    protected void operation() {
        System.out.println("do something before real peration...");

        if(realObject == null){
             realObject = new RealObject();
        }
        realObject.operation();
       System.out.println("do something after real operation...");
    }
}
