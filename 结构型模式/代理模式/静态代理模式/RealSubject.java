package 结构型模式.代理模式.静态代理模式;

public class RealSubject implements Subject{
    @Override
    public void doingSomething() {
        System.out.println("读取数据");
    }
}
