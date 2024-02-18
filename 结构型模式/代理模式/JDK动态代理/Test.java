package 结构型模式.代理模式.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Hello hello=new HelloWorld();
        InvocationHandler handler=new MyInvocationHandler(hello);
        Hello proxyHello=(Hello) Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(),
                handler
        );
        proxyHello.greet();
    }
}
