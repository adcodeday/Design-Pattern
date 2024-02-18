package 结构型模式.代理模式.静态代理模式;

public class Test {
    public static void main(String[] args) {
        RealSubject realSubject=new RealSubject();
        ProxySubject proxySubject=new ProxySubject();
        proxySubject.setRealsubject(realSubject);
        proxySubject.doingSomething();
    }
}
