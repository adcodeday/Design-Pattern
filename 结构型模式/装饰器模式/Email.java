package 结构型模式.装饰器模式;

public class Email implements Notifier{
    @Override
    public void notifier() {
        System.out.println("邮箱通知");
    }
}
