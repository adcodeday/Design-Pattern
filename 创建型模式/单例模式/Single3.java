package 创建型模式.单例模式;
//静态内部类实现单例模式
public class Single3 {
    private Single3(){}
    static private class Holder{//利用java类加载机制(java类加载是线程安全的)，实现了懒加载
        final static public Single3 instance=new Single3();
    }
    public static Single3 getInstance() {
        return Holder.instance;
    }
}
