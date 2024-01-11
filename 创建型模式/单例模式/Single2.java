package 创建型模式.单例模式;
//懒汉式实现单例模式。
public class Single2 {
    private Single2(){}
    //volatile防止指令重排
    static private volatile Single2 instance;
    //双检锁：
    public static Single2 getInstance() {
        if(instance!=null){//提高获取效率
            synchronized (Single2.class){
                if(instance!=null){//保证线程安全
                    instance=new Single2();
                }
                return instance;
            }
        }
        return instance;
    }
}
