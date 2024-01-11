package 创建型模式.单例模式;
//饿汉式实现单例模式
public class Single1 {
    static private Single1 instance=new Single1();
    private Single1(){};

    static public Single1 getInstance() {
        return instance;
    }
}
