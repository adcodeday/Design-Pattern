package 结构型模式.代理模式.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object obj;
    public MyInvocationHandler(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method execution");
        Object result=method.invoke(proxy,args);
        System.out.println("after method execution");
        return result;
    }
}
