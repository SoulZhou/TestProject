package cn.yunovo.test.sailBook;

/**
 * Created by Administrator on 2018/12/18.
 */

public class ProxySubject implements Subject {
    //代理对象含有对真实主题角色的引用
     private Subject subject;

     public ProxySubject(Subject subject){
        this.subject = subject;
    }

    @Override
     public void sailBook() {
        dazhe();
        subject.sailBook();
        give();
     }

    //代理角色通常在将客户端调用传递给真是主题对象之前或者之后执行某些操作，而不是单纯返回真实的对象。
     private void dazhe(){
         System.out.println("打折");
     }
     private void give(){
         System.out.println("赠送代金券");
     }

    @Override
    public void getMoney() {

    }
}
