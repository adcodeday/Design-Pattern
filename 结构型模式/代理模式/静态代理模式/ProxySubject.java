package 结构型模式.代理模式.静态代理模式;

public class ProxySubject implements Subject{
    public void setRealsubject(Subject realsubject) {
        this.realsubject = realsubject;
    }
    Subject realsubject;
    @Override
    public void doingSomething() {
        System.out.println("链接数据库");
        realsubject.doingSomething();
        System.out.println("断开数据库");
    }
}
