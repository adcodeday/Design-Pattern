package 结构型模式.装饰器模式;

public class Wechat extends NotifierDecorator{
    Wechat(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void notifier() {
        super.notifier();
        System.out.println("微信通知");
    }
}
