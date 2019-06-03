package cn.yunovo.test.sailBook;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2018/12/18.
 */

public class MainClass {
    /*public static void main(String[] args){
        JustSailBook sailBook = new JustSailBook();
        JustSailBook proxy = (JustSailBook) new ProxyFactory(sailBook).getProxyInstance();
        proxy.sailBook();
    }*/

   public static void main(String[] args){
       Subject realSubject = new RealSubject();
       MyHandler myHandler = new MyHandler(realSubject);
       System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
       Class<?>[] clz = realSubject.getClass().getInterfaces();
       int length = clz.length;
       System.out.println("length = "+length);
       for (Class clss : clz){
           System.out.println(""+clss.getName());
       }
       System.out.println(""+ Proxy.getProxyClass(Subject.class.getClassLoader(),clz));
       //创建代理对象实例
       Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),clz, myHandler);
       System.out.println(""+proxySubject.getClass().getName());

       //
       proxySubject.sailBook();


       //
       proxySubject.getMoney();
   }

//   privat void
    /*public static void createProxyClassFile()
    {
        String name = "ProxySubject";
        byte[] data = ProxyGenerator.generateProxyClass( name, new Class[] { Subject.class } );
        try
        {
            FileOutputStream out = new FileOutputStream( name + ".class" );
            out.write( data );
            out.close();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }*/
}




    /*public static void main(String[] args){
        Subject realSubject = new RealSubject();
        Subject proxySubject = new ProxySubject(realSubject);
        proxySubject.sailBook();
    }*/

 /*public static void main(String[] args){
        Subject realSubject = new RealSubject();
        realSubject.sailBook();
    }*/