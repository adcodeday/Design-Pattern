package 结构型模式.装饰器模式;

abstract public class NotifierDecorator implements Notifier{
    private Notifier notifier;
    NotifierDecorator(Notifier notifier){this.notifier=notifier;}
    @Override
    public void notifier(){
        notifier.notifier();
    }
}
