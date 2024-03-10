package 结构型模式.装饰器模式;

public class Test {
    public static void main(String[] args) {
        Notifier notifier=new Email();
        notifier=new QQ(notifier);
        notifier=new Wechat(notifier);
        notifier.notifier();
    }
}
