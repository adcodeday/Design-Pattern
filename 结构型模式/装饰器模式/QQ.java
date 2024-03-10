package 结构型模式.装饰器模式;

public class QQ extends NotifierDecorator{

    QQ(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notifier() {
        super.notifier();
        System.out.println("QQ通知");
    }
}
