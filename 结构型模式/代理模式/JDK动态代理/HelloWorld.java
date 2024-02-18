package 结构型模式.代理模式.JDK动态代理;

public class HelloWorld implements Hello{
    @Override
    public void greet() {
        System.out.println("HelloWorld");
    }
}
